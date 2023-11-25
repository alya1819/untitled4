import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        int number[]={1,2,3,4,};
        printAll(number);
        inpuAll(number);
        printAll(number);
    }
    public static void printAll(int array[]){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }public static void inpuAll(int array[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the num");
        for (int i=0;i<array.length;i++){
            array[i]=input.nextInt();
        }
    }
}