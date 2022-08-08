package org.example.udemy_spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Wind cries Mary");
        songs.add("Paint it black");
        songs.add("Can't seem to make you mine");
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
