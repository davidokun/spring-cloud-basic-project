package com.singletonapps.publisher.controller;

import com.singletonapps.publisher.model.Publisher;
import com.singletonapps.publisher.service.PublisherService;
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
    private PublisherService publisherService;


    @GetMapping
    public List<Publisher> getAllPublishers(){

        return publisherService.getPublishers();
    }

    @GetMapping("/{id}")
    public Publisher getPublisherById(@PathVariable int id){

        return publisherService.getPublisher(id);
    }
}
