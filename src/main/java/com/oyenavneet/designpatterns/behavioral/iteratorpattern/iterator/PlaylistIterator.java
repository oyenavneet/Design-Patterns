package com.oyenavneet.designpatterns.iteratorpattern.iterator;


import com.oyenavneet.designpatterns.iteratorpattern.model.Song;

import java.util.List;

public class PlaylistIterator implements SongIterator {

    private List<Song> songs;
    private int position = 0;

    public PlaylistIterator(List<Song> songs) {
        this.songs = songs;
    }


    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }
}
