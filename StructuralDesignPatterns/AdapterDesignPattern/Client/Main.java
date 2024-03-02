
package StructuralDesignPatterns.AdapterDesignPattern.Client;

import StructuralDesignPatterns.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import StructuralDesignPatterns.AdapterDesignPattern.Adapter.*;

public class Main {

    public static void main(String args[]) {

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
