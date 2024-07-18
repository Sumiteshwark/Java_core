
//Time = 03:20:00 to 04:08:00
//Wrapper class - (There is total three function: parseInt(which is static, so can be called by class name and .parseInt), valueOf(which is static), intValue(non-static, so always called after creating object.))
//Example os wrapper class
public class l1_wrapper_class {
    public static void main(String[] args) {
        int x = Integer.parseInt("10");
        System.out.println(x);

        Integer i1 = Integer.valueOf("10110", 2);
        int z = i1.intValue();
        System.out.println(z);

        Double d1 = Double.valueOf("10");
        double y = d1.doubleValue();
        System.out.println(y);
    }
}