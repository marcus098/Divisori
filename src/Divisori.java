import java.util.Scanner;

/* scrivere un metodo che prenda in input un numero intero positivo e stampi tutti quanti i suoi divisori*/
public class Divisori {
    public static void main(String[] args) {
        //apro lo Scanner
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n < 1) {
            System.out.print("Inserisci un numero positivo: ");
            // salvo il numero inserito
            n = sc.nextInt();
        }
        printDiv(n);
    }

    public static void printDiv(int n) {
        for (int i = 1; i <= n; i++) {
            if((n%i) == 0){
                System.out.println(i);
            }
        }
    }
}
