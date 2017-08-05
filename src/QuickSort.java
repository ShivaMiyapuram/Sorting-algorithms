/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shiva
 */
public class QuickSort {
    
    static int partition(int[] A, int p, int q){
       // set the pivot as the last element
       int pivot  = A[q];
       // i is a pointer beyond which the elements greater than pivot are stored
       int i = p-1;
       int r = A.length;
       int j;
        for(j = p; j < r; j++){
            if(A[j] <= pivot){
                // increment i
                i++;
                // exchange a[i] and a[j]
                int temp;
                temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }
        q = i+1;
       int temp;
       temp = A[i+1];
       A[i+1] = A[r];
       A[r] = temp;           
       // j is pointer for iterating through the array
       return q;
    }
    
    static void quickSort(int[] a, int p , int r){
        if(p < r){
            int q = partition(a, p, r);
            quickSort(a, p, q-1);
            quickSort(a, q+1, r );
        }
    }
    
    public static void main(String...args){
        int []a = {9, 6, 5, 0, 8, 2, 7};
        quickSort(a, 0, 6);
        for(int temp: a)
        System.out.println(a);
    }
    
}
