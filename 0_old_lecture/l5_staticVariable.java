//Static variable or method is directly called by class name.
//Static variable makes a seperate block and it update its value when it changes.

class Mobile{
    String brand;
    int price;
    static String name;

    //Non-static method can access static variable(i.e. name)
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class l5_staticVariable {
    public static void main(String Args[]){
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile.name="SmartPhone"; //Static variable called by class name.

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1000;
        Mobile.name="Android"; //It overwrites obj1 name
        
        obj1.show();
        obj2.show();
    }
}
