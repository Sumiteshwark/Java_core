*********************** YOUTUBE CHANNEL - CoDing SeeKho *************************
******************************* JAVA (18 hours) *********************************



=> If we defint package at top of file then we have to compile and run code form the root directory.
=> Ex -  folder1/folder2/file.java (So in file we have to define (package folder1/folder2;))
=> So to compile and run we have to be in root directory in which folder1 is kept and to compile (javac folder1/folder2/file.java) and to run (java folder1/folder2/file)

=> Java Bitwise operator = |(or), &(and), ^(xor), ~(complement), >>(rightshift), <<(leftshift)

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

=> Constructor - default and parameterized Constructor. It executes when object is created. Example is in lec1(l1_constructor)
=> Destructure - There is no Destructure in Java because there is Garbage Collector which deletes the non-referenced instance by itself.

=> Package in Java - For package go to lec-2 folder.

=> Inheritance in Java(single, Multilevel, Hierarchical)
=> Parent class is also called Super or Base class.
=> Child class is also called Sub or Derived class.
=> By default there is super() implemented in child class but we can also manually add super() with parameter like super(3,4).
=> this and super keyword.
=> Details are in l3_inheritance.java.

=> polymorphism
=> Overloading (Compile time polymorphism) - Overloading occurs when two or more methods in the same class have the same name but different parameters. Details are in l3_function_overloading.java.
=> Overriding (Run time polymorphism) - Method overriding is the act of declaring a method in a subclass that is already present in a parent class.Details are in l3_function_overriding.java.

=> Abstract class
// => We cannot make object of abstract class. But can make object of child class of this class.
// => If we write abstract before function, then we cannot define anything inside that function. Ex- abstract void f1();
// => If we define abstract keyword inside the class then we must have to define that class abstract.
// => If we call the abstract function in the child class, then we also have to make child class abstract. So, to prevent this we use overriding, means we can define the same function in child class.So, from this we can make object of child class.
// => We can make constructor in abstract class. Aulthough constructor executes at the time of object creation. But we cannot make object of abstract class. But we can make object of child class of this class at that time super() is called default and the constructor of parent or abstract class is called.
=> For more go to l4_abstract_class.java

=> Interface
// => We cannot make object of interface also.
// => In interface by default every member(like int x;) is public, static and final. And every function(also called method) is by default public and abstract.
// => we cannot define anything inside function in interface. Ex- void f1(); But we can define using static keyword after Java-8. Ex- static void f2(){int x;}.
// => implements keyword is used to implement interface in class. extends keyword is used in class to class and interface to interface.
// => We cannot make constructor in interface because members are by default final. So, If we cannot able to initialize the data so constructor is not used.
// => We cannot create object of interface. But we can create reference of interface to the class.
// => Multiple inheritance is not in java because let if same function is defined in two or more than two parent classes, this will cause ambiguity that which function to be called. But multiple inheritance is possible in java using interface.
// => static method or function in interface cannot be called using object of class which implements that interface. But we can only call using interface name.
// => So if same method is in two or more interface and implemented in a same class then in that class only we have to define the function because method in interface is by default abstract(and if static keyword is used then this is not implementd in that class, can only be access by interface name).
=> For more go to l5_interface_class.java


=> String vs StringBuffer vs StringBuilder
// => String is immutable.
// => StringBuffer is mutable and syncorized.
// => StringBuilder is mutable and non-syncorized.