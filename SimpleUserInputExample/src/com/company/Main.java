package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число:");
        if(scn.hasNextInt()) {
            int n = scn.nextInt();
            System.out.println("Вы ввели:" + n);
        }
        else
            System.out.println("Ну это определенно не число!");
    }
}
