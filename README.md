# Java
while(!success=try()));

class Test {
protected int x, y;
}
class Main2 {
public static void main(String args[]) {
Test t = new Test();
System.out.println(t.x + " " + t.y);
}
}
ouput
0 0
---------------
class Main3 {
public static void main(String args[]) {   
System.out.println(fun());
} 
int fun() {
return 20;
} 
}

Error:
Main3.java:3: error: non-static method fun() cannot be referenced from a static context
System.out.println(fun());
                   ^
-------
class Base {
protected void foo() {
System.out.println ("Hello Parent");}
} 
class Derived extends Base {
void foo() {
System.out.println ("Hello Children");

}
} 
public class Main4 {
public static void main(String args[]) {
Derived d = new Derived();
d.foo();
}
}


nagendra@nagendra-desktop ~/Desktop $ javac Main4.java
Main4.java:6: error: foo() in Derived cannot override foo() in Base
void foo() {
     ^
  attempting to assign weaker access privileges; was protected
1 error

