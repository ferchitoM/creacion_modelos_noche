package com.example.creacion_modelos_noche.models;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private String  name;
    private Long    price;
    private String  image;
    private Map<String, Long> sizes;

    public Product(String name, Long price, String image, Map<String, Long> sizes) {
        this.name = name;
        this.price = price;
        this.image = image;
        this.sizes = sizes;
    }

    public Product(){
        this.name = "";
        this.price = 0L;
        this.image = "";
        this.sizes = defaultSizes();
    }

    static public Map<String, Long> defaultSizes(){
        Map<String, Long> defaultSizes = new HashMap<>();
        defaultSizes.put("Porción", 10500L);
        defaultSizes.put("Grande", 15000L);
        defaultSizes.put("Extra Grande", 20000L);
        defaultSizes.put("Familiar", 25000L);
        defaultSizes.put("Extra Familiar", 30000L);

        return defaultSizes;
    }

}
