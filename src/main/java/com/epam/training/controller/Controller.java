package com.epam.training.controller;

import com.epam.training.model.User;
import com.epam.training.persistence.Dao;
import com.epam.training.persistence.Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("v1/test")
@RequiredArgsConstructor
public class Controller {
    private final Dao dao;
private final Repository repository;
    @GetMapping
    public List<User> getResource() {
        return dao.find();
    }
    @PostConstruct
    public void init(){
        repository.save(new User(1L,"123"));
    }
}
