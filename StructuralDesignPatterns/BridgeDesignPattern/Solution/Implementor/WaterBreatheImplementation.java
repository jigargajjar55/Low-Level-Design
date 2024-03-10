package StructuralDesignPatterns.BridgeDesignPattern.Solution.Implementor;

public class WaterBreatheImplementation implements BreatheImplementor {

    @Override
    public void breatheProcess() {

        System.out.println("Breathe through Gills");
        System.out.println("Inhale oxygen from Water");
        System.out.println("Exhale carbon dioxide");

    }

}
