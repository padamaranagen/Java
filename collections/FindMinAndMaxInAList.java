import java.util.Collections;
import java.util.Arrays;
import java.util.List;
public class FindMinAndMaxInAList
{
	public static void main(String args[])
	{
		List<String> list=Arrays.asList("one two three four five six one three four".split(" "));
		System.out.println(list);
		System.out.println("Max : "+ Collections.max(list));
		System.out.println("Min : "+Collections.min(list));
	}
}
