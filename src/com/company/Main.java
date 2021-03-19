package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.io.IOException;

public class Main {

    String[] array1= {"mama","myla","ramu"};
    String[] array2= {"I","very","love","java"};
    String[] array3= {"one","two","three"};

    List<String[]> strings= new ArrayList<>(List.of(array1,array2,array3));

    /*
    Comparator<String[]> comparator = new Comparator<String[]>() {
        @Override
        public int compare(String[] o1, String[] o2) {
            return o1.length-o2.length;
        }
    };

     */

    //Comparator<String[]> comparator= ((o1, o2) -> o1.length- o2.length);






}
