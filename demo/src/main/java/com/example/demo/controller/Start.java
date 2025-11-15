package com.example.demo.controller;

import com.example.demo.db.model.KorektaDb;
import com.example.demo.gen.rest.api.model.NiezgodnoscKorekta;
import com.example.demo.repository.KorektaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Start {
    private KorektaRepo korektaRepo;

    @Autowired
    public Start(KorektaRepo korektaRepo){
        this.korektaRepo = korektaRepo;
        korektaRepo.save(new KorektaDb(1, NiezgodnoscKorekta.CzyKorektaEnum.T,"1","1"));
        korektaRepo.save(new KorektaDb(2, NiezgodnoscKorekta.CzyKorektaEnum.T,"2","2"));
        korektaRepo.save(new KorektaDb(3, NiezgodnoscKorekta.CzyKorektaEnum.T,"3","3"));
        korektaRepo.save(new KorektaDb(4, NiezgodnoscKorekta.CzyKorektaEnum.T,"4","4"));
    }
}
