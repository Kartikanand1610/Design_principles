package org.designPrinciple.liskovSubstitutionPrinciple;

public class Bicycle extends NonEngineVehicle {
    @Override
    public void startEngine(){
        //in bicycle there is no engine
    }
}
