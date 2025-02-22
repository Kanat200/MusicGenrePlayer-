package com.KanatSpringCourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> rockSongs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        rockSongs.add("Wind cries Mary");
        rockSongs.add("Paint it black");
        rockSongs.add("Can't seem to make you mine");
    }


    @Override
    public List<String> getSongs() {
        return rockSongs;
    }
}
