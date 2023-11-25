import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        int num[]=new int[4];
        Scanner inpurt =new Scanner(System.in);
        System.out.println("enter the num ");
        for (int i=0; i< num.length; i++){
            num [i]=inpurt.nextInt();


        }
            for (int i=0;i< num.length; i++)
                System.out.println(num[i]);
    }
}
