package ru.lodjers.springCore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> classicalMusicList = new ArrayList<>();

    public List<String> getClassicalMusicList() {
        return classicalMusicList;
    }

    public void setClassicalMusicList(List<String> classicalMusicList) {
        this.classicalMusicList = classicalMusicList;
    }

    @Override
    public String getSong() {
        return classicalMusicList.toString();
    }
}
