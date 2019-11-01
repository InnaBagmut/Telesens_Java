package com.academy.lesson04.button;

public class Button {
    String text;
    String color;
    private int height;

    public Button() {
    }

    public  Button(String color){
        this.color = color;
    }

    public Button(String text, String color, int height) {
        this.text = text;
        this.color = color;
        this.height = height;
    }

    void setHeight(int value) {
        if (value < 0) {
            System.out.printf("Value %s should be positive %n", value);
        }
        height = value;
    }

    public void setText(String text) {
        this.text = text;
    }
}
