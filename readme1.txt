*********************** YOUTUBE CHANNEL - CoDing SeeKho *************************
******************************* JAVA (18 hours) *********************************



=> James Gosling (Written in 1891 and launched in 1896)
=> Features - Plateform Independent, Multithreading, Garbage Collector, Secure, Robust(Can do every thing)
=> Garbage Collector deletes unreferenced memeory.
=> File and class name must be same.
=> Outer class can never be private or protected.
=> In built in Java class name must be capital and it is always good to make file with capital letter means main class also capital.
    Example- class Box{
        public static void main(String []args){
            System.out.println("Hello");
        }
    }
    Here there are total three classes(Box, String, System).
=> Non static method can't be called from static method. (method, function and operation are same.)
=> Non static member is also called Instance member variable or object member variable.
=> If you have to call non static function for static function then first you have to make object of that class and from this we can call non static function.
=> In java there is no default value, but if we create object then default value is assigned. For int zero(0), boolean false etc.
=> Access Modifires( public, private, protected and default ).

=> In java array is defind as (String[] str = new String[4]), here str refernce to Instance which consists of 5 blocks, four for array variable(i.e 0 to 3 index) and one which contains length of array that is 4 in this case.


=> Wrapper class is used to make java 100% object oriented programming.as (int-Integer, double-Double, float-Float, char-Character). Example is in lec1(l1_wrapper_class)

=> Command line Argument - In main there is (String []args), in this we can pass the argument while running the program. Example is in lec1(l1_cli)

=> Access Spesifiers(public, private, protected, default)

=> Constructor - default and parameterized Constructor. Example is in lec1(l1_constructor)
=> Destructure - There is no Destructure in Java because there is Garbage Collector which deletes the non-referenced instance by itself.

=> Package in Java - For package go to lec-2 folder.

=> Inheritance in Java(single, Multilevel, Hierarchical)
=> Parent class is also called Super or Base class.
=> Child class is also called Sub or Derived class.
=> By default there is super() implemented in child class but we can also manually add super() with parameter like super(3,4).
=> this and super keyword.
=> Details are in l3_inheritance.java.

=> Overloading (Compile time polymorphism) - Overloading occurs when two or more methods in the same class have the same name but different parameters. Details are in l3_function_overloading.java.
=> Overriding (Run time polymorphism) - Method overriding is the act of declaring a method in a subclass that is already present in a parent class.Details are in l3_function_overriding.java.

=> In interface by default every member is public, static and final.