/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.quis1_si05.a_3016;

/**
 *
 * @author User
 */
public class Nelayan_3016 extends Penduduk_3016{
    int jumlahBeratIkan_3016;
    int jumlahSolar_3016;
    double totalPendapatanNelayan_3016;
    
    public double totalPendapatanNelayan(){
        return totalPendapatanNelayan_3016 = (jumlahBeratIkan_3016 * 8000) + (jumlahSolar_3016 + 10000);
    }
    public void DataNelayan(){
        System.out.println("Jumlah Berat Ikan : " + jumlahBeratIkan_3016);
        System.out.println("Jumlah Pakai Solar : " + jumlahSolar_3016);
    }   
}
