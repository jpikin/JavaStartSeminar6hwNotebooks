package org.example.seminar6HW;

import java.util.*;

public class Filtration {

    Map<Integer, Integer> ozuMap = new HashMap<>(Map.of(1,4,2,8,3,16,4, 32));
    Map<Integer, Integer> hddMap = new HashMap<>(Map.of(1,256, 2,512, 3, 1024, 4,2048));
    Map<Integer,String> osMap = new HashMap<>(Map.of(1,"Win 10",2,"Win 11",3, "Win 7",
                                                      4,"Linux",5, "MacOS"));
    Map<Integer,String>  colorMap = new HashMap<>(Map.of(1,"black",2, "gray", 3,"white",
                                                          4, "red"));

}
