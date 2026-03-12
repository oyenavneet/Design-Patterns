package com.oyenavneet.designpatterns.proxypattern.client;

import com.oyenavneet.designpatterns.proxypattern.proxy.ImageProxy;
import com.oyenavneet.designpatterns.proxypattern.subject.Image;

public class ImageViewer {


    public static void main(String[] args) {
        Image image = new ImageProxy("profile.png");
        System.out.println("image obj created");

        image.display();

        System.out.println("Displaying again");

        image.display();

        /*
            - Output
                image obj created
                Loading image from disk profile.png
                Displaying image profile.png
                Displaying again
                Displaying image profile.png

            - in above emaple
                Image loads only once
                Second call does not reload

         */

    }
}
