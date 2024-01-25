package org.sprframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MusicPlayer {
//указатель для поля
//        @Autowired
//        @Qualifier("rockMusic")
@Value("${musicPlayer.name}")
    private String name;
@Value("${musicPlayer.volume}")
    private int value;

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    private Music music1;
    private Music music2;
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
       return "playing: " + music1.getSong()+", "+music2.getSong();
    }

}
