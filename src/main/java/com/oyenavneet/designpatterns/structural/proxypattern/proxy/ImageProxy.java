package com.oyenavneet.designpatterns.proxypattern.proxy;

import com.oyenavneet.designpatterns.proxypattern.real.RealImage;
import com.oyenavneet.designpatterns.proxypattern.subject.Image;

public class ImageProxy implements Image {

    private RealImage realImage;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
