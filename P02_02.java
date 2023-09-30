// 12S23035 - Julius Kaisar Bona Theo Sinaga

import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, aC, lantai, ketersediaanteknologi, kualitasgudang;
        int kapasitasgudang, jumlahbuku, skorgudang;

        namagudang = input.nextLine();
        kapasitasgudang = input.nextInt();
        jumlahbuku = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        skorgudang = (int) ((double) jumlahbuku / kapasitasgudang * 100);
        if (skorgudang >= 40) {
            kualitasgudang = "Gudang Elite";
        } else {
            if (skorgudang >= 25) {
                kualitasgudang = "Gudang Standar";
            } else {
                if (skorgudang < 25) {
                    kualitasgudang = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println("Informasi Gudang: ");
        System.out.println(namagudang + "|" + kapasitasgudang + "|" + jumlahbuku + "|" + aC + "|" + lantai + "|" + ketersediaanteknologi + "|" + skorgudang + "|" + kualitasgudang);
    }
}
