import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            int rem = n % 10;
        if(rem == 3){
            count++;
        }
        n = n / 10;
        }
        System.out.println(count);


    }
}