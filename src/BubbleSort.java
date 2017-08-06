/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shiva
 */
public class BubbleSort {
    static void swap(int A[], int a, int b){
    int temp;
   
    }
    
    public static void main(String...args){
    int a[] = {9, 4, 10, 1, 3, 7, 2};
    int len = a.length;
    int temp;
    // variable to keep track of swapping
    boolean swapped = false;
    for(int j = 0; j< len - 1; j++){
        // each pass through the entire array
        for(int i=0; i < len - 1; i++){
            if(a[i] > a[i+1]){
            temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
            swapped = true;
            }
        }
        if(swapped == false)
            break;
    }
    for(int tem: a)
            System.out.print(tem + " ");
    }
}
