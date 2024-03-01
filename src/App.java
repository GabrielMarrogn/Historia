import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int cont = 0;

            while (a > 0) {
                a -= 100;
                cont++;
            }

            if (a > 1) {
                cont += 1;
            }

            System.out.println(cont);
        }

        sc.close();
    }
}
