package com.epam.training.model;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
public class User {
    @Id
    private Long id;
    private String name;


}
