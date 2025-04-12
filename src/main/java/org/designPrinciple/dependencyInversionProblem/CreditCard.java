package org.designPrinciple.dependencyInversionProblem;

public class CreditCard implements BankCard{

    @Override
    public void doTransaction(long amount) {
        System.out.println("Credit card in use");
    }
}
