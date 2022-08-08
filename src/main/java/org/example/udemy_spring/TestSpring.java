package org.example.udemy_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());
        System.out.println(musicPlayer.playMusic());
        System.out.println(musicPlayer.playMusic());


//        musicPlayer.playMusic(TypesMusic.CLASSICAL);
//        musicPlayer.playMusic(TypesMusic.ROCK);
//        musicPlayer.playMusic(TypesMusic.RUSSIAN);

        context.close();
    }
}
