package com.example.demo.db.model;

import com.example.demo.gen.rest.api.model.NiezgodnoscKorekta;
import jakarta.persistence.*;

@Entity
@Table(name = "SWN_KOREKTA")
public class KorektaDb extends NiezgodnoscKorekta{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private Integer idNiezgodnosci;
    private String cyklId;
    private String pakietId;

    private NiezgodnoscKorekta.CzyKorektaEnum czyKorekta;
    public KorektaDb(){

    }
    public KorektaDb(Integer idNiezgodnosci, NiezgodnoscKorekta.CzyKorektaEnum czyKorekta, String cyklId, String pakietId){
        this.idNiezgodnosci=idNiezgodnosci;
        this.czyKorekta=czyKorekta;
        this.cyklId = cyklId;
        this.pakietId = pakietId;
    }
    public Integer getIdNiezgodnosci(){
        return this.idNiezgodnosci;
    }
    public NiezgodnoscKorekta.CzyKorektaEnum getCzyKorekta(){
        return this.czyKorekta;
    }

}
