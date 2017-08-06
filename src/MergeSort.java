/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shiva
 */
public class MergeSort {
    
    static void merge(int[] A, int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for(int i = 0; i < n1; i++)
            L[i] = A[i + p];
        for(int i = 0; i < n2; i++)
            R[i] = A[i + q + 1];
        int x = 0, y = 0;
        
        for(int i = p; i <= r; i++){
            if(L[x] <= R[y]){
                A[i] = L[x];
                x++;
            }
            else{
                A[i] = R[y];
                y++;
            }
        }
       
    }
    
    static void mergeSort(int[] a, int p, int r){
        if(p < r){
            int q = (p + r)/2;
            mergeSort(a, p, q);
            mergeSort(a, q+1, r);
           // merge the lists from p to q and q+1 to r
            merge(a, p, q, r);
        
        
        }
    
    }
    
    public static void main(String...args){
        int []a = {9, 6, 5, 0, 8, 2, 7};
        mergeSort(a, 0, a.length - 1);
        for(int temp: a)
        System.out.print(temp + " ");
        
        
    }
    
    
}
