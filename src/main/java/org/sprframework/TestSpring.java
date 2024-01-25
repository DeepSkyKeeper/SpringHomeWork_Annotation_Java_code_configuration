package org.sprframework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);


//        MusicPlayer2 musicPlayer2 = context.getBean("musicPlayer2",MusicPlayer2.class);
//        musicPlayer2.playMusic();

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getValue());

        ClassicalMusic classicalMusic1 =context.getBean("classicalMusic",ClassicalMusic.class);

//        ClassicalMusic classicalMusic2 =context.getBean("classicalMusic",ClassicalMusic.class);

//        System.out.println(classicalMusic1==classicalMusic2);
        context.close();
    }
}
