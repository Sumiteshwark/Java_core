package a0_array;

import java.util.Arrays;

class display{
    //For 1D Array
    public void show(int arr[]){
        int size=arr.length;
        for(int i=0;i<size;i++){ 
            System.out.print(arr[i] + " ");
        }

        ////This loop is same as above for loop.
        // for(int it:arr){
        //     System.out.print(it + " ");
        // }

        System.out.print("\n");
        // System.out.println(); //Same work as above line

        ////To print arrary using toString()
        //System.out.println(Arrays.toString(arr))
    }


    //For multi-dimensional Array or Jagged Array
    public void show(int arr[][]){
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.print("\n");
        // }

        ////This loop is same as above for loop.
        for(int n[]:arr){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        ////To print two dimensional arrary using deepToString()
        //System.out.println(Arrays.deepToString(arr))
    }
}

class Student{
    int rollNo;
    String name;
    int marks;
}


public class Array_Lec {
    public static void main(String a[]){
        display dd=new display();

        //1D Array
        int nums[]={3,2,4,1};
        System.out.print("nums: ");
        dd.show(nums);
        
        int nums1[]=new int[4]; //Size of 4 and all set to zero(0).
        nums1[1]=5;
        System.out.print("nums1: ");
        dd.show(nums1);

        //Use of sort(), copyOf() and equals() static methods of Arrays class
        int[] arr = {3,5,2,1};
        int[] arr1 = {1,3,5,2,1,6};
        // Arrays.sort(arr);
        System.err.println(Arrays.toString(arr)); //To print one dimensional array
        int[] arr3 = Arrays.copyOf(arr1, 3);//To copy one dimensional array, here 3 is length
        System.err.println(Arrays.toString(arr3)); //To print one dimensional array
        System.out.println(Arrays.equals(arr, arr1)); //To check equality of two arrays
        System.err.println(Arrays.equals(arr,0,2,arr1,1,3)); //To check equality of two arrays using start index and end index
        
        //Multidimensional Array
        int nums2[][]=new int[2][3];
        System.out.println("MultiDimensional array: ");
        dd.show(nums2);

        //Jagged Array
        int nums3[][]=new int[3][];
        nums3[0]=new int[2];
        nums3[1]=new int[4];
        nums3[2]=new int[3];
        System.out.println("Jagged array: ");
        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums3[i].length;j++){
                nums3[i][j]=(int)(Math.random()*10);
            }
        }
        dd.show(nums3);

        //Student class multiple object in one array
        Student s1=new Student();
        s1.rollNo=1;
        s1.name="Sumit";
        s1.marks=99;

        Student s2=new Student();
        s2.rollNo=2;
        s2.name="Amit";
        s2.marks=97;

        Student s3=new Student();
        s3.rollNo=1;
        s3.name="Lalit";
        s3.marks=98;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        System.out.println("Student class: ");
         System.out.println("RollNo " + "Name " + "Mark");
        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].rollNo + " " + students[i].name + " " + students[i].marks);
        // }
        ////This loop is same as above for loop.
        for(Student stud: students){
            System.out.println(stud.rollNo + " " + stud.name + " " + stud.marks);
        }

    }
}