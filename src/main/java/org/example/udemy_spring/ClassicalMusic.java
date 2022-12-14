package org.example.udemy_spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

@Component
//@Scope("prototype")
public class ClassicalMusic implements Music{
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization...");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destroying...");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

}
