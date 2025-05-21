package StructuralDesignPatterns.CompositeDesignPattern.Solution1WithCompositeDesign;

public class File implements FileSystem {
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void ls(int depth) {
        System.out.println("  ".repeat(depth) + "File: " + this.fileName);
    }
}
