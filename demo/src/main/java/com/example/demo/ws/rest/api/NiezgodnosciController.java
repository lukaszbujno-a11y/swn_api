package com.example.demo.ws.rest.api;

import com.example.demo.gen.rest.api.model.NiezgodnoscKorekta;
import com.example.demo.gen.rest.api.model.NiezgodnosciKorektyResponse;
import com.example.demo.gen.rest.api.model.NiezgodnosciResponse;
import com.example.demo.ws.rest.api.impl.NiezgodnosciApiImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NiezgodnosciController
{

    NiezgodnosciApiImpl niezgodnosciApiImpl;

    @GetMapping("/niezgodnosci")
    public String demo(@RequestParam(defaultValue = "Worlddd") String name) {
        return "aa";
    }

    @GetMapping("/niezgodnosci/{cykl_id}")
    public String demo2(@PathVariable String cykl_id) {
        return cykl_id;
    }

    @GetMapping("/niezgodnosci/{cykl_id}/{pakiet_id}")
    public ResponseEntity<NiezgodnosciResponse> demo3(@PathVariable String cykl_id, @PathVariable String pakiet_id) {
        niezgodnosciApiImpl = new NiezgodnosciApiImpl();
        return niezgodnosciApiImpl.niezgodnosciCyklIdPakietIdGet(cykl_id, pakiet_id);
    }

    @GetMapping("/niezgodnosci/{cykl_id}/korekty/{pakiet_id}")
    public ResponseEntity<NiezgodnosciKorektyResponse> demo4(@PathVariable String cykl_id, @PathVariable String pakiet_id) {
        return niezgodnosciApiImpl.niezgodnosciCyklIdKorektyPakietIdGet(cykl_id, pakiet_id);
    }
}
