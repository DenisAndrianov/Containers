package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList array = new ArrayList();

    public static void main(String[] args) {
        userSelect();
    }


    public static void userSelect () {
        System.out.println("[1] ---- Добавить ёмкость");
        System.out.println("[2] ---- Вывести результат");
        System.out.println("[3] ---- Очистить результат");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                array.add(inputContainer());
                System.out.println("Емкость добавлена");
                userSelect();
                return;
            case 2:
                Collections.sort(array);
                for (int i = 0; i < array.size(); i++) {
                    System.out.println(array.get(i));
                }
                userSelect();
                return;
            case 3:
                array.clear();
                System.out.println("Результаты очищены");
                userSelect();
                return;
            default:
                System.out.println("Неверное значение");
                userSelect();
                return;
        }
    }

    public static double input() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Неверное зачение");
            return input();
        }
    }

    public static Container inputContainer ()   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите основание емкости");
        System.out.println("[1] ---- Квадрат");
        System.out.println("[2] ---- Круг");
        System.out.println("[3] ---- Треугольник");
        switch (sc.nextInt())   {
            case 1:
                return new Square();
            case 2:
                return new Circle();
            case 3:
                return new Triangle();
            default:
                System.out.println("Вы ввели неверное значение");
                return inputContainer();
        }
    }

    public static Liquid inputLiquid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите жидкость");
        System.out.println("[1] ---- Вода");
        System.out.println("[2] ---- Бензин");
        System.out.println("[3] ---- Спирт");
        if (sc.hasNextInt()) {
            switch (sc.nextInt()) {
                case 1:
                    return new Water();
                case 2:
                    return new Petrol();
                case 3:
                    return new Alcohol();
                default:
                    System.out.println("Вы ввели неверное значение");
                    return inputLiquid();
            }
        }   else {
            System.out.println("Вы ввели неверное значение");
            return inputLiquid();
        }
    }
}

