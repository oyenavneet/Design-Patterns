package com.oyenavneet.designpatterns.compositpattern.client;

import com.oyenavneet.designpatterns.compositpattern.composit.Folder;
import com.oyenavneet.designpatterns.compositpattern.leaf.File;

public class FileSystemClient {

    public static void main(String[] args) {

        File file1 = new File("testFile.pdf");
        File file2 = new File("Document.txt");

        Folder documents = new Folder("Documents");

        documents.add(file1);
        documents.add(file2);
        Folder root = new Folder("Root");

        root.add(documents);
        root.add(new File("note.pdf"));

        root.showDetails();
    }
}
