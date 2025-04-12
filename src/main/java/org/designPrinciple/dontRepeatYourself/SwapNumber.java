package org.designPrinciple.dontRepeatYourself;

public class SwapNumber {
    public void swap(int[] number){
        if(number.length>=2){
            int temp=number[0];
            number[0]=number[1];
            number[1]=temp;
        }
    }
}
