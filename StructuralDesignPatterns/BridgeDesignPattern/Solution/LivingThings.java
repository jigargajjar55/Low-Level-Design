package StructuralDesignPatterns.BridgeDesignPattern.Solution;

import StructuralDesignPatterns.BridgeDesignPattern.Solution.Implementor.BreatheImplementor;

public abstract class LivingThings {

    BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor){
        this.breatheImplementor = breatheImplementor;
    }

    abstract public void breatheProcess();
}
