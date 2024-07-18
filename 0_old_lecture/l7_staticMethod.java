//Static variable or method is directly called by class name.
//Static method can't access non-static method directly.

class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    //// Static method can't access non-static method directly(i.e. brand and price).
    // public static void show1(){
    //      System.out.println(brand + " : " + price + " : " + name);
    // }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class l7_staticMethod {
    // static is used in main class because for non-static method class we have to
    // make object of that class which can't be created before running main class.
    // So, here is deadlock. Hence, we have to make static main because for this we
    // not have to make object.
    public static void main(String Args[]) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1000;

        Mobile.name = "Phone";

        System.out.println("By non-static method: ");
        obj1.show();
        obj2.show();

        // Mobile.show1(); //Static method can't called in this way.

        System.out.println("By non-static method: ");
        Mobile.show1(obj1);
        Mobile.show1(obj2);
    }
}
