package com.company;

/**
 * @author
 * Nama              : Joseph Armando Carvallo
 * Kelas             : PBO2
 * Nim               : 10117077
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     gradien garis lurus
 **/

public class Main {
    public static void main(String[] args) {
        Koordinat garis = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik ("+garis.getX1()+","+garis.getX2()+
                           ") dan "+"("+garis.getY1()+","+garis.getY2()+")");
        System.out.println("memiliki gradien sebesar : "+garis.hitungGradien());

        Koordinat garis1 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik ("+garis1.getX1()+","+garis1.getX2()+"" +
                           ") dan "+"("+garis1.getY1()+","+garis1.getY2()+")");
        System.out.println("memiliki gradien sebesar : "+garis1.hitungGradien());
    }
}