import java.util.Scanner;
public class do_while {
    public static void main(String[] args){
        Scanner gir=new Scanner(System.in);
        //do-while döngüsüne 5 örnek
/*
        int sayi=0;
        int counter=0;
        //16 ya kadar olan çift sayıları topla
        do{
            if(sayi %2 == 0){
            counter=counter+sayi;
            }
sayi++;
        }
while(sayi<=16);
System.out.println(sayi);   */


        //2.örnek
        //5 defa adımıyazdırın do while döngüsü
        /*
        int sayi=0;
        do{
            System.out.println("ebrar");
            sayi++;
        }
        while(sayi<5);*/

//kullanıcıdan alınan sayıların çarpımı
        /*
       int sayi=1;
      int carpim=1;
      System.out.println("sayıların carpımı");
      System.out.println("bir sayı girin");
        int girdi=gir.nextInt();
               do{
                   carpim=carpim*sayi;
                   sayi++;
               }
               while(sayi<girdi);
               System.out.println(carpim);

         */
        //kullanıcının  girdiği sayıların toplamı
        /*
        int sayi=0;
        int toplam=0;
        System.out.println("lütfen sayı girin");

        do{
            int girdi=gir.nextInt();
          toplam= toplam + girdi;
            sayi++;
        }
        while(sayi<4);
        System.out.println(toplam);

         */
        //kullanıcının girdiği kelimlerin birleşimi
        int i=0;
        String result="";

        do{
            System.out.println("kelime giriniz");
            String name=gir.nextLine();
            i++;
result+=name;



        }
        while(i<5);

System.out.println(result);
    }
}

