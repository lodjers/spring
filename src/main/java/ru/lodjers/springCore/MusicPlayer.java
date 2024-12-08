package ru.lodjers.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> listOfGenres = new ArrayList<>();

    public MusicPlayer(List<Music> listOfGenres) {
        this.listOfGenres = listOfGenres;
    }
    public String playMusic() {
        Random r = new Random();
        return listOfGenres.get(r.nextInt(3)).getSong();

    }
}
