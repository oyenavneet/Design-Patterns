package com.oyenavneet.designpatterns.iteratorpattern.iterator;

import com.oyenavneet.designpatterns.iteratorpattern.model.Song;

public interface SongIterator {

    boolean hasNext();

    Song next();
}
