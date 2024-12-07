package ru.lodjers.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    @Autowired
    public void setClassicalMusic(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
    }
    public void playMusicList() {
//
        musicList.forEach(el -> System.out.println("Playing: " + el.getSong()));
    }
}
