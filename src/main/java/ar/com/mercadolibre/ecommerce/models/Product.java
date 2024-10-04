package ar.com.mercadolibre.ecommerce.models;

import lombok.Data;

@Data
public class Product {
    private String id;
    private String name;
    private Double price;
 }