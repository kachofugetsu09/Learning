package COLLECTION;
import java.util.*;

public class IterableClass implements Iterable<String>{
    protected String[] word =("And that is how we know the world".split(""));
    public Iterator<String> iterator(){
        return new Iterator<String>(){
            private int index=0;
            public boolean hasNext(){
                return index< word.length;
            }
            public String next(){
                return word[index++];

            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args){
        for(String s:new IterableClass()){
            System.out.print(s+" ");
        }
    }

}
