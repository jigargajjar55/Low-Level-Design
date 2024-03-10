package StructuralDesignPatterns.BridgeDesignPattern.Solution.Implementor;

public class TreeBreatheImplementation implements BreatheImplementor {

    @Override
    public void breatheProcess() {

        System.out.println("Breathe through Leaves");
        System.out.println("Inhale carbon dioxide");
        System.out.println("Exhale oxygen through photosynthesis");

    }

}
