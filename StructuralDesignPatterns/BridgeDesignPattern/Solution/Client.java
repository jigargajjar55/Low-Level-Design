package StructuralDesignPatterns.BridgeDesignPattern.Solution;

import StructuralDesignPatterns.BridgeDesignPattern.Solution.Implementor.WaterBreatheImplementation;

public class Client {
    
    public static void main(String[] args) {
        
        LivingThings fishObject = new Fish(new WaterBreatheImplementation());

        fishObject.breatheProcess();
    }
}
