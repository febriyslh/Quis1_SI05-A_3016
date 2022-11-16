/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.quis1_si05.a_3016;

/**
 *
 * @author User
 */
public class Dokter_3016 extends Penduduk_3016{
    int jumlahPasien_3016;
    int jumlahObat_3016;
    double totalPendapatanDokter_3016;
    
    public void DataDokter(){
        System.out.println("Jumlah Pasien   : " + jumlahPasien_3016);
        System.out.println("Jumlah Obat     : " + jumlahObat_3016);       
    }
    
    public double totalPendapatanDokter (){
        return totalPendapatanDokter_3016 = (jumlahPasien_3016 * 50.000) + (jumlahObat_3016 * 10.000);
    }
}
