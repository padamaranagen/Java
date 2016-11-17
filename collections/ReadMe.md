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
---

                                    Thanks for reading!
-
