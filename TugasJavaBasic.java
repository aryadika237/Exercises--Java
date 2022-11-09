import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TugasJavaBasic {
        public static void main(String[] args) {
                Scanner tugas = new Scanner(System.in);

                int className1 = 1;
                int className2 = 1;
                int className3 = 1;
                String name = "Administrator";
                String pin = "123456789";
                String pas;
                String unic;
                String font;
                float nilai;
                float konversi;
                int π = 22 / 7;

                int menu = 1;
                int sistem1 = 1;
                int sistem2 = 1;
                int sistem3 = 1;
                int sistem4 = 1;
                int sistem5 = 1;
                int sistem6 = 1;
                int sistem7 = 1;
                int sistem8 = 1;
                do {
                        System.out.println("Silahkan Isi Data Terlebih Dahulu ");
                        switch (className1) {
                                case 1:
                                        System.out.print("Name : ");
                                        name = tugas.nextLine();
                                        if (name.length() == 13 && name.equals("Administrator")) {
                                                do {
                                                        switch (className2) {
                                                                case 1:
                                                                        System.out.print(
                                                                                        "Password : ");
                                                                        pas = tugas.nextLine();
                                                                        if (pas.length() >= 5
                                                                                        || pas.equals("")) {
                                                                                do {
                                                                                        switch (className3) {
                                                                                                case 1:
                                                                                                        System.out.print(
                                                                                                                        "Pin: ");
                                                                                                        pin = tugas.nextLine();
                                                                                                        if (pin.length() == 9
                                                                                                                        && pin.equals("123456789")) {
                                                                                                                System.out.println(
                                                                                                                                "Akses Diterima, Selamat Datang!!!");
                                                                                                                do {
                                                                                                                        System.out.print(
                                                                                                                                        "Silahkan Pilih Menu : \n"
                                                                                                                                                        + "1).Bangun Ruang/Datar \n"
                                                                                                                                                        + "2).Konversi \n"
                                                                                                                                                        + "3).Secret Menu \n"
                                                                                                                                                        + "4).Exit \n");
                                                                                                                        System.out.print(
                                                                                                                                        "Silahkan Pilih : ");
                                                                                                                        menu = tugas.nextInt();
                                                                                                                        switch (menu) {
                                                                                                                                case 1:
                                                                                                                                        do {
                                                                                                                                                System.out.println(
                                                                                                                                                                "Silahkan Pilih Menu : \n"
                                                                                                                                                                                + "1).Luas (Meter Kuadrat) \n"
                                                                                                                                                                                + "2).Volume (Liter) \n"
                                                                                                                                                                                + "3).Exit ");
                                                                                                                                                System.out.print(
                                                                                                                                                                "Silahkan Pilih : ");
                                                                                                                                                sistem2 = tugas.nextInt();
                                                                                                                                                switch (sistem2) {
                                                                                                                                                        case 1:
                                                                                                                                                                do {
                                                                                                                                                                        System.out.println(
                                                                                                                                                                                        "Silahkan Pilih Menu : \n"
                                                                                                                                                                                                        + "1).Persegi Panjang \n"
                                                                                                                                                                                                        + "2).Persegi \n"
                                                                                                                                                                                                        + "3).Segitiga \n"
                                                                                                                                                                                                        + "4).Lingkaran \n"
                                                                                                                                                                                                        + "5).Exit ");
                                                                                                                                                                        System.out.print(
                                                                                                                                                                                        "Silahkan Pilih : ");
                                                                                                                                                                        sistem3 = tugas.nextInt();
                                                                                                                                                                        switch (sistem3) {
                                                                                                                                                                                case 1:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Rumus Luasnya Adalah (Panjang x Lebar)");
                                                                                                                                                                                        int a = tugas.nextInt();
                                                                                                                                                                                        int b = tugas.nextInt();
                                                                                                                                                                                        int hasil1 = a * b;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasil dari Penjumlahan Anda Adalah : "
                                                                                                                                                                                                                        + hasil1);
                                                                                                                                                                                        break;
                                                                                                                                                                                case 2:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Rumus Luasnya Adalah (Sisi x Sisi)");
                                                                                                                                                                                        int c = tugas.nextInt();
                                                                                                                                                                                        int d = tugas.nextInt();
                                                                                                                                                                                        int hasil2 = c * d;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasil dari Penjumlahan Anda Adalah : "
                                                                                                                                                                                                                        + hasil2);
                                                                                                                                                                                        break;
                                                                                                                                                                                case 3:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Rumus Luasnya Adalah (Alas x Tinggi : 2)");
                                                                                                                                                                                        int e = tugas.nextInt();
                                                                                                                                                                                        int f = tugas.nextInt();
                                                                                                                                                                                        int g = tugas.nextInt();
                                                                                                                                                                                        int hasil3 = e * f
                                                                                                                                                                                                        / g;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasil dari Penjumlahan Anda Adalah : "
                                                                                                                                                                                                                        + hasil3);
                                                                                                                                                                                        break;
                                                                                                                                                                                case 4:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Rumus Luasnya Adalah (π x r x r)");
                                                                                                                                                                                        int h = tugas.nextInt();
                                                                                                                                                                                        int i = tugas.nextInt();
                                                                                                                                                                                        int hasil4 = π * h
                                                                                                                                                                                                        * i;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasil dari Penjumlahan Anda Adalah : "
                                                                                                                                                                                                                        + hasil4);
                                                                                                                                                                                        break;
                                                                                                                                                                                default:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Exit");
                                                                                                                                                                        }

                                                                                                                                                                } while (sistem3 < 5);
                                                                                                                                                                break;
                                                                                                                                                        case 2:
                                                                                                                                                                do {
                                                                                                                                                                        System.out.println(
                                                                                                                                                                                        "Silahkan Pilih Menu : \n"
                                                                                                                                                                                                        + "1).Balok \n"
                                                                                                                                                                                                        + "2).Kubus \n"
                                                                                                                                                                                                        + "3).Bola \n"
                                                                                                                                                                                                        + "4).Exit ");
                                                                                                                                                                        System.out.print(
                                                                                                                                                                                        "Silahkan Pilih : ");
                                                                                                                                                                        sistem3 = tugas.nextInt();
                                                                                                                                                                        switch (sistem3) {
                                                                                                                                                                                case 1:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Rumus Luasnya Adalah (Panjang x Lebar x Tinggi)");
                                                                                                                                                                                        int a = tugas.nextInt();
                                                                                                                                                                                        int b = tugas.nextInt();
                                                                                                                                                                                        int c = tugas.nextInt();
                                                                                                                                                                                        int hasil1 = a * b
                                                                                                                                                                                                        * c;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasil dari Penjumlahan Anda Adalah : "
                                                                                                                                                                                                                        + hasil1);
                                                                                                                                                                                        break;
                                                                                                                                                                                case 2:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Rumus Luasnya Adalah (Sisi x Sisi x Sisi)");
                                                                                                                                                                                        int d = tugas.nextInt();
                                                                                                                                                                                        int e = tugas.nextInt();
                                                                                                                                                                                        int f = tugas.nextInt();
                                                                                                                                                                                        int hasil2 = d * e
                                                                                                                                                                                                        * f;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasil dari Penjumlahan Anda Adalah : "
                                                                                                                                                                                                                        + hasil2);
                                                                                                                                                                                        break;
                                                                                                                                                                                case 3:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Rumus Luasnya Adalah (4 x π x r x r x r)");
                                                                                                                                                                                        int g = tugas.nextInt();
                                                                                                                                                                                        int h = tugas.nextInt();
                                                                                                                                                                                        int i = tugas.nextInt();
                                                                                                                                                                                        int hasil3 = 4 / 3
                                                                                                                                                                                                        * π
                                                                                                                                                                                                        * g
                                                                                                                                                                                                        * h
                                                                                                                                                                                                        * i;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasil dari Penjumlahan Anda Adalah : "
                                                                                                                                                                                                                        + hasil3);
                                                                                                                                                                                        break;
                                                                                                                                                                                default:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Exit");
                                                                                                                                                                        }
                                                                                                                                                                } while (sistem3 < 4);
                                                                                                                                                                break;
                                                                                                                                                        default:
                                                                                                                                                                System.out.println(
                                                                                                                                                                                "Exit");
                                                                                                                                                }
                                                                                                                                        } while (sistem2 < 2);
                                                                                                                                        break;
                                                                                                                                case 2:
                                                                                                                                        do {
                                                                                                                                                System.out.println(
                                                                                                                                                                "Silahkan Pilih Menu : \n"
                                                                                                                                                                                + "1).Derajat \n"
                                                                                                                                                                                + "2).Panjang (Meter) \n"
                                                                                                                                                                                + "3).Berat (Gram) \n"
                                                                                                                                                                                + "4).Exit");
                                                                                                                                                System.out.print(
                                                                                                                                                                "Silahkan Pilih : ");
                                                                                                                                                sistem4 = tugas.nextInt();
                                                                                                                                                switch (sistem4) {
                                                                                                                                                        case 1:
                                                                                                                                                                do {
                                                                                                                                                                        System.out.println(
                                                                                                                                                                                        "Silahkan Pilih Menu : \n"
                                                                                                                                                                                                        + "1).Celcius \n"
                                                                                                                                                                                                        + "2).Reamur \n"
                                                                                                                                                                                                        + "3).Fahrenheit \n"
                                                                                                                                                                                                        + "4).Exit");
                                                                                                                                                                        System.out.print(
                                                                                                                                                                                        "Silahkan Pilih : ");
                                                                                                                                                                        sistem5 = tugas.nextInt();
                                                                                                                                                                        switch (sistem5) {
                                                                                                                                                                                case 1:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Rumus Celcius ke Reamur Adalah (R = 4/5 x nilai°C)");
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Silahkan Masukan Nilai Yang Ingin Di jumlahkan!");
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Nilai : ");
                                                                                                                                                                                        int a = 4, b;
                                                                                                                                                                                        b = tugas.nextInt();
                                                                                                                                                                                        int hasil1 = a * b;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasil dari Penjumlahan Anda Adalah : "
                                                                                                                                                                                                                        + hasil1
                                                                                                                                                                                                                        + " °R ");
                                                                                                                                                                                        break;
                                                                                                                                                                                case 2:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Rumus Reamur ke Fahrenheit Adalah (F = 9/4 x nilai (+32) °R)");
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Silahkan Masukan Nilai Yang Ingin Di jumlahkan!");
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Nilai : ");

                                                                                                                                                                                        int c = 9, d = 4,
                                                                                                                                                                                                        e = 32;
                                                                                                                                                                                        int f = tugas.nextInt();
                                                                                                                                                                                        d = tugas.nextInt();
                                                                                                                                                                                        int hasil2 = f / d
                                                                                                                                                                                                        * c
                                                                                                                                                                                                        + e;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasil dari Penjumlahan Anda Adalah : "
                                                                                                                                                                                                                        + hasil2
                                                                                                                                                                                                                        + " °F ");
                                                                                                                                                                                        break;
                                                                                                                                                                                case 3:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Rumus Fahrenheit ke Celcius Adalah (C =  9 x nilai / 5 + (+32) °F)");
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Silahkan Masukan Nilai Yang Ingin Di jumlahkan!");
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Nilai : ");
                                                                                                                                                                                        int g = 9, h = 5,
                                                                                                                                                                                                        i = 32;
                                                                                                                                                                                        int j = tugas.nextInt();
                                                                                                                                                                                        h = tugas.nextInt();
                                                                                                                                                                                        int hasil3 = g * j
                                                                                                                                                                                                        / h
                                                                                                                                                                                                        + i;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasil dari Penjumlahan Anda Adalah : "
                                                                                                                                                                                                                        + hasil3
                                                                                                                                                                                                                        + " °C ");
                                                                                                                                                                                        break;
                                                                                                                                                                                default:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Exit");
                                                                                                                                                                        }
                                                                                                                                                                } while (sistem5 < 4);
                                                                                                                                                                break;
                                                                                                                                                        case 2:
                                                                                                                                                                do {
                                                                                                                                                                        System.out.println(
                                                                                                                                                                                        "Silahkan Pilih Menu : \n"
                                                                                                                                                                                                        + "1).Mili Meter \n"
                                                                                                                                                                                                        + "2).Centi Meter \n"
                                                                                                                                                                                                        + "3).Desi Meter   \n"
                                                                                                                                                                                                        + "4).Meter \n"
                                                                                                                                                                                                        + "5).Deka Meter \n"
                                                                                                                                                                                                        + "6).Hekto Meter \n"
                                                                                                                                                                                                        + "7).Kilo Meter \n"
                                                                                                                                                                                                        + "8).Exit ");
                                                                                                                                                                        System.out.println(
                                                                                                                                                                                        "Konversi Satuan Meter");
                                                                                                                                                                        System.out.print(
                                                                                                                                                                                        "Silahkan Pilih : ");
                                                                                                                                                                        sistem6 = tugas.nextInt();
                                                                                                                                                                        switch (sistem6) {
                                                                                                                                                                                case 1:
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Masukan nilai yang ingin di hitung : ");
                                                                                                                                                                                        konversi = tugas.nextInt();
                                                                                                                                                                                        nilai = konversi * 1000;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasilnya : " + nilai
                                                                                                                                                                                                                        + " Mili Meter ");
                                                                                                                                                                                        break;
                                                                                                                                                                                case 2:
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Masukan nilai yang ingin di hitung : ");
                                                                                                                                                                                        konversi = tugas.nextInt();
                                                                                                                                                                                        nilai = konversi * 100;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasilnya : " + nilai
                                                                                                                                                                                                                        + " Centi Meter ");
                                                                                                                                                                                        break;
                                                                                                                                                                                case 3:
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Masukan nilai yang ingin di hitung : ");
                                                                                                                                                                                        konversi = tugas.nextInt();
                                                                                                                                                                                        nilai = konversi * 10;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasilnya : " + nilai
                                                                                                                                                                                                                        + " Desi Meter ");
                                                                                                                                                                                        break;
                                                                                                                                                                                case 4:
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Masukan nilai yang ingin di hitung : ");
                                                                                                                                                                                        konversi = tugas.nextInt();
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasilnya : "
                                                                                                                                                                                                                        + (konversi)
                                                                                                                                                                                                                        + " Meter ");
                                                                                                                                                                                        break;
                                                                                                                                                                                case 5:
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Masukan nilai yang ingin di hitung : ");
                                                                                                                                                                                        konversi = tugas.nextInt();
                                                                                                                                                                                        nilai = konversi / 10;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasilnya : " + nilai
                                                                                                                                                                                                                        + " Deka Meter ");
                                                                                                                                                                                        break;
                                                                                                                                                                                case 6:
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Masukan nilai yang ingin di hitung : ");
                                                                                                                                                                                        konversi = tugas.nextInt();
                                                                                                                                                                                        nilai = konversi / 100;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasilnya : " + nilai
                                                                                                                                                                                                                        + " Hekto Meter ");
                                                                                                                                                                                        break;
                                                                                                                                                                                case 7:
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Masukan nilai yang ingin di hitung : ");
                                                                                                                                                                                        konversi = tugas.nextInt();
                                                                                                                                                                                        nilai = konversi / 1000;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasilnya : " + nilai
                                                                                                                                                                                                                        + " Kilo Meter ");
                                                                                                                                                                                        break;
                                                                                                                                                                                default:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Exit");
                                                                                                                                                                        }
                                                                                                                                                                } while (sistem6 < 8);
                                                                                                                                                                break;
                                                                                                                                                        case 3:
                                                                                                                                                                do {
                                                                                                                                                                        System.out.println(
                                                                                                                                                                                        "Silahkan Pilih Menu : \n"
                                                                                                                                                                                                        + "1.Mili Gram \n"
                                                                                                                                                                                                        + "2.Centi Gram \n"
                                                                                                                                                                                                        + "3.Desi Gram   \n"
                                                                                                                                                                                                        + "4.Gram \n"
                                                                                                                                                                                                        + "5.Deka Gram \n"
                                                                                                                                                                                                        + "6.Hekto Gram \n"
                                                                                                                                                                                                        + "7.Kilo Gram \n"
                                                                                                                                                                                                        + "8.Exit");
                                                                                                                                                                        System.out.println(
                                                                                                                                                                                        "Konversi Satuan Gram");
                                                                                                                                                                        System.out.print(
                                                                                                                                                                                        "Silahkan Pilih : ");
                                                                                                                                                                        sistem7 = tugas.nextInt();
                                                                                                                                                                        switch (sistem7) {
                                                                                                                                                                                case 1:
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Masukan nilai yang ingin di hitung : ");
                                                                                                                                                                                        konversi = tugas.nextInt();
                                                                                                                                                                                        nilai = konversi * 1000;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasilnya : " + nilai
                                                                                                                                                                                                                        + " Mili Gram ");
                                                                                                                                                                                        break;
                                                                                                                                                                                case 2:
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Masukan nilai yang ingin di hitung : ");
                                                                                                                                                                                        konversi = tugas.nextInt();
                                                                                                                                                                                        nilai = konversi * 100;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasilnya : " + nilai
                                                                                                                                                                                                                        + " Centi Gram ");
                                                                                                                                                                                        break;
                                                                                                                                                                                case 3:
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Masukan nilai yang ingin di hitung : ");
                                                                                                                                                                                        konversi = tugas.nextInt();
                                                                                                                                                                                        nilai = konversi * 10;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasilnya : " + nilai
                                                                                                                                                                                                                        + " Desi Gram ");
                                                                                                                                                                                        break;
                                                                                                                                                                                case 4:
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Masukan nilai yang ingin di hitung : ");
                                                                                                                                                                                        konversi = tugas.nextInt();
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasilnya : "
                                                                                                                                                                                                                        + (konversi)
                                                                                                                                                                                                                        + " Gram ");
                                                                                                                                                                                        break;
                                                                                                                                                                                case 5:
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Masukan nilai yang ingin di hitung : ");
                                                                                                                                                                                        konversi = tugas.nextInt();
                                                                                                                                                                                        nilai = konversi / 10;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasilnya : " + nilai
                                                                                                                                                                                                                        + " Deka Gram ");
                                                                                                                                                                                        break;
                                                                                                                                                                                case 6:
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Masukan nilai yang ingin di hitung : ");
                                                                                                                                                                                        konversi = tugas.nextInt();
                                                                                                                                                                                        nilai = konversi / 100;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasilnya : " + nilai
                                                                                                                                                                                                                        + " Hekto Gram ");
                                                                                                                                                                                        break;
                                                                                                                                                                                case 7:
                                                                                                                                                                                        System.out.print(
                                                                                                                                                                                                        "Masukan nilai yang ingin di hitung : ");
                                                                                                                                                                                        konversi = tugas.nextInt();
                                                                                                                                                                                        nilai = konversi / 1000;
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Hasilnya : " + nilai
                                                                                                                                                                                                                        + " Kilo Gram ");
                                                                                                                                                                                        break;
                                                                                                                                                                                default:
                                                                                                                                                                                        System.out.println(
                                                                                                                                                                                                        "Exit");
                                                                                                                                                                        }
                                                                                                                                                                } while (sistem7 < 8);
                                                                                                                                                                break;
                                                                                                                                                        default:
                                                                                                                                                                System.out.println(
                                                                                                                                                                                "Exit");
                                                                                                                                                }
                                                                                                                                        } while (sistem4 < 4);
                                                                                                                                        break;
                                                                                                                                case 3:
                                                                                                                                        do {
                                                                                                                                                System.out.print(
                                                                                                                                                                "Input Value Secret Menu : ");
                                                                                                                                                unic = tugas.next();
                                                                                                                                                if (unic.length() <= 10
                                                                                                                                                                && unic.length() >= 7) {
                                                                                                                                                        System.out.println(
                                                                                                                                                                        "Selamat Datang VIP!");
                                                                                                                                                        do {
                                                                                                                                                                System.out.println(
                                                                                                                                                                                "Silahkan Pilih Menu Rahasia : \n"
                                                                                                                                                                                                + "1).Uppercase \n"
                                                                                                                                                                                                + "2).Lowercase \n"
                                                                                                                                                                                                + "3).Reverse \n"
                                                                                                                                                                                                + "4).Exit");
                                                                                                                                                                System.out.print(
                                                                                                                                                                                "Silahkan Pilih : ");
                                                                                                                                                                sistem8 = tugas.nextInt();
                                                                                                                                                                switch (sistem8) {
                                                                                                                                                                        case 1:
                                                                                                                                                                                System.out.print(
                                                                                                                                                                                                "Masukan Teks : ");
                                                                                                                                                                                tugas.nextLine();
                                                                                                                                                                                font = tugas.nextLine()
                                                                                                                                                                                                .toUpperCase();
                                                                                                                                                                                System.out.println(
                                                                                                                                                                                                "Teks Uppercase : "
                                                                                                                                                                                                                + font);
                                                                                                                                                                                break;
                                                                                                                                                                        case 2:
                                                                                                                                                                                System.out.print(
                                                                                                                                                                                                "Masukan Teks : ");
                                                                                                                                                                                tugas.nextLine();
                                                                                                                                                                                font = tugas.nextLine()
                                                                                                                                                                                                .toLowerCase();
                                                                                                                                                                                System.out.println(
                                                                                                                                                                                                "Teks Lowercase : "
                                                                                                                                                                                                                + font);
                                                                                                                                                                                break;
                                                                                                                                                                        case 3:
                                                                                                                                                                                System.out.print(
                                                                                                                                                                                                "Masukan Teks : ");
                                                                                                                                                                                String rever;
                                                                                                                                                                                tugas.nextLine();
                                                                                                                                                                                rever = tugas.nextLine();
                                                                                                                                                                                List<String> list = Arrays
                                                                                                                                                                                                .asList(rever.split(
                                                                                                                                                                                                                " "));
                                                                                                                                                                                Collections.reverse(
                                                                                                                                                                                                list);
                                                                                                                                                                                System.out.println(
                                                                                                                                                                                                String.join(" ", list));
                                                                                                                                                                                break;
                                                                                                                                                                        default:
                                                                                                                                                                                System.out.println(
                                                                                                                                                                                                "Exit");
                                                                                                                                                                }
                                                                                                                                                        } while (sistem8 < 4);
                                                                                                                                                        break;
                                                                                                                                                } else {
                                                                                                                                                        System.out.println(
                                                                                                                                                                        "Maaf Akses Ditolak");
                                                                                                                                                }
                                                                                                                                        } while (sistem8 < 5);
                                                                                                                                        break;
                                                                                                                                default:
                                                                                                                                        System.out.println(
                                                                                                                                                        "Sistem Off Harus Run Ulang!");
                                                                                                                                        break;
                                                                                                                        }
                                                                                                                } while (sistem1 < 4);
                                                                                                                tugas.close();
                                                                                                        } else {
                                                                                                                System.out.println(
                                                                                                                                "Error, Pastikan Kode Yang Anda Masukan Sudah Benar!");
                                                                                                        }
                                                                                                        break;
                                                                                                default:
                                                                                                        System.out.println(
                                                                                                                        "Exit");
                                                                                        }
                                                                                } while (className3 < 2);

                                                                        } else {
                                                                                System.out.println(
                                                                                                "Error, Pastikan Kode Yang Anda Masukan Sudah Benar!");
                                                                        }
                                                                        break;

                                                                default:
                                                                        System.out.println("Exit");
                                                        }
                                                } while (className2 < 2);
                                        } else {
                                                System.out.println(
                                                                "Error, Pastikan Nama Yang Anda Masukan Sudah Benar!");
                                        }
                                        break;
                                default:
                                        System.out.println("Akses Ditolak");
                        }
                } while (className1 < 2);
                tugas.close();
        }
}
