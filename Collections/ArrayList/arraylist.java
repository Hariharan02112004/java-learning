import java.util.ArrayList;
public class arraylist{
    public static void main(String[]args){
        ArrayList<String> list=new ArrayList<>();
        /*Syntax:
        ArrayList<Datatype> List_name = new ArrayList<>();*/
        list.add("Hello");
        list.add("How");
        list.add("are");
        list.add("you");
        System.out.println(list);
        list.add("I");
        list.add("am");
        list.add("fine");
        System.out.println(list);
    }
}