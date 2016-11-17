# Threading

### 1.  How to check a thread is alive or not?

Following example demonstrates how to check a thread is alive or not by extending Threda class and using currentThread() method.

##### Example
```
public class TheadAliveorNot extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			printMsg();
		}
	}
	public void printMsg()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("name="+ name);
	}
	public static void main(String args[])
	{
		TheadAliveorNot tln=new TheadAliveorNot();
		tln.setName("Thread");
		System.out.println("before start(), tln.isAlive()="+tln.isAlive());
		tln.start();
		System.out.println("just after start(), tt.isAlive()="+tln.isAlive());
		for(int i=0;i<10;i++)
		{
			tln.printMsg();
		}
		System.out.println("The end of main(), tt.isAlive()="+tln.isAlive());
	}
}
```
##### Output
```
F:\github\Java\threading>javac TheadAliveorNot.java
F:\github\Java\threading>java TheadAliveorNot
before start(), tln.isAlive()=false
just after start(), tt.isAlive()=true
name=main
name=main
name=main
name=main
name=main
name=main
name=main
name=main
name=main
name=main
The end of main(), tt.isAlive()=true
name=Thread
name=Thread
name=Thread
name=Thread
name=Thread
name=Thread
name=Thread
name=Thread
name=Thread
name=Thread
```






---

                                    Thanks for reading!
-
