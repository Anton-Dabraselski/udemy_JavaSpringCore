package org.example.udemy_spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class RussianMusic implements Music{
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Алла пугачева - Миллион алых роз");
        songs.add("Лепс - Рюмка водки на столе");
        songs.add("Егор крид - Берегу");
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
