package com.oyenavneet.designpatterns.mementopatter.originator;

import com.oyenavneet.designpatterns.mementopatter.memento.EditorMemento;

public class TextEditor {
    private String content = "";

    public void write(String text) {
        content += text;
    }

    public String getContent() {
        return content;
    }

    public EditorMemento save() {
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        content = memento.getSavedContent();
    }
}
