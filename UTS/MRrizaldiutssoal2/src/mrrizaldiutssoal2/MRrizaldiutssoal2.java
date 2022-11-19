/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrrizaldiutssoal2;

import java.util.Scanner;

/**
 *
 * @author ardin
 */
public class MRrizaldiutssoal2 {
    static void bubbleSort (int [] arr){
        int a = arr.length;
        int b = 0;
        for (int i=0; i < a; i++){
            for (int j=1; j < (a-i); j++){
                if(arr[j-1] > arr [j]){
                    b = arr [j-1];
                    arr [j-1] = arr [j];
                    arr[j] = b;
                    
                }
            }
        }
    }
    
    public static void main (String[] args) {
        int arr[] = new int [10];
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Sebelum Bubble sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            arr[i] = keyboard.nextInt();
        }
        System.out.println();
        
        bubbleSort(arr);
        
        System.out.println("Sesudah bubble sort");
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}