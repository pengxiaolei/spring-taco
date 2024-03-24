package com.taco.gateway.model;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Locale;

@Data
public class Taco {
    private Long id;
    private Date createAt;
    private String name;
    private List<Ingredient> ingredients;

}
