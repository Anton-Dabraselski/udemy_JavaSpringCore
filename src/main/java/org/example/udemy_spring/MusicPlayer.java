package org.example.udemy_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList;

    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

//    private Music musicClassic;
//    private Music musicRock;
//    private Music musicRuss;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

//    @Autowired
//    public MusicPlayer(@Qualifier("classicalMusic") Music musicClassic,
//                       @Qualifier("rockMusic") Music musicRock,
//                       @Qualifier("russianMusic") Music musicRuss) {
//        this.musicClassic = musicClassic;
//        this.musicRock = musicRock;
//        this.musicRuss = musicRuss;
//    }

    public String playMusic(){
        Random random = new Random();
        int randNum = random.nextInt(3);

//        if(typesMusic == TypesMusic.CLASSICAL){
//            System.out.println(musicClassic.getSongs().get(randNum));
//        }else if(typesMusic == TypesMusic.ROCK){
//            System.out.println(musicRock.getSongs().get(randNum));
//        }else {
//            System.out.println(musicRuss.getSongs().get(randNum));
//        }

        return "Playing: " + musicList.get(random.nextInt(3)).getSongs().get(random.nextInt(3)) + " with volume " + this.volume;
    }
}
