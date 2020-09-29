package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int age = 0;
        do {
            System.out.println("Для доступа к разделу введите ваш возраст:");
            Scanner scn = new Scanner(System.in);
            if (!scn.hasNextInt()) {
                System.out.println("Вам нужно ввести целое число.");
                continue;
            }
            age = scn.nextInt();
            if (age < 1)
                System.out.println("Вы еще не родились?");
            if (age > 115)
                System.out.println("На планете Земля еще не был зарегистрирован такой долгожитель!");
        }
        while (age < 1 || age > 115);
        if (age < 18)
            System.out.println("Вам надо еще немного подрасти.");
        else
            System.out.println("[Тут может быть смешная взрослая шутка]");
    }
}
