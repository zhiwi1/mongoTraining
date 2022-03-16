package com.epam.training.persistence;

import com.epam.training.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface Repository extends MongoRepository<User,Long> {
   Optional<User> findUserById(Long id);

}
