package com.oyenavneet.designpatterns.compositpattern.composit;

import com.oyenavneet.designpatterns.compositpattern.component.FileSystemComponent;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + this.name);

        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }

}
