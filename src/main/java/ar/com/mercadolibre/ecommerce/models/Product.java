package ar.com.mercadolibre.ecommerce.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // Genera un constructor con todos los campos
@NoArgsConstructor  // Genera un constructor por defecto
public class Product {
    private String id;
    private String name;
    private Double price;
}
