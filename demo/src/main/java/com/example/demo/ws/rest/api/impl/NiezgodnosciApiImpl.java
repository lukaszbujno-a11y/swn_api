package com.example.demo.ws.rest.api.impl;

import com.example.demo.gen.rest.api.NiezgodnosciApi;
import com.example.demo.gen.rest.api.model.*;
import com.example.demo.repository.KorektaRepo;
import com.example.demo.ws.rest.api.mappers.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Service
public class NiezgodnosciApiImpl implements NiezgodnosciApi {

    @Autowired
    private KorektaRepo korektaRepo;

    public NiezgodnosciApiImpl(KorektaRepo korektaRepo){
        this.korektaRepo = korektaRepo;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return NiezgodnosciApi.super.getRequest();
    }

    @Override
    public ResponseEntity<NiezgodnosciKorektyResponse> niezgodnosciCyklIdKorektyPakietIdGet(String cyklId, String pakietId) {
        NiezgodnosciKorektyResponse niezgodnosciKorektyResponse = new NiezgodnosciKorektyResponse(Sukces.NUMBER_1,MapUtil.toNiezgodnoscKorektyLista(korektaRepo.findByCyklIdAndPakietId(cyklId,pakietId)));
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
