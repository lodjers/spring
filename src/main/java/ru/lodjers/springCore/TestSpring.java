package ru.lodjers.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        ClassicalMusic classicalMusic = context.getBean("ClassicalMusicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
//        Music music = context.getBean("musicBean", Music.class);

//        MusicPlayer musicPlayer  = new MusicPlayer(music);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer1.setVolume(10);
//        System.out.println(musicPlayer1.getVolume());
//        System.out.println(musicPlayer2.getVolume());

        context.close();
    }
}
