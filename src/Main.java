import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String correctAd = "Sefa";
        String correctParola = "Sefa123";
        int girisSayisi = 3;

        System.out.println("Hoşgeldiniz");

        while (true) {
            System.out.println("Kullanıcı adını giriniz.");
            String ad = scanner.nextLine();
            System.out.println("Parolanızı giriniz.");
            String parola = scanner.nextLine();


            if (ad.equals(correctAd) && parola.equals(correctParola)) {
                System.out.println("Başarıyla giriş yaptınız: " + ad);
                break;
            }

            else if (ad.equals(correctAd) && !parola.equals(correctParola)) {
                System.out.println("Yanlış Parola Girdiniz");
                girisSayisi -= 1;
            }

            else if (!ad.equals(correctAd) && parola.equals(correctParola)){
                System.out.println("Adınızı Yanlış Girdiniz");
                girisSayisi -= 1;
            }

            else {
                System.out.println("Adınızı ve Parolanızı Yanlış Girdiniz");
                girisSayisi -= 1;
            }


            if (girisSayisi == 0){
                System.out.println("GİRİŞ HAKKINIZ KALMADI");
                break;
            }
        }
    }
}
