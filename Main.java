package org.example.seminar6HW;



import java.util.Scanner;

public class Main {
        public static void main(String[] args) {


        menu();


    }
    static void choice (int num){
        Data choiceParam = new Data();
        switch (num){
            case 1:
                choiceParam.getColorChoice();
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

        System.out.println("Выберите интересующий вас параметр, нажав соответствующую цифру:");
        System.out.println("1 - Цвет\n2 - Операционная система\n3 - Размер HDD\n4 - Размер ОЗУ");
        int input = Main.scanner.nextInt();
        choice(input);
    }
    public static Scanner scanner = new Scanner(System.in);
}
