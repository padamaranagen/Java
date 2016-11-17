import java.util.Collections;
import java.util.Arrays;
import java.util.List;
public class FindSubListInAList
{
	public static void main(String args[])
	{
		List<String> list=Arrays.asList("one two three four five six one three four one two three four".split(" "));
		System.out.println("List:"+list);
		List sublist=Arrays.asList("three four".split(" "));
		System.out.println("SubList:"+sublist);
		System.out.println("indexOfSubList:"+Collections.indexOfSubList(list,sublist));
		System.out.println("lastIndexOfSubList:"+Collections.lastIndexOfSubList(list,sublist));
	}
}