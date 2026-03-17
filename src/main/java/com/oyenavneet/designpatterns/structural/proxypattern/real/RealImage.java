package com.oyenavneet.designpatterns.proxypattern.real;

import com.oyenavneet.designpatterns.proxypattern.subject.Image;

public class RealImage implements Image {

    private String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
        this.loadImageFromDisk();

    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image " + fileName);
    }
}
