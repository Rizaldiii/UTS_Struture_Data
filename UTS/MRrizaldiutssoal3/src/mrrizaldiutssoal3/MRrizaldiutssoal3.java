/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrrizaldiutssoal3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ardin
 */
public class MRrizaldiutssoal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    List<mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new mahasiswa(2255201, "Muhamad Rizki Rizaldi", "TIFRM22A", 181122));
        mahasiswaList.add(new mahasiswa(2255202, "Ardi naufal", "TIFRM22A", 181122));
        mahasiswaList.add(new mahasiswa(2255203, "Didhan aditya huda ", "TIFRM22A", 181122));
        mahasiswaList.add(new mahasiswa(2255204, "Saepuloh", "TIFRM22A", 181122));
        mahasiswaList.add(new mahasiswa(2255205, "Anwar Lukman", "TIFRM22A", 181122));

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
        mahasiswaList.remove(0);

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
    }

}