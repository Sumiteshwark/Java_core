
// Time = 01:09:30 to 02:37:00    and from (02:37:00 to 3:20:00 lecture is repeated)


// public class l0_basic {
//     public static void main(String Args[]){
//         System.out.println("Hello World!");
//     }
// }
// //Here is three classes(l0_basic, String, System).






// class check{
//     int x; //instance(object) member variable and default value of x is zero(0).
//     static void check1(){ //static member function
//         System.out.println("check1");
//     }
//     void check2(){ //instance(object) member function
//         System.out.println("check2");
//     }
// }
// public class l0_basic {
//     static void fun1(){
//         System.out.println("fun1");
//     }
//     void fun2(){
//         System.out.println("fun2");
//     }
//     public static void main(String Args[]){
//         System.out.println("Hello World!");
//         fun1();
//         // fun2(); //Non static method can't be called from static method.

//         check.check1();
//         // check.check2(); //Non static method can't be called from static method.

//         check obj = new check();
//         obj.check1();
//         obj.check2();
//     }
// }







class check{
    int y; //It creates a block in each instance and each instance may have different value..
    static int x; //It creates a common block which is common to each instance/object, because of static and have same value when accessed from any instance.
    void check1(){
        y=11;
        x=11;
    }
    void check2(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    void check3(){
        y=21;
        x=21;
    }
}
public class l0_basic {
    public static void main(String Args[]){
        check obj1 = new check();
        check obj2 = new check();
        obj1.check1();
        obj1.check3();
        obj2.check2(); //y is not static so when we create object it makes sepetate block in each instance and we donot modify y in obj2 so y prints default value 0.
        obj1.check2();
        // y is not static so when we create object it makes sepetate block in each instance. But if we create static then it makes only one block when we declare it, whick is x here and always have same value when accessed from any instance.
    }
}