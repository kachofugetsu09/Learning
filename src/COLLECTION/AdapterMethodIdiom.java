package COLLECTION;
import java.util.*;


public class AdapterMethodIdiom {
    public static void main(String[] args){
        ReversibleArrayList<String> ral=new ReversibleArrayList<>(Arrays.asList(("TO BE OR NOT TO BE").split(" ")));
        for(String s:ral){
            System.out.println(s+" ");

        }
        System.out.println();
        for(String s:ral.reversedIterable()){
            System.out.println(s+" ");
        }

    }

}
class ReversibleArrayList<T> extends ArrayList<T>{
    public ReversibleArrayList(Collection<T> c){
        super(c);//ArrayList<T>c
    }
    public Iterable<T> reversedIterable(){
        return new Iterable<T>() {
            public Iterator<T> iterator(){
                return new Iterator<T>()  {
                    int current=size()-1;
                    public boolean hasNext(){
                        return current> -1 ;
                    }
                    public T next(){
                        return get(current--);
                    }
                    public void remove(){
                        throw new UnsupportedOperationException();
                    }
                };
        }
    };
}
}
