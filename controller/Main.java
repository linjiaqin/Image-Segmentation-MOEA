package controller;

import model.functions.ImageLoader;

import java.awt.*;

public class Main {
    public static void main(String... args) {
        ImageLoader image = new ImageLoader();
        image.loadImage("86016.jpg");

        Color[][] pixels = image.getPixels();
        /*
        for(Color[] i : pixels) {
            for(Color j : i) {
                System.out.println(j);
            }
            System.out.println();
        }
        */

        System.out.println((int) 5.7);
    }
}
