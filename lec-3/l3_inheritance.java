// Time = 01:09:30 to 02:37:00    and from (02:37:00 to 3:20:00 lecture is repeated)

// => Three types of inheritance(single, multilevel, hierarchical)
// => Parent class is also called Super or Base class.
// => Child class is also called Sub or Derived class.
// => extends keyword is used to inherit from parent class.
// => By default there is super() implemented in child class constructor but we can also manually add super() with parameter as like super(3,4) in constructor of child.
// => calling sequence of super() is child to parent but execution sequence is parent to child.
// => super() call must be the first statement in a constructor of child.
// => this and super keyword. this keyword refers to current object and super keyword allows access to the members of parent class.
// => Each object created have its own this keyword, only static have same value when called with any object.
// => Remember super() and super keyword is different and both used in inheritance and in child class.




// Example of super()
class Nokia1{
    private int x = 5;
    private int y = 6;
    void fun1(){
        System.out.println("parent fun1");
    }
    void display(){
        System.out.println(x + " " + y);
    }
    Nokia1(){  //This is called if we don't pass parameter to super()
        System.out.println("parent constructor without parameter");
    }
    Nokia1(int a, int b){  //This is called if we pass parameter to super()
        x = a;
        y = b;
        System.out.println("parent constructor with parameter");
    }
}
class Nokia2 extends Nokia1{
    void fun2(){
        System.out.println("child fun2");
    }
    Nokia2(){
        // super(); // by default there is super() implemented in child class when we create object. No need to write manually
        super(3,4); // if we want to pass parameter to super() then we can write like this
        System.out.println("child constructor");
    }
}
public class l3_inheritance {
    public static void main(String[] args) {
        Nokia2 obj = new Nokia2();
        obj.fun1();
        obj.fun2();
        obj.display();
    }
}






// // Example of this keyword
// class Nokia1{
//     private int x = 5;
//     private int y = 6;
//     void fun1(){
//         System.out.println("parent fun1");
//     }
//     Nokia1(){  
//         int x=7;
//         int y=8;
//         System.out.println("parent constructor without this " + x + " " + y);
//         System.out.println("parent constructor with this " + this.x + " " + this.y);
//     }
// }
// class Nokia2 extends Nokia1{
//     void fun2(){
//         System.out.println("child fun2");
//     }
//     Nokia2(){
//         System.out.println("child constructor");
//     }
// }
// public class l3_inheritance {
//     public static void main(String[] args) {
//         Nokia2 obj = new Nokia2();
//         obj.fun1();
//         obj.fun2();
//     }
// }







// // Example of super keyword
// class Nokia1{
//     int x = 5;
//     int y = 6;
//     void fun1(){
//         System.out.println("parent fun1");
//     }
//     Nokia1(){  
//         System.out.println("parent constructor");
//     }
// }
// class Nokia2 extends Nokia1{
//     int x=17;
//     int y=18;
//     void fun2(){
//         System.out.println("child fun2");
//     }
//     Nokia2(){
//         System.out.println("child constructor");
//         int x=7;
//         int y=8;
//         System.out.println("child constructor without this " + x + " " + y);
//         System.out.println("child constructor with this " + this.x + " " + this.y); //if you comment line 107 and 108 then it will print parent constructor with this 5 6.
//         System.out.println("child constructor with super " + super.x + " " + super.y);
//     }
// }
// public class l3_inheritance {
//     public static void main(String[] args) {
//         Nokia2 obj = new Nokia2();
//         obj.fun1();
//         obj.fun2();
//     }
// }






// // => Each object created have its own this keyword, only static have same value when called with any object.
// class Nokia1{
//     int x = 5;
//     int y = 6;
//     // static int x = 5;
//     // static int y = 6;
//     void fun1(int x, int y){
//         this.x=x;
//         this.y=y;
//     }
//     void display(){
//         System.out.println(x + " " + y);
//     }
// }
// public class l3_inheritance {
//     public static void main(String[] args) {
//         Nokia1 obj = new Nokia1();
//         obj.fun1(7,8);
//         Nokia1 obj2 = new Nokia1();
//         obj2.fun1(9,10);
//         obj.display();
//         obj2.display();
//         //Above two line shows that is x and y is static then value will be same and if not static then value will be different as we assigned to respective object.
//     }
// }