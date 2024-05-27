import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        datatype arr[];
        int a[];
        a = new int[10];// 0 1 2 3 4 5 6 7 8 9
        int sum = 0;
        for(int i=0;i<10;i++){
            System.out.println("Enter number " + i + ":");
            a[i]= scan.nextInt();
        }


        //for(data_type k:a){
        // }
        for(int b:a){
            if(b%2==0){
                sum = sum + b;//sum =0+2=2;
            }
        }
        System.out.println("The sum of even numbers in the array is " + sum);
    }
}
