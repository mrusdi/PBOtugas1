package com.company;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String nama, nim;
        int banyak, angka[], i, max, min;
        angka=new int[100];
        float rata, total=0;

        Scanner input= new Scanner(System.in);
        System.out.print("Nama : ");
        nama= input.next();
        System.out.print("Nim : ");
        nim=input.next();
        System.out.print("Berapa nilai yang diinputkan : ");
        banyak=input.nextInt();

        for(i=1;i<=banyak;i++)
        {
            System.out.print("Nilai ke ["+i+"] : ");
            angka[i] = input.nextInt();
            total = total + angka[i];
        }
        max=angka[1];
        for(i=1; i<=banyak; i++)
        {
            if(angka[i]>max){
                max=angka[i];
            }
        }
        min=angka[1];
        for(i=1; i<=banyak; i++){
            if(angka[i]<min){
                min=angka[i];
            }
        }
        System.out.println("\nNama: "+nama);
        System.out.println("Nim: "+nim);
        System.out.println("Nilai Terkecilnya adalah : "+min);
        System.out.println("Nilai Makasimum adalah : "+max);
        rata = total/banyak;
        System.out.println("Hasil rata-rata adalah : " + rata);


    }

}
