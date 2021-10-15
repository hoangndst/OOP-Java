package com.example.week6;

interface test {
    void draw();
    void erase();
}

public class solid implements test {
    @Override
    public void draw() {
        System.out.println("Drawing");
    }

    @Override
    public void erase() {
        System.out.println("Erasing");
    }
}