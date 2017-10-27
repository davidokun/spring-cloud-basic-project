package com.singletonapps.publisher.service;

import com.singletonapps.publisher.model.Publisher;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class PublisherService {


    private List<Publisher> publisherList;

    @PostConstruct
    public void init(){

        publisherList = new ArrayList<>();

        publisherList.add(new Publisher(1, "Nintendo"));
        publisherList.add(new Publisher(2, "SquareSoft"));


    }


    public List<Publisher> getPublishers(){

        return publisherList;
    }


    public Publisher getPublisher(int id){

        return publisherList.get(id);
    }

}
