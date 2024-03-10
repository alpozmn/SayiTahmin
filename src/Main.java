import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(101); // 0 ile 100 arasında rastgele bir sayı seçiyoruz
        int guess;
        int attempts = 0;

        System.out.println("0 ile 100 arasında bir sayıyı tahmin et!");

        // Kullanıcının tahmin etmeye çalışması
        do {
            System.out.print("Tahmininiz: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Daha yüksek bir sayı girin.");
            } else if (guess > secretNumber) {
                System.out.println("Daha düşük bir sayı girin.");
            } else {
                System.out.println("Tebrikler, doğru tahmin! Sayı: " + secretNumber);
                System.out.println("Deneme sayısı: " + attempts);
            }
        } while (guess != secretNumber);

        scanner.close();
    }
}
