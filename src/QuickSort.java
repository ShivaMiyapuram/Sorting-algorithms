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
    
    static int partition(int[] A, int p, int r){
       // set the pivot as the last element and store it in a new variable
       int pivot  = A[r];
       // i is a pointer beyond which the elements greater than pivot are stored
       int i = p - 1;
       // j moves from p to r-1
       int j;
        for(j = p; j < r; j++){
            // Check if A[j] is less than or equal to pivot else ignore and increment j
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
       // i is a boundary between the elements less than or equal to pivot and greater than pivot 
       int q = i+1;
       int temp;
       // increment i and place the pivot at i+1(correct position) i.e., exchange A[i+1] and A[r]
       temp = A[i+1];
       A[i+1] = A[r];
       A[r] = temp;           
       // return the index of the pivot after it is moved to correct position
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
        quickSort(a, 0, a.length - 1);
        for(int temp: a)
        System.out.print(temp + " ");
    }
    
}
