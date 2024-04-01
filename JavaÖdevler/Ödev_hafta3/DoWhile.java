import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       String dogruNickname="omerselim16",dogruSifre="1613omer";
       String nickname,sifre;
       boolean girisBasarili = false;
       int secim;

       do{
           System.out.println("Kullanıcı Adı: ");
           nickname = input.next();

           System.out.println("Şifre: ");
           sifre = input.next();

           if(nickname.equals(dogruNickname) || sifre.equals(dogruSifre))
           {
               System.out.println("Giriş Başarılı. ");
               girisBasarili = true;

           }
           else {
               System.out.println("Giriş Başarısız. Tekrar denemek için 1'e çıkış yapmak için 0'a basınız.");
               secim = input.nextInt();
               if(secim==0)
               {
                   break;
               }
           }
       }while(!girisBasarili);


    }
}
