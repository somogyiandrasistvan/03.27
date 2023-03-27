package oraimunka0327;

import java.util.Scanner;

public class Oraimunka0327 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        szamtaniSorozat();
    }

    private static void szamtaniSorozat() {
        int elsoSzam = beker("Kérek egy kezdő elemű számot: ");
        int kulonbs = beker("Kérem a különbséget: ");
        int elemDb = beker("hány elemű legyen? ");
        int[] tomb = tomb(elsoSzam, kulonbs, elemDb);
        kiirTomb(tomb);
    }

    private static int beker(String kerdes) {
        kiir(kerdes);
        int szam = sc.nextInt();
        return szam;
    }

    private static void kiirTomb(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }
    }

    private static int[] tomb(int elso, int kulonbs, int elemDb) {
        int[] tomb = new int[elemDb];
        int szam;
        for (int i = 0; i < elemDb; i++) {
            szam = elso + kulonbs;
            elso = elso + kulonbs;
            tomb[i] += szam;
        }
        return tomb;
    }

    private static void kiir(String str) {
        System.out.println(str);
    }

}
