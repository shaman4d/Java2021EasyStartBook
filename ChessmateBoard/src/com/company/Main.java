package com.company;

public class Main {
    public static void main(String[] args) {
        int width = 5;
        int height = 5;
        for (int i = 0; i < height; i++) {
            String line = "";
            for (int t = 0; t < width; t++) {
                if (i % 2 == 0)
                    line += t % 2 == 0 ? "#" : ".";
                else
                    line += t % 2 == 0 ? "." : "#";
            }
            System.out.println(line);
        }
    }
}
