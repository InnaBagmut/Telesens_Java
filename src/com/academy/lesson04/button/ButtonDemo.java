package com.academy.lesson04.button;

public class ButtonDemo {
    public static void main(String[] args) {
        Button button1 = new Button();
        Button button2 = new Button("Blue");
        Button button3k = new Button("Login", "Blue", 10);
        button1.text = "login";
        System.out.println(button1.text);
        button1.setHeight(25);
        button1.setHeight(-100);
        //button1.height += 5;
       // System.out.println(button1.getHeight());
    }

}
