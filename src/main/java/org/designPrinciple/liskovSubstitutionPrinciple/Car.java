package org.designPrinciple.liskovSubstitutionPrinciple;

//liskov substitution principle
public class Car extends EngineVehicle {
    @Override
    public void startEngine(){
        //car specific engine starting topic
    }
}
