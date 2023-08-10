package org.example.seminar6HW;

import java.util.*;

public class Data {

    private Map<Integer, Object> ozuMap;
    private Map<Integer, Object> hddMap;
    private Map<Integer,String> osMap;
    private Map<Integer,String>  colorMap;
    int getChoice;
    List<Notebook> notebooksList;
//    Scanner sc = new Scanner(System.in);
    Data() {
        this.ozuMap   = new HashMap<>(Map.of(1,4,2,8,3,16,4, 32,
                                             5, "Вернуться назад"));
        this.hddMap   = new HashMap<>(Map.of(1,256, 2,512, 3, 1024, 4,2048,
                                             5, "Вернуться назад"));
        this.osMap    = new HashMap<>(Map.of(1,"Win 10",2,"Win 11",3, "Win 7",
                                             4,"Linux",5, "MacOS",6, "Вернуться назад"));
        this.colorMap = new HashMap<>(Map.of(1,"black",2, "gray", 3,"white",
                                             4, "red",5,"Вернуться назад"));
        this.notebooksList = getNotebooksList();
    }
     public static List<Notebook>  getNotebooksList(){
        Notebook one = new Notebook("One","white", "Win 10", 1024, 8);
        Notebook two = new Notebook("Two","black", "Win 10", 512, 16);
        Notebook three = new Notebook("Three","gray", "Linux", 256, 4);
        Notebook four = new Notebook("Four","white", "MacOS", 1024, 16);
        Notebook five = new Notebook("Five","red", "Win 10", 2048, 32);
        Notebook six = new Notebook("Six","black", "Linux", 1024, 8);
        Notebook seven = new Notebook("Seven","gray", "Win 11", 1024, 16);
        Notebook eight = new Notebook("Eight","red", "Win 11", 512, 8);
        Notebook nine = new Notebook("Nine","black", "MacOS", 2024, 32);
        Notebook ten = new Notebook("Ten","white", "Linux", 512, 16);
        Notebook eleven = new Notebook("Eleven","gray", "Linux", 256, 4);

        List<Notebook> notebooksLst = new ArrayList<>(Arrays.asList(one,two,three,four,five,
                six,seven,eight,nine,ten,eleven));
        return notebooksLst;
    }
    public void getOzuChoice() {
        System.out.println("Выберите минимальный объем ОЗУ:");
        for (Map.Entry<Integer, Object> entry : ozuMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " Гб");
        }
        getChoice = Main.scanner.nextInt();
        if(getChoice == 5){Main.menu();}
        else {
            for (Notebook notebook : this.notebooksList) {
                if(notebook.ozu >= (int)ozuMap.get(getChoice)){
                    printNotebook(notebook);
                }
            }
        }
    }
    public void getHddChoice() {
        System.out.println("Выберите минимальный объем HDD:");
        for (Map.Entry<Integer, Object> entry : hddMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " Гб");
        }
        getChoice = Main.scanner.nextInt();
        if(getChoice == 5){Main.menu();}
        else {
            for (Notebook notebook : this.notebooksList) {
                if(notebook.hdd >= (int)hddMap.get(getChoice)){
                    printNotebook(notebook);
                }
            }
        }
    }
    public void getOsChoice() {
        System.out.println("Выберите нужную операционную систему:");
        for (Map.Entry<Integer, String> entry : osMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        getChoice = Main.scanner.nextInt();
        if(getChoice == 6){Main.menu();}
        else {
            for (Notebook notebook : this.notebooksList) {
                if(notebook.os.contains(osMap.get(getChoice))){
                    printNotebook(notebook);
                }
            }
        }
    }

    public void getColorChoice() {

        System.out.println("Выберите нужный цвет:");
        for (Map.Entry<Integer, String> entry : colorMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        getChoice = Main.scanner.nextInt();
        if(getChoice == 5){Main.menu();}
        else {
            for (Notebook notebook : this.notebooksList) {
                if(notebook.color.contains(colorMap.get(getChoice))){
                    printNotebook(notebook);
                }
            }
        }
    }
    void printNotebook(Notebook notebook){
        System.out.println("Ноутбук: "+notebook.name);
        System.out.println("Цвет: "+notebook.color);
        System.out.println("Объем ОЗУ: "+notebook.ozu);
        System.out.println("Объем жесткого диска: "+notebook.hdd);
        System.out.println("Операционная система "+notebook.os);
        System.out.println();
    }
}

