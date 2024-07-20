public class l1_datatypes {
    public static void main(String a[]){
        float num=5.6f;
        double numb=5.6f;
        double numbe=5.6;
        System.out.println(num);
        System.out.println(numb);
        System.out.println(numbe);
        
        int num1=0b111;
        int num2=0x7E;
        int num3=10_00_000;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        
        int num4=257;
        byte k=(byte)num4; //if num >256 then (num%256)
        System.out.println(k);

        double num5=12.6;
        float f=(float)num5;
        System.out.println(f);

        float num6=12.6f;
        double d=num6;
        System.out.println(d);



        int orgnum=7;
        int check1=orgnum/3;
        double check2=orgnum/3;
        double check3=orgnum/3.0;
        System.out.printf("%d %d %.2f %.3f",orgnum,check1,check2,check3);
    }
}
