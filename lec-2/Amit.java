// //Time = 04:35:00 to 05:10:00
// //Packages in Java

// => First go inside lec-2 folder
// => Then run (javac -d . Amit.java)
// => Then run (javac -d . Sumit.java)
// => Then run (java Package2.Sumit)



package Package1;
public class Amit{
    private int x;
    private int y;

    public void setData(int a, int b){  
        x = a;
        y = b;
    }

    public void display(){
        System.out.println(x + " " + y);
    }
}