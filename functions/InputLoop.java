import java.util.Scanner;

public class InputLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n ;
      int sum = 0;

      while((n = sc.nextInt()) != 0){
          sum = sum + n;
      }
        System.out.println("sum of entered integer  " +sum);
    }
}