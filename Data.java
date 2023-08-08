package org.example.seminar6HW;

import java.util.*;

public class Data {

     private Map<Integer, Object> ozuMap;
     private Map<Integer, Object> hddMap;
     private Map<Integer,String> osMap;
     private Map<Integer,String>  colorMap;
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

        List<Notebook> notebooksLst = new ArrayList<>(Arrays.asList(one,two,three,four,five,
                six,seven,eight,nine,ten));
        return notebooksLst;
    }
    public Map<Integer, Object> getOzuMap() {
        return this.ozuMap;
    }
    public Map<Integer, Object> getHddMap() {
        return this.hddMap;
    }
    public Map<Integer, String> getOsMap() {
        return this.osMap;
    }

    public void getColorChoice() {
        int getChoice;
        System.out.println("Выберите нужный цвет:");
        for (Map.Entry<Integer, String> entry : colorMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        getChoice = Main.scanner.nextInt();
        if(getChoice == 5){Main.menu();}
        else {
            for (Notebook notebook : this.notebooksList) {
                if(notebook.color.contains(colorMap.get(getChoice))){
                    System.out.println("Ноутбук: "+notebook.name);
                    System.out.println("Цвет: "+notebook.color);
                    System.out.println("Объем ОЗУ: "+notebook.ozu);
                    System.out.println("Объем жесткого диска: "+notebook.hdd);
                    System.out.println("Операционная система "+notebook.os);
                    System.out.println();
                }
            }

        }
        }
        }

