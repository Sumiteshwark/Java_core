// => Overloading occurs when two or more methods in the same class have the same name but different parameters.
// => It is Compile-time polymorphism.
// => It may or may not need of inheritance.
// => Methods have same name and different signatures.
// => It can verload private and final methods




// Java program to demonstrate working of method
// overloading in methods
class A {
    public int foo(int a) { return 20; }
  
    public char foo(int a, int b) { return 'a'; }
}
  
public class l3_function_overloading {
  
    public static void main(String args[])
    {
        A a = new A();
        System.out.println(a.foo(1));
        System.out.println(a.foo(1, 2));
    }
}