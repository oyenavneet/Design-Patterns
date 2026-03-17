package com.oyenavneet.designpatterns.prototypepattern.controller;

import com.oyenavneet.designpatterns.prototypepattern.model.Document;
import com.oyenavneet.designpatterns.prototypepattern.registry.DocumentRegistry;

public class PrototypeExample {

    public static void main(String[] args) {
        Document doc1 = DocumentRegistry.getTemplate("resume");
        doc1.setTitle("Navneet resume");
        doc1.print();

        Document doc2 = DocumentRegistry.getTemplate("invoice");
        doc2.print();
    }
}
