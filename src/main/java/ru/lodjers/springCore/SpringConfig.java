package ru.lodjers.springCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration

@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }
    @Bean
    public List<Music> listOfGenres() {
        return Arrays.asList(classicalMusic(), rockMusic(), rapMusic());
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(listOfGenres());
    }
}
