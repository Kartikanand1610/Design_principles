package org.designPrinciple.dependencyInversionProblem;

public class DebitCard implements BankCard{

    @Override
    public void doTransaction(long amount) {
        System.out.println("Debit card in use");
    }
}
