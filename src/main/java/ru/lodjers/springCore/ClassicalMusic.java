package ru.lodjers.springCore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music{
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
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
