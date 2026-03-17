package com.oyenavneet.designpatterns.mementopatter.client;

import com.oyenavneet.designpatterns.mementopatter.caretaker.History;
import com.oyenavneet.designpatterns.mementopatter.originator.TextEditor;

public class MementoDemo {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello World ");
        history.save(editor.save());

        editor.write("How's going ");
        history.save(editor.save());

        editor.write("Is everything going well? ");

        System.out.println("Current: "+ editor.getContent());

        editor.restore(history.undo());

        System.out.println("After Undo: "+ editor.getContent());



    }
}
