import java.util.ArrayList;
import java.util.Iterator;
public class arraylist_using_iterator{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("banana");
        list.add("Guava");
        list.add("Orange");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}