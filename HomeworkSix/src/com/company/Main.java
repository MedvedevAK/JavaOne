package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Animal [] animals = {new Cat(),new Boby(),new Bob()};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Давай проверим насколько спортивные  пес Bob, пес Boby и КОТ?");
        System.out.println("Введите высоту прыжка:");
        double j = scanner.nextDouble();
        System.out.println("Введите дистанцию заплыва:");
        double s = scanner.nextDouble();
        System.out.println("Введите дистанцию бега:");
        double r = scanner.nextDouble();

        for (Animal animal: animals) {
            System.out.println(animal.jump(j));
            System.out.println(animal.swim(s));
            System.out.println(animal.run(r));


        }



    }

}
