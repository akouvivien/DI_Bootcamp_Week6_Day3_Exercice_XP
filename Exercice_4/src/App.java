import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int nombre = scanner.nextInt();
       int value, sum=0;
       int temp = nombre;
       while (nombre> 0) {
         value = nombre % 10;
         nombre = nombre /10;
         sum = sum + value*value*value;
       }
       if (temp == sum) {
        System.out.println("its an Armstrong number");
        
       }else System.out.println("Not an Armstrong number");
    }
}
