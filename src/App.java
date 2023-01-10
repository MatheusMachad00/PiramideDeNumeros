import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int number;

        System.out.print("Digite um número: ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
        in.close();
    }

}
