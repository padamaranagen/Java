/*How to rotate elements in a list*/
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class RotateElementsInAList
{
	public static void main(String args[])
	{
		List list=Arrays.asList("one two three four five six".split(" "));
		System.out.println("List:"+ list);
		Collections.rotate(list,5);
		System.out.println("rotate:"+list);
		
	}
	
}
