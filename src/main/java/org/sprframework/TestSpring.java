package org.sprframework;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//       Music music= context.getBean("musicBean",Music.class);
//        MusicPlayer musicPlayer =new MusicPlayer(music);

        Music music=context.getBean("musicBean",Music.class);
//        System.out.println(music.getSong());
        Music rockMusic=context.getBean("rockMusic",Music.class);
//        System.out.println(rockMusic.getSong());

        MusicPlayer musicPlayer=new MusicPlayer(music);
        musicPlayer.playMusic();
        MusicPlayer rockMusicPlayer=new MusicPlayer(rockMusic);
        rockMusicPlayer.playMusic();
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//
//        boolean comparison =firstMusicPlayer==secondMusicPlayer;
//
//        System.out.println(comparison);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(secondMusicPlayer.getVolume());
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
