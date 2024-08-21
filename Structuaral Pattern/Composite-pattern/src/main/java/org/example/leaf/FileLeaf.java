package org.example.leaf;

import org.example.interfaces.FileComponent;

public class FileLeaf implements FileComponent {
    private String name;
    private long size;

    public FileLeaf(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showProperty() {
        System.out.println("FileLeaf [name=" + this.name + ", size=" + this.size + "]");
    }

    @Override
    public long totalSize() {
        return this.size;
    }
}
