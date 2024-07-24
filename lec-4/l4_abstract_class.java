
// => We cannot make object of abstract class. But can make object of child class of this class.
// => If we write abstract before function, then we cannot define anything inside that function. Ex- abstract void f1();
// => If we define abstract keyword inside the class then we must have to define that class abstract.
// => If we call the abstract function in the child class, then we also have to make child class abstract. So, to prevent this we use overriding, means we can define the same function in child class.So, from this we can make object of child class.
// => We can make constructor in abstract class. Aulthough constructor executes at the time of object creation. But we cannot make object of abstract class. But we can make object of child class of this class at that time super() is called default and the constructor of parent or abstract class is called.


// abstract class Demo1{
//     int x,y;
//     void f1(){
//         x=5;
//         y=4;
//     }
//     abstract void f2();
// }
// class Demo2 extends Demo1{ //We cannot extends Demo1 because Demo1 have abstract function. So either we have to make this class abstract or we have to override the function(i.e. f2()).
//     int z;
//     void f3(){
//         z=6;
//     }
//     void f2() { //This function is overridden.
//         System.out.println(x + " " + y + " " + z);
//     }
// }
// public class l4_abstract_class {
//     public static void main(String[] args) {
//         Demo2 obj = new Demo2();
//         obj.f1();
//         obj.f3();
//         obj.f2();
//     }
// }




// => Create constructor in abstract class.
abstract class Demo1{
    Demo1(){
        System.out.println("This is constructor of abstract class.");
    }
}
class Demo2 extends Demo1{ 
    Demo2(){
        // super(); //By default there is super() implemented in child class when we create object. No need to write manually
        System.out.println("This is constructor of child class.");
    }

    void fun2() {
        System.out.println("This is function of child class.");
    }
}
public class l4_abstract_class {
    public static void main(String[] args) {
        Demo2 obj = new Demo2(); //We can make object of child class of this class at that time super() is called default and the constructor of parent or abstract class is called then constructor of child class is called.
        obj.fun2();
    }
}