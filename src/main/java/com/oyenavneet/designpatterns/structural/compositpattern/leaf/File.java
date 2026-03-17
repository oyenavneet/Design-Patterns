package com.oyenavneet.designpatterns.compositpattern.leaf;

import com.oyenavneet.designpatterns.compositpattern.component.FileSystemComponent;

public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + this.name);
    }
}
