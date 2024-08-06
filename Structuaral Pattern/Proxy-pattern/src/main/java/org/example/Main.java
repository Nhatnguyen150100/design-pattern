package org.example;

import org.example.interfaces.Image;
import org.example.proxy.ProxyImage;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_image.jpg");
        // Image will be loaded from disk
        image1.display();
    }
}