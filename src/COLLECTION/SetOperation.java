package COLLECTION;

import java.util.*;

public class SetOperation {
    public static void main(String[] args){
        Set<String> set1= new HashSet<String>();
        Collections.addAll(set1,"1","2","3","6","7");
        set1.add("9");
        Set<String> set2=new HashSet<String>();
        Collections.addAll(set2,"8","2","3","6","7");
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set1.containsAll(set2));

    }
}

