package org.example.seminar6HW;

import java.util.*;

public class Filtration {

    private Map<Integer, Object> ozuMap;
    private Map<Integer, Object> hddMap;
    private Map<Integer,String> osMap;
    private Map<Integer,String>  colorMap;
    Filtration() {
        this.ozuMap   = new HashMap<>(Map.of(1,4,2,8,3,16,4, 32,
                                             5, "Вернуться назад"));
        this.hddMap   = new HashMap<>(Map.of(1,256, 2,512, 3, 1024, 4,2048,
                                             5, "Вернуться назад"));
        this.osMap    = new HashMap<>(Map.of(1,"Win 10",2,"Win 11",3, "Win 7",
                                             4,"Linux",5, "MacOS",6, "Вернуться назад"));
        this.colorMap = new HashMap<>(Map.of(1,"black",2, "gray", 3,"white",
                                             4, "red",5,"Вернуться назад"));
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
    public Map<Integer, String> getColorMap() {
        return this.colorMap;
    }
}
