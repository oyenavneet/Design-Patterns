package com.oyenavneet.designpatterns.prototypepattern.model;

public class Document implements Prototype{

    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }


    @Override
    public Document clone() {
        return new Document(this.title, this.content);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print(){
        System.out.println(title + " : " + content);
    }
}
