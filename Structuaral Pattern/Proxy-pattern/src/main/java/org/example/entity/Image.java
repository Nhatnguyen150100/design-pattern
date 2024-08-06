package org.example.entity;

public class Image implements org.example.interfaces.Image{
    private final String fileName;

    public Image(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading from disk..." + this.fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying" + this.fileName);
    }
}
