import java.util.Collections;
import java.util.Arrays;
import java.util.List;
public class ReplaceAnElementInAList
{
	public static void main(String args[])
	{
		List<String> list=Arrays.asList("one two three four five six one two three four".split(" "));
		System.out.println("List:"+ list);
		Collections.replaceAll(list, "one", "hundred");
		System.out.println("replaceAll:"+list);
	}
}