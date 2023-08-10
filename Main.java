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
                choiceParam.getOsChoice();
                return;
            case 3:
                choiceParam.getHddChoice();
                return;
            case 4:
                choiceParam.getOzuChoice();
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

    static void printNotebook(Notebook notebook){
        System.out.println("Ноутбук: "+notebook.name);
        System.out.println("Цвет: "+notebook.color);
        System.out.println("Объем ОЗУ: "+notebook.ozu);
        System.out.println("Объем жесткого диска: "+notebook.hdd);
        System.out.println("Операционная система "+notebook.os);
        System.out.println();
    }
    public static Scanner scanner = new Scanner(System.in);
}
