package com.oyenavneet.designpatterns.iteratorpattern.aggregate;

import com.oyenavneet.designpatterns.iteratorpattern.iterator.PlaylistIterator;
import com.oyenavneet.designpatterns.iteratorpattern.iterator.SongIterator;
import com.oyenavneet.designpatterns.iteratorpattern.model.Song;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Song> songs = new ArrayList<Song>();

    public void addSong(String title) {
        songs.add(new Song(title));
    }

    public SongIterator createSongIterator() {
        return new PlaylistIterator(songs);
    }
}
