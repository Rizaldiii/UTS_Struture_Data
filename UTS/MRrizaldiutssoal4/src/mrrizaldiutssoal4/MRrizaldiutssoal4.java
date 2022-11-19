/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrrizaldiutssoal4;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author ardin
 */
public class MRrizaldiutssoal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<mahasiswa> mahasiswaList = new LinkedList<>();
        mahasiswaList.add(new mahasiswa(2255201, "Muhamad Rizki Rizaldi", "TIFRM22A", 181122));
        mahasiswaList.add(new mahasiswa(2255202, "Ardi Naufal", "TIFRM22A", 181122));
        mahasiswaList.add(new mahasiswa(2255203, "Didhan Aditya Huda", "TIRM22A", 181122));
        mahasiswaList.add(new mahasiswa(2255204, "Saepuloh", "TIFRM22A", 181122));
        mahasiswaList.add(new mahasiswa(2255205, "Anwar Lukman", "TIFRM22A", 181122));

        Scanner valueId = new Scanner(System.in);
        Scanner valueName = new Scanner(System.in);
        Scanner valueKelas = new Scanner(System.in);
        Scanner valueTanggal = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        System.out.println("Masukan Data Mahasiswa Untuk Ditambahkan");
        System.out.print("Masukan Id Mahasiswa : ");
        int id = valueId.nextInt();
        System.out.print("Masukan Nama Mahasiswa : ");
        String name = valueName.nextLine();
        System.out.print("Masukan Kelas Mahasiswa : ");
        String kelas = valueKelas.nextLine();
        System.out.print("Masukan Tanggal : ");
        int tanggal = valueTanggal.nextInt();

        mahasiswaList.add(new mahasiswa(id, name, kelas, tanggal));

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));

        System.out.println("Masukan Data Mahasiswa Untuk Dihapus");
        System.out.print("Masukan Nama Mahasiswa : ");
        String nameRemove = value.nextLine();
        mahasiswaList.removeIf(mahasiswa -> mahasiswa.getName().contains(nameRemove));
        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
    // TODO code application logic here
    }
    
}
