package StructuralDesignPatterns.CompositeDesignPattern.Solution1WithCompositeDesign;

public class Main {

    public static void main(String[] args) {

        Directory movieDirectory = new Directory("Movie");

        File border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDir = new Directory("Comedy Movie");
        File hulchul = new File("HulChul");

        comedyMovieDir.add(hulchul);

        movieDirectory.add(comedyMovieDir);

        movieDirectory.ls();

    }
}
