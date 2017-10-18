package com.singletonapps.publisher.controller;

import com.singletonapps.publisher.model.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/publisher")
public class PublisherController {

    @Autowired
    private Publisher publisher;

    @GetMapping
    public List<Publisher> getAllPublishers(){
        return null;
    }

    @GetMapping("/{id}")
    public Publisher getPublisherById(@PathVariable long id){
        publisher.setId(id);
        return publisher;
    }
}
