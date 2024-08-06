package org.example.proxy;

import org.example.interfaces.Image;

public class ProxyImage implements Image {
    private final String fileName;
    private org.example.entity.Image realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new org.example.entity.Image(fileName);
        }
        realImage.display();
    }
}
