package org.designPrinciple.interfaceSegregationProblem;

public class BasicPrinter implements Printer {

    @Override
    public void print() {
      System.out.println("printer is working");
    }
}
