/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.praktikumpbo.quis1_si05.a_3016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class Quis1_SI05A_3016 {

    public static void main(String[] args) throws IOException {
        //Menambah Objek
        Nelayan_3016 n1 = new Nelayan_3016();
        Nelayan_3016 n2 = new Nelayan_3016();
        Dokter_3016 d1 = new Dokter_3016();
        Dokter_3016 d2 = new Dokter_3016();
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        try {
            System.out.println("NIK : ");
            n1.nik_3016 = br.readLine();
            System.out.println("Nama : ");
            n1.nama_3016 = br.readLine();
            System.out.println("Umur : ");
            n1.umur_3016 = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            n1.alamat_3016 = br.readLine();
            System.out.println("Jml Berat Ikan : ");
            n1.jumlahBeratIkan_3016 = Integer.parseInt(br.readLine());
            System.out.println("Jml Pakai Solar : ");
            n1.jumlahSolar_3016 = Integer.parseInt(br.readLine());
        
            System.out.println("");
            
            System.out.println("NIK : ");
            n2.nik_3016 = br.readLine();
            System.out.println("Nama : ");
            n2.nama_3016 = br.readLine();
            System.out.println("Umur : ");
            n2.umur_3016 = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            n2.alamat_3016 = br.readLine();
            System.out.println("Jml Berat Ikan : ");
            n2.jumlahBeratIkan_3016 = Integer.parseInt(br.readLine());
            System.out.println("Jml Pakai Solar : ");
            n2.jumlahSolar_3016 = Integer.parseInt(br.readLine());
            
            System.out.println("NIK : ");
            d1.nik_3016 = br.readLine();
            System.out.println("Nama : ");
            d1.nama_3016 = br.readLine();
            System.out.println("Umur : ");
            d1.umur_3016= Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            d1.alamat_3016 = br.readLine();
            System.out.println("Jml Pasien : ");
            d1.jumlahPasien_3016 = Integer.parseInt(br.readLine());
            System.out.println("Jml Obat : ");
            d1.jumlahObat_3016 = Integer.parseInt(br.readLine());
            

            System.out.println();

            System.out.println("NIK : ");
            d2.nik_3016 = br.readLine();
            System.out.println("Nama : ");
            d2.nama_3016 = br.readLine();
            System.out.println("Umur : ");
            d2.umur_3016 = Integer.parseInt(br.readLine());
            System.out.println("Alamat : ");
            d2.alamat_3016 = br.readLine();
            System.out.println("Jml Pasien : ");
            d2.jumlahPasien_3016 = Integer.parseInt(br.readLine());
            System.out.println("Jml Obat : ");
            d2.jumlahObat_3016 = Integer.parseInt(br.readLine());
       

            System.out.println("=========== DATA NELAYAN ===========");
            n1.tampilDataPenduduk();
            n1.DataNelayan();
            n1.totalPendapatanNelayan();
            
            System.out.println();
            
            n2.tampilDataPenduduk();
            n2.DataNelayan();
            n2.totalPendapatanNelayan();
            
            System.out.println("=========== DATA DOKTER ===========");
            
            d1.tampilDataPenduduk();
            d1.DataDokter();
            d1.totalPendapatanDokter();
            
            System.out.println();
            
            d2.tampilDataPenduduk();
            d2.DataDokter();
            d2.totalPendapatanDokter();

        } catch (IOException eox) // menangkap kesalahan
        {
            System.out.println(eox);
        }
    }
}

        