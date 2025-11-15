package com.example.demo.ws.rest.api.impl;

import com.example.demo.gen.rest.api.NiezgodnosciApi;
import com.example.demo.gen.rest.api.model.*;
import io.swagger.v3.oas.annotations.servers.Servers;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Service
public class NiezgodnosciApiImpl implements NiezgodnosciApi {

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return NiezgodnosciApi.super.getRequest();
    }

    @Override
    public ResponseEntity<NiezgodnosciKorektyResponse> niezgodnosciCyklIdKorektyPakietIdGet(String cyklId, String pakietId) {
        NiezgodnosciKorektyResponse niezgodnosciKorektyResponse = new NiezgodnosciKorektyResponse();
        niezgodnosciKorektyResponse.addKorektyItem(new NiezgodnoscKorekta(1, NiezgodnoscKorekta.CzyKorektaEnum.T));
        niezgodnosciKorektyResponse.addKorektyItem(new NiezgodnoscKorekta(2, NiezgodnoscKorekta.CzyKorektaEnum.T));
        niezgodnosciKorektyResponse.addKorektyItem(new NiezgodnoscKorekta(3, NiezgodnoscKorekta.CzyKorektaEnum.N));
        niezgodnosciKorektyResponse.addKorektyItem(new NiezgodnoscKorekta(4, NiezgodnoscKorekta.CzyKorektaEnum.T));
        niezgodnosciKorektyResponse.addKorektyItem(new NiezgodnoscKorekta(5, NiezgodnoscKorekta.CzyKorektaEnum.N));
        return ResponseEntity.ok(niezgodnosciKorektyResponse);
    }

    @Override
    public ResponseEntity<OdpowiedziResponse> niezgodnosciCyklIdOdpowiedziPost(String cyklId, Integer X_LICZBA_ODPOWIEDZI_W_PAKIECIE, Integer X_LICZBA_ODPOWIEDZI_W_CYLKU, OdpowiedziRequest odpowiedziRequest) {
        return NiezgodnosciApi.super.niezgodnosciCyklIdOdpowiedziPost(cyklId, X_LICZBA_ODPOWIEDZI_W_PAKIECIE, X_LICZBA_ODPOWIEDZI_W_CYLKU, odpowiedziRequest);
    }

    @Override
    public ResponseEntity<NiezgodnosciResponse> niezgodnosciCyklIdPakietIdGet(String cyklId, String pakietId) {
        return NiezgodnosciApi.super.niezgodnosciCyklIdPakietIdGet(cyklId, pakietId);
    }
}
