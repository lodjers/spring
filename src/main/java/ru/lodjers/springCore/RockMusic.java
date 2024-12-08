package ru.lodjers.springCore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music{
    public String getSong() {
        return "Wind Cries Mary";
    }
}

