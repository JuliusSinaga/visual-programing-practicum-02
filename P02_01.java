// 12S23035 - Julius Kaisar Bona Theo Sinaga

import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String tugas, kodematkul, matkul, dosenpengampu, deadline, nimnamamatkul, status, rekomendasitugas;
        int tingkatkesulitan, harihinggadeadline;
        double prioritas;

        tugas = input.nextLine();
        kodematkul = input.nextLine();
        matkul = input.nextLine();
        dosenpengampu = input.nextLine();
        deadline = input.nextLine();
        nimnamamatkul = input.nextLine();
        tingkatkesulitan = input.nextInt();
        harihinggadeadline = input.nextInt();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / harihinggadeadline);
        if (prioritas > 3.0) {
            rekomendasitugas = "Penting!Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas < 3.0 && prioritas > 1.5) {
                rekomendasitugas = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    rekomendasitugas = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println("Prioritas : " + toFixed(prioritas,2));
        System.out.println(tugas + "|" + kodematkul + "|" + matkul + "|" + dosenpengampu + "|" + deadline + "|" + nimnamamatkul + "|" + status + "|" + rekomendasitugas);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
