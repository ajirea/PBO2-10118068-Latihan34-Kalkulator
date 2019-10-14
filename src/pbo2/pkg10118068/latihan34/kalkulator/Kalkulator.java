/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan34.kalkulator;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Program kalkulator berbasis object
 */
public class Kalkulator {
    public double value1, value2;
    
    public double tambahBilangan() {
        return value1 + value2;
    }
    
    public double kurangBilangan() {
        return value1 - value2;
    }
    
    public double kaliBilangan() {
        return value1 * value2;
    }
    
    public double bagiBilangan() {
        return value1 / value2;
    }
    
    public double sisaBilangan() {
        return value1 % value2;
    }
}
