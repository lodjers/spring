package ru.lodjers.springCore;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

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

    public MusicPlayer() {}

    public void playMusicList() {
//        System.out.println("Playing: " + music.getSong());
        musicList.forEach(el -> System.out.println("Playing: " + el.getSong()));
    }
}
