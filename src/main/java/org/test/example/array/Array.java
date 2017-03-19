/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test.example.array;

/**
 *
 * @author Ahmed Nashaat Ali
 */
class Array {

   public int[] addOneToArray(int[] input) {
           int remain=1;
           for(int i=input.length-1;i>=0;i--){
               int sum=remain+input[i];
               if(sum==10){
                   remain=1;
                   sum=0;
               }else{
                   remain=0;
               }
               input[i]=sum;
           }
           if(remain==1){
               return addElementAtTheBeginingOfArray(input, remain);
           }
           return input;
    }

    private int[] addElementAtTheBeginingOfArray(int[] input, int remain) {
        int res[]=new int[input.length+1];
        res[0]=remain;
        for(int i=1;i<input.length;i++)res[i+1]=input[i];
        return res;
    }
    
}
