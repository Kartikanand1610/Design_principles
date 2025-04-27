package org.designPrinciple.liskovSubstitutionPrinciple;

public class Bicycle extends NonEngineVehicle {
    @Override
    public void move(){
        //in bicycle there is no engine
    }
}
