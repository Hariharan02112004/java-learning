//using collections.reverse
//import Array and Collections package
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class reverse_array{
	public static void main(String[]args){
//Array deals with Interger class not int primitive datatype
		Integer[] a={2, 3, 5, 4,81};
		List<Integer> rev=Arrays.asList(a);
		Collections.reverse(rev);
		String str=rev.toString();
		str=str.replaceAll("[\\[\\]]","");
		System.out.print("Reversed array is "+str);
	}
}