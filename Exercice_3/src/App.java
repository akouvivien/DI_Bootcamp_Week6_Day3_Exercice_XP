import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int nombre,reverse;
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a nombre");
         nombre = scanner.nextInt();
         reverse =0;
        while (nombre>0) {
            reverse= reverse * 10 + nombre % 10;
            nombre = nombre /10;
                   
        }
        
        System.out.println(reverse);
    }
}
