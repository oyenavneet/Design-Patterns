package com.oyenavneet.designpatterns.mementopatter.caretaker;

import com.oyenavneet.designpatterns.mementopatter.memento.EditorMemento;

import java.util.Stack;

public class History {

    private Stack<EditorMemento> history = new Stack<>();

    public void save(EditorMemento memento) {
        history.push(memento);
    }

    public EditorMemento undo() {
        return history.pop();
    }
}
