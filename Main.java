package org.example.seminar6HW;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        menu();


    }
    static void choice (int num){
        Filtration choiceParam = new Filtration();
        switch (num){
            case 1:
                System.out.println(choiceParam.getColorMap());
                return;
            case 2:
                System.out.println(choiceParam.getOsMap());
                return;
            case 3:
                System.out.println(choiceParam.getHddMap());
                return;
            case 4:
                System.out.println(choiceParam.getOzuMap());
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
