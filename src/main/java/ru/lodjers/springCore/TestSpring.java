package ru.lodjers.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        Music music = context.getBean("rockMusic", Music.class);
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        System.out.println(music.getSong());
//        System.out.println(music2.getSong());
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}
