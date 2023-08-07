package org.example.seminar6HW;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        menu();


    }
    public static void choice (int num){
        switch (num){
            case 1:
                System.out.println(1);
                return;
            case 2:
                System.out.println(2);
                return;
            case 3:
                System.out.println(3);
                return;
            case 4:
                System.out.println(4);
                return;
            default:
                System.out.println("Вы ввели не корректные данные, попробуйте еще раз");
                menu();
        }
    }
    static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите интересующий вас параметр, нажав соответствующую цифру:");
        System.out.println("1 - Цвет\n2 - Операционная система\n3 - Размер HDD\n4 - Размер ОЗУ");
        int input = scanner.nextInt();
        choice(input);

    }
}
