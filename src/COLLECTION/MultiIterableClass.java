package COLLECTION;
import java.util.*;
public class MultiIterableClass extends IterableClass{
    public Iterable<String> reversed(){
        return new Iterable<String>(){
            public Iterator<String> iterator(){
                return new Iterator<String>(){
                  int current=word.length-1;

                    @Override
                    public boolean hasNext() {
                        return current>-1;
                    }
                    public String next(){
                        return word[current--];
                    }
                    public void remove(){
                        throw new UnsupportedOperationException();
                    }

                };
            }
        };
    }
    public Iterable<String> randomized(){
        return new Iterable<String>(){
            public Iterator<String> iterator(){
                List<String> shuffled=new ArrayList<String>(Arrays.asList(word));
                Collections.shuffle(shuffled,new Random(47));
                // 使用List的iterator方法
                return shuffled.iterator();
                }
            };
        }
        public static void main(String[] args){
        MultiIterableClass mic =new MultiIterableClass();
        for(String s:mic.reversed()){
            System.out.print(s+" ");
        }
        for(String s:mic.randomized()){
            System.out.print(s+" ");
        }
        for(String s:mic){
            System.out.print(s+" ");
        }

    }
}

