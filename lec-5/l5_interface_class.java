// => We cannot make object of interface also.
// => In interface by default every member(like int x;) is public, static and final. And every function(also called method) is by default public and abstract.
// => we cannot define anything inside function in interface. Ex- void f1(); But we can define using static keyword after Java-8. Ex- static void f2(){int x;}.
// => implements keyword is used to implement interface in class. extends keyword is used in class to class and interface to interface.
// => We cannot make constructor in interface because members are by default final. So, If we cannot able to initialize the data so constructor is not used.

// => Multiple inheritance is not in java because let if same function is defined in two or more than two parent classes, this will cause ambiguity that which function to be called. But multiple inheritance is possible in java using interface.
// => static method or function in interface cannot be called using object of class which implements that interface. But we can only call using interface name.
// => So if same method is in two or more interface and implemented in a same class then in that class only we have to define the function because method in interface is by default abstract(and if static keyword is used then this is not implementd in that class, can only be access by interface name).





// interface demo1{
//     int x=10; //By default this is public, static and final.
//     void f1(); //By default this is public and abstract and if we not use static keyword then we cannot define any thing inside this function.
//     static void f2(){   
//         System.out.println("f2");
//     }
// }
// interface demo3 extends demo1{
//     int x=30;
//     void f3();
// }
// class demo2 implements demo3{
//     // int x=20;
//     public void f1(){ //Must have to write this function and also to make this function public.
//         System.out.println(x);
//     }
//     public void f3(){ //Must have to write this function and also to make this function public.
//         System.out.println(x);
//     }
// }
// public class l5_interface_class {
//     public static void main(String[] args) {
//         demo2 obj = new demo2();
//         obj.f1();
//         obj.f3();
//         // obj.f2();  // => static method/function in interface cannot be called using object of class which implements that interface. But we can only call using class name.
//         demo1.f2();
//     }
// }







// => Multiple inheritance is not in java because let if same function is defined in two or more than two parent classes, this will cause ambiguity that which function to be called. But multiple inheritance is possible in java using interface.
// => static method or function in interface cannot be called using object of class which implements that interface. But we can only call using interface name.
// => So if same method is in two or more interface and implemented in a same class then in that class only we have to define the function because method in interface is by default abstract(and if static keyword is used then this is not implementd in that class, can only be access by interface name).
interface demo1{
    void common();
    static void common1(){
        System.out.println("static common1 can only be called using interface name");
    }
}
interface demo2{
    void common();
    static void common2(){
        System.out.println("static common2 can only be called using interface name");
    }
}
class demo3 implements demo1, demo2{
    public void common(){
        System.out.println("common to implement multiple interface");
    }
}
public class l5_interface_class {
    public static void main(String[] args) {
        demo3 obj = new demo3();
        obj.common();
        demo1.common1();
        demo2.common2();
    }
}