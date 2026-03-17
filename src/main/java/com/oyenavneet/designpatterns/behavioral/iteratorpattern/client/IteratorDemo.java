package com.oyenavneet.designpatterns.iteratorpattern.client;

import com.oyenavneet.designpatterns.iteratorpattern.aggregate.Playlist;
import com.oyenavneet.designpatterns.iteratorpattern.iterator.SongIterator;

public class IteratorDemo {

    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        playlist.addSong("Song A");
        playlist.addSong("Song B");
        playlist.addSong("Song C");

        SongIterator iterator = playlist.createSongIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }

    }
}
