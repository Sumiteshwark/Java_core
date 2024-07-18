class Mobile{
    String brand;
    int price;
    static String name;

    //Static Block
    static{
        name = "Phone"; //This static block called only once before creating any object.
        System.out.println("Static block is called");
    }

    //Constructor - Called each time when object is created.
    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("Constructor is called");
        // name = "Phone"; //This is static so no need to call when any object is created.
    }

    //Non-static method can access static variable(i.e. name)
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class l6_staticBlock {
    public static void main(String Args[]){
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        
        Mobile obj2=new Mobile();
        
        Mobile.name="SmartPhone";
        
        obj1.show();
        obj2.show();
    }
}
