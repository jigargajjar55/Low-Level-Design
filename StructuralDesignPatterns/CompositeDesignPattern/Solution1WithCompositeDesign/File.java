package StructuralDesignPatterns.CompositeDesignPattern.Solution1WithCompositeDesign;

public class File implements FileSystem {
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void ls() {
        System.out.println("File name is: " + this.fileName);
    }
}
