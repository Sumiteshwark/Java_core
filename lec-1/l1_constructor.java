
//Time = 05:23:00 to 06:06:00
//Constructor in Java - Default and parameterized
class Demo{
    int x,y;
    void print(){
        System.out.println(x + " " + y);
    }
    Demo(){  //default constructor
        x = 10;
        y = 20;
    }
    Demo(int a, int b){ //parameterized constructor
        x = a;  
        y = b;
    }
}
public class l1_constructor {
    public static void main(String[] args) {
        Demo d1= new Demo();
        Demo d2 = new Demo(11,21);
        d1.print();
        d2.print();
    }
}
