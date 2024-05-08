
//Programlama dilleri 7. hafta overloading ve casting.

//Overloading örneği
// iki int tam sayı toplama (a+b)                    
// aynı (a +b)'yi double değişken kullanarak toplama

                                                                                // Osman Arı 2211502018

// a ve b değişkenlerini kullanarak overloading işleminin gerçekleştirilmesi

public class Main {                                                                

    public static int add(int a,int b){
        return a+b;
    }
                                        
    public static double add(double a,double b){    //Overloading method,aşırı yükleme.Aynı isme sahip olmak şartıyla bir metodun diğer metodun yerini alması
        return a+b;
    }

    public static void main(String[] args) {

        int intResult= add(5,4);
        double doubleResult=add(3.5,7.1);// add((int)5.3,(int)7.1);    // --> "casting" işlemi ile float ifade int'e çevrilir.
        System.out.println("\ninteger result ="+intResult);
        System.out.println("\n");
        System.out.println("double result ="+doubleResult);
    }
}



