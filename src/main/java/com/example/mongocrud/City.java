package com.example.mongocrud;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "city")
@Data
@AllArgsConstructor
public class City {
    @Id
    private ObjectId id;
    private String name;
    private String latitude;
    private String longitude;
    private int population;
    private String region;
}
