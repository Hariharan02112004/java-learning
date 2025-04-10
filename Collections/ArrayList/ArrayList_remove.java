import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList_remove{
    public static void main(String[]args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("banana");
        list.add("Guava");
        list.add("OrAnge");
        Iterator<String> itr = list.iterator();
        //REMOVE IN ARRAYLIST
        while(itr.hasNext()){
            String fruit = itr.next();
            if(fruit.equalsIgnoreCase("Orange")){
                itr.remove();
            }
        }
        System.out.println("After removal: ");
        for(String i: list){
            System.out.println(i+" ");
        }
    }
}