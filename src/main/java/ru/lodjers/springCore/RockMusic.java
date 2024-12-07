package ru.lodjers.springCore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> rockMusicList = new ArrayList<>();
    public List<String> getRockMusicList() {
        return rockMusicList;
    }

    public void setRockMusicList(List<String> rockMusicList) {
        this.rockMusicList = rockMusicList;
    }
    @Override
    public String getSong() {
        return rockMusicList.toString();
    }
}

