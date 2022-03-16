package com.epam.training.persistence;

import com.epam.training.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class Dao {
    private MongoTemplate mongoTemplate;

    public List<User> find() {
        return mongoTemplate.findAll(User.class);

    }
}
