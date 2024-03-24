package com.taco.gateway.model;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class TacoOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Date placeAt;

    private String deliverName;
    private String deliverStreet;
    private String deliverCity;
    private String deliverState;
    private String deliverZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }
}

