package StructuralDesignPatterns.BridgeDesignPattern.Solution.Implementor;

public class LandBreatheImplementation implements BreatheImplementor {

    @Override
    public void breatheProcess() {

        System.out.println("Breathe through Nose");
        System.out.println("Inhale oxygen from Air");
        System.out.println("Exhale carbon dioxide");

    }

}
