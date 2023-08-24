package dev.xettabie.khuda.lagche;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "products")
public class Product {
    private ObjectId id;
    private String name;
    private String description;
    private int price;
}
