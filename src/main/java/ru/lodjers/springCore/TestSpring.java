package ru.lodjers.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

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
        List<String> list1 = new ArrayList<>();
        list1.add("aa");
        list1.add("bb");
        list1.add("cc");
        List<String> list2 = new ArrayList<>();
        list2.add("dd");
        list2.add("ee");
        list2.add("ff");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.getClassicalMusic().setClassicalMusicList(list1);
        musicPlayer.getRockMusic().setRockMusicList(list2);
        System.out.println(musicPlayer.playMusic(TypeOfMusic.CLASSICAL));
        context.close();
    }
}
