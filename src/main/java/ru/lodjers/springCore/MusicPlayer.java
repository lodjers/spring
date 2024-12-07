package ru.lodjers.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") RockMusic rockMusic,
                       @Qualifier("classicalMusic") ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic =classicalMusic;
    }

    public RockMusic getRockMusic() {
        return rockMusic;
    }

    public ClassicalMusic getClassicalMusic() {
        return classicalMusic;
    }

    public String playMusic(TypeOfMusic typeOfMusic) {
        Random r = new Random();
        if (typeOfMusic == TypeOfMusic.CLASSICAL) {
            return classicalMusic.getClassicalMusicList().get(r.nextInt(3));
        } else {
            return rockMusic.getRockMusicList().get(r.nextInt(3));
        }
    }

}
