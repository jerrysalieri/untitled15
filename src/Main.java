import java.util.Scanner;
public class Main {

    public static void main(String[]args){
        int size =10;
       int[]firstArray=new int[10];
       int[]secondArray=new int[size];
        double[]thirdArray=new double[10];
        int[]fourthArray={1,2,3,4,5};
        int length = firstArray.length;
        System.out.println(length);
        firstArray[4]=45;
        System.out.println("5th element value: " + firstArray[4]);
       // System.out.println(firstArray[999]);
        for(int i=0; i<secondArray.length; i++){

            System.out.println("Input your number");
            Scanner sc=new Scanner(System.in);
            String inputData=sc.nextLine();
            int num=Integer.parseInt(inputData);
            secondArray[i]=num;
        }
        for(int i=0; i<secondArray.length;i++){
            System.out.print(secondArray[i]);
        }

    }
}
