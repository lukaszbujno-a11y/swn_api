package com.example.demo.ws.rest.api.mappers;

import com.example.demo.db.model.KorektaDb;
import com.example.demo.gen.rest.api.model.NiezgodnoscKorekta;
import com.example.demo.repository.KorektaRepo;

import java.util.ArrayList;
import java.util.List;

public class MapUtil {
    public static NiezgodnoscKorekta toNiezgodnoscKorekta(KorektaDb daoKorektaDb){
        NiezgodnoscKorekta niezgodnoscKorekta = new NiezgodnoscKorekta();
        niezgodnoscKorekta.setIdNiezgodnosci(daoKorektaDb.getIdNiezgodnosci());
        niezgodnoscKorekta.setCzyKorekta(daoKorektaDb.getCzyKorekta());
        return niezgodnoscKorekta;
    }

    public static List<NiezgodnoscKorekta> toNiezgodnoscKorektyLista(List<KorektaDb> daoKorektaDb){
        List<NiezgodnoscKorekta> niezgodnoscKorektaList = new ArrayList<>();
        for (KorektaDb korektaDb : daoKorektaDb){
            niezgodnoscKorektaList.add(toNiezgodnoscKorekta(korektaDb));
        }
        return niezgodnoscKorektaList;
    }
}
