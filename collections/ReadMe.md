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

### 4.  How to find minimum and maximum of a list?

Following example uses min & max Methods to find minimum & maximum of the List.
##### Example
```
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

```
##### Output
```
F:\github\Java\collections>javac FindMinAndMaxInAList.java
F:\github\Java\collections>java FindMinAndMaxInAList
[one, two, three, four, five, six, one, three, four]
Max : two
Min : five
```


##### Note
```
The Collections.max and Collections.min compare objects in their natural order.

For Strings, it's lexicographic (i.e. alphabetic) comparison.

Amongst the many uses of natural order comparison is the fact you can easily sort String alphabetically.
```

### 5.  How to convert an array into a collection?

Following example demonstrates to convert an array into a collection Arrays.asList(name) method of Java Util class.

##### Example
```
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
public class ConvertArrayIntoCollection
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements you want to add to the array");
		int n=Integer.parseInt(br.readLine());
		String[] name=new String[n];
		for(int i=0;i<n;i++)
		{
			name[i]=br.readLine();
		}
		List<String> list=Arrays.asList(name);
		System.out.println();
		for(String li:list)
		{
			String str=li;
			System.out.println(str+ " ");
		}
	}
}
```
##### Output
```
F:\github\Java\collections>javac ConvertArrayIntoCollection.java
F:\github\Java\collections>java ConvertArrayIntoCollection
How many elements you want to add to the array
4
one
two
three
four

one
two
three
four
```
### 6.  Difference Between HashSet And TreeSet

HashSet and TreeSet are both implements the Set interface.
>Ordering : HashSet stores the object in random order . There is no guarantee that the element we  inserted first in the HashSet  will be printed first in the output .
 For example   
```
import java.util.HashSet;
public class HashSetExample
{
	public static void main(String args[])
	{
		HashSet<String> obj1=new HashSet<String>();
		obj1.add("My");
		obj1.add("name");
		obj1.add("is");
		obj1.add("nagendra");
		System.out.println(obj1);
	}
}
```
##### Output
```
F:\github\Java\collections>javac HashSetExample.java
F:\github\Java\collections>java HashSetExample
[nagendra, name, is, My]
```

>Elements are sorted according to the natural ordering of its elements in TreeSet. If the objects can not 
be sorted in natural order than use compareTo() method to sort the elements of TreeSet object .

##### Example

```
import java.util.TreeSet;
public class TreeSetExample
{
	public static void main(String args[])
	{
		TreeSet<String> obj1=new TreeSet<String>();
		obj1.add("My");
		obj1.add("name");
		obj1.add("is");
		obj1.add("nagendra");
		System.out.println(obj1);
	}
}
```

##### Output
```
F:\github\Java\collections>javac TreeSetExample.java
F:\github\Java\collections>java TreeSetExample
[My, is, nagendra, name]
```

>Null value :   HashSet can store null object while TreeSet does not allow null object. If one try to store null object in TreeSet object , it will throw Null Pointer Exception.

> Performance : HashSet take constant time performance for the basic operations like add, remove contains and  size.While TreeSet guarantees log(n) time cost for the basic operations (add,remove,contains).

> Speed : HashSet is much faster than TreeSet,as performance time of HashSet is constant against the log time of TreeSet for most operations (add,remove ,contains and size) . Iteration performance of HashSet mainly depends on the load factor and initial capacity parameters. 

>Internal implementation :  As we have already discussed How hashset internally works in java thus, in one line HashSet are internally backed by hashmap. While TreeSet is backed by a  Navigable  TreeMap. 

>Functionality :    TreeSet is rich in functionality as compare to HashSet. Functions like pollFirst(),pollLast(),first(),last(),ceiling(),lower() etc. makes TreeSet easier to use than HashSet. 

>Comparision : HashSet uses equals() method for comparison in java while TreeSet uses compareTo() method for maintaining ordering .

##### Similarities Between HashSet and TreeSet

>Unique Elements :   Since HashSet and TreeSet both implements Set interface . Both are allowed to store only unique elements in their objects. Thus there can never be any duplicate elements inside the HashSet and TreeSet objects.

>Not Thread Safe : HashSet and TreeSet both are not synchronized or not thread safe.HashSet and TreeSet, both implementations are not synchronized. If multiple threads access a hash set/ tree set concurrently, and at least one of the threads modifies the set, it must be synchronized externally.

>Clone() method copy technique:  Both HashSet and TreeSet uses shallow copy technique to create a clone of  their objects .

>Fail-fast Iterators :  The iterators returned by this class's  method are fail-fast: if the set is modified at any time after the iterator is  created, in any way except through the iterator's own  remove method, the iterator will throw a  ConcurrentModificationException.  Thus, in the face of concurrent modification, the iterator fails quickly and cleanly, rather than risking arbitrary, non-deterministic behavior at   an undetermined time in the future.

##### When to prefer TreeSet over HashSet

>Sorted unique elements are required instead of unique elements.The sorted list given by TreeSet is always in ascending order.

>TreeSet has greater locality than HashSet.

 ```  If two entries  are near by in the order , then TreeSet places them near each other in data structure and hence in memory, while HashSet spreads the entries all over memory  regardless of the keys they are associated to. ```
     
```As we know Data reads from the hard drive takes much more latency time than data read from the cache or memory. In case data needs to be read from hard drive than prefer TreeSet as it has greater locality than HashSet.```

>TreeSet uses Red- Black tree algorithm underneath to sort out the elements. When one need to perform read/write operations frequently , then TreeSet is a good choice.
   







---

                                    Thanks for reading!
-
