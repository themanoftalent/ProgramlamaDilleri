//2211502039 AYŞEGÜL UÇAR

import java.util.Scanner;

public class SelectionStatString {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bir karakter giriniz:");

        while (true) {
            try {
                char leyla = keyboard.next().charAt(0);
                if (!Character.isLetter(leyla)) {
                    throw new IllegalArgumentException("Lütfen sadece harf giriniz!");
                }
                if (leyla == 'a' || leyla == 'A') {
                    System.out.println("İlk karakter A");
                } else {
                    System.out.println("İlk karakter a veya A değil.");
                }
                break; // Sonsuz döngüyü kırarak programın bitmesini sağlar.
            } catch (Exception e) {
                System.out.println(e.getMessage());
                // Klavyeden tekrar giriş yapılabilmesi için döngünün devam etmesi gerekiyor.
                keyboard.next(); // Yanlış girişin temizlenmesi için
            }
        }
        keyboard.close(); // Scanner'ı kapatmak iyi bir uygulama prensibidir.
    }
}


//Sınıf adının baş harfini büyük harfe çevirdim
//Sonsuz döngüde try-catch bloğunun içindeyken, break ifadesi yazılmıştı. Bu, döngünün sadece bir kez çalışmasına neden olur. Doğru yaklaşım, hata alındığında döngünün devam etmesi ve kullanıcının doğru giriş yapana kadar tekrar tekrar denemesidir. Bu nedenle break ifadesini try bloğunun içinden çıkarıp, catch bloğunun sonuna ekledim.
//finally bloğunu kaldırdım çünkü genellikle kullanılmadığı durumlarda gereksiz bir yapıdır. Eğer mutlaka çalıştırılması gereken kod parçacıkları varsa, bu blok kullanılabilir, ancak bu örnekte gerekli değil.
//Scanner'ın kapanması için keyboard.close() ekledim. Bu iyi bir uygulama prensibidir çünkü kaynakların düzgün bir şekilde serbest bırakılmasını sağlar.
