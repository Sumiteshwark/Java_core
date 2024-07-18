class Calci{
    public int add(int n1,int n2){
        int n3=6;
        int r=n1+n2+n3;
        return r;
    }

    public int add(int n1,int n2,int n3){
        int r=n1+n2+n3;
        return r;
    }

    public double add(double n1,int n2){
        double r=n1+n2;
        return r;
    }

    public int mul(int n1,int n2){
        int r=n1*n2;
        return r;
    }
}


public class l2_classobject {
    public static void main(String a[]){
        Calci cal=new Calci();
        int num1=3;
        int num2=4;
        int add_result=cal.add(num1,num2);
        System.out.println(add_result);
        int add_result_1=cal.add(num1,num2,4);
        System.out.println(add_result_1);
        double add_result_2=cal.add(num1,num2);
        System.out.println(add_result_2);
        
        int mul_result=cal.mul(num1,num2);
        System.out.println(mul_result);
    }
}
