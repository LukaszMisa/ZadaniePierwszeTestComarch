import java.util.Scanner;

public class Kucharz {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj ilosc pomaranczy: ");
            int oranges = sc.nextInt();
            System.out.println("Podaj ilosc jablek: ");
            int apples = sc.nextInt();
            System.out.println("Podaj ile masz monet: ");
            int coins = sc.nextInt();
            while (coins > 0) {
                if (apples > oranges) {
                    oranges++;
                    coins--;
                } else {
                    apples++;
                    coins--;
                }
            }
            System.out.println("Ilosc pomaranczy: " + oranges);
            System.out.println("ilosc jablek: " + apples);
            System.out.println("Roznica: " + Math.abs(apples - oranges));
        }
}

