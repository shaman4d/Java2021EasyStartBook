package com.company;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5)
        {
            System.out.println("Считаю "+i);
            i++;
        }

        while(i-- > 1)
        {
            System.out.println("Считаю назад "+i);
        }

        int t = -1;
        do {
            System.out.println("Да-да я работаю!");
        }while (t > 0);


    }
}
