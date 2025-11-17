package com.example.demo.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ValidationException;
import jakarta.validation.Validator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Set;


@Component
public class JsonSchemaValidator {
    private static final String SCHEMA_VALIDATION_FILE = "/schema/swn_pakiety.schema.json";

    private final JsonSchema jsonSchema;
    private final ObjectMapper mapper = new ObjectMapper();


    public JsonSchemaValidator() {
//        TODO: dać jako parametr
        try (InputStream is = getClass().getResourceAsStream(SCHEMA_VALIDATION_FILE)) {
            if (is == null) {
                throw new IllegalStateException("Schema file not found");
            }
            this.jsonSchema = JsonSchemaFactory
                    .getInstance(SpecVersion.VersionFlag.V7)
                    .getSchema(getClass().getResourceAsStream(SCHEMA_VALIDATION_FILE));
        } catch (Exception e) {
            throw new RuntimeException("Cannot load JSON Schema", e);
        }
    }

    public void validate(Object obj) {

        JsonNode jsonNode = mapper.valueToTree(obj);
        Set<ValidationMessage> errors = jsonSchema.validate(jsonNode);

        try {
            if (!errors.isEmpty()) {
                StringBuilder sb = new StringBuilder("JSON does not match schema: ");
                errors.forEach(err -> sb.append(err.getMessage()).append("; "));
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (Exception e) {
            throw new RuntimeException("Validation failed", e);
        }
    }
}


