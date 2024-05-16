package hafta10;

import java.util.Scanner;

public class SumeyyeElginSubprogramsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumeyyeElginSubprogramsData.selamla();

        System.out.println(SumeyyeElginSubprogramsData.add(sc));
        System.out.println(SumeyyeElginSubprogramsData.divide(sc));
        System.out.println(SumeyyeElginSubprogramsData.multiply(sc));
        System.out.println(SumeyyeElginSubprogramsData.sub(sc));

    }
}
