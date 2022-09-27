import java.util.Scanner;
import java.util.Random;
public class App {
    public static int arraySize(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is array size?");
        String input=scan.nextLine();
        int size=Integer.parseInt(input);
        return size;
    }
    public static int arraySum(int[] Array) {
        int sum = 0;
        for (int value : Array) {
            sum += value;
        }
        return sum;
    }
    public static void printArraySum(int[] Array) {
        int sum = arraySum(Array);
        for (int i = 0; i < Array.length-1; i++) {
            System.out.print(Array[i] + " + ");
        }
        System.out.print(Array[Array.length - 1] + " = " + sum + "\n");
    }
    public static void arrayInput(int [] Array){

        for(int i=0; i<Array.length; i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Input your number");
            String inputData=scan.nextLine();
            int num=Integer.parseInt(inputData);
            Array[i]=num;
        }
    }
    public static void randomArray(int [] Array){


        for(int i=0; i<Array.length; i++){
            Random random=new Random();
          int num = random.nextInt(10);
            Array[i]=num;
        }

    }
    public static void printArray(int [] Array){
        for(int i=0; i<Array.length;i++){
            System.out.println(Array[i]);
        }
    }
    public static void main(String [] args){
        int[]arr=new int[arraySize()];
        arrayInput(arr);
        printArray(arr);
        int[] random = new int[arraySize()];
        randomArray(random);
        printArray(random);
        printArraySum(arr);

    }
}
