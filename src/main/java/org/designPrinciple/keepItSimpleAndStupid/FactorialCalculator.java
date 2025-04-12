package org.designPrinciple.keepItSimpleAndStupid;

public class FactorialCalculator {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

}
