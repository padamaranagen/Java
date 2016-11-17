# Collections
### 1.  How to rotate elements of the List?

The rotate(List<?>, int) method is used to rotate the elements in the specified list by the specified distance.

```
public static void rotate(List<?> list,int distance)
```
##### Example
```
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
```
##### Output
```
F:\github\Java\collections>javac RotateElementsInAList.java
F:\github\Java\collections>java RotateElementsInAList
List:[one, two, three, four, five, six]
rotate:[two, three, four, five, six, one]
```

### 2.  How to replace elements of the List?

Following example uses replaceAll() method to replace all the occurance of an element with a different element in a list.
##### Example
```
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
```
##### Output
```
F:\github\Java\collections>javac ReplaceAnElementInAList.java

F:\github\Java\collections>java ReplaceAnElementInAList
List:[one, two, three, four, five, six, one, two, three, four]
replaceAll:[hundred, two, three, four, five, six, hundred, two, three, four]

```


### 3.  How to replace elements of the List?

Following example uses indexOfSubList() & lastIndexOfSubList() to check whether the sublist is there in the list or not & to find the last occurance of the sublist in the list.
##### Example
```
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
```
##### Output
```
F:\github\Java\collections>javac FindSubListInAList.java
F:\github\Java\collections>java FindSubListInAList
List:[one, two, three, four, five, six, one, three, four, one, two, three, four]
SubList:[three, four]
indexOfSubList:2
lastIndexOfSubList:11

```

---

                                    Thanks for reading!
-
