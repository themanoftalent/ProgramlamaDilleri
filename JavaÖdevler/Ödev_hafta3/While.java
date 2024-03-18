public class While {
    public static void main(String[] args) {
        int deger = 60;
        int bolen =1;
        int TamBolenlerToplami=0;

        while(bolen<=deger)
        {
            if(deger%bolen==0)
            {
                System.out.println(deger+" Sayısı "+bolen+" sayısına tam bölünür.");
                TamBolenlerToplami=TamBolenlerToplami+bolen;
            }
        bolen++;
        }

        System.out.println(+deger+" Sayısının tam bölenler toplamı: "+TamBolenlerToplami);

    }
}
