package StructuralDesignPatterns.CompositeDesignPattern.Solution1WithCompositeDesign;

public class Main {

    public static void main(String[] args) {

        Directory rootMovieDirectory = new Directory("\\");

        //File border = new File("Border");
        //rootMovieDirectory.add(border);

        Directory comedyMovieDir = new Directory("Comedy Movie");
        File hulchul = new File("HulChul");

        comedyMovieDir.add(hulchul);

        rootMovieDirectory.add(comedyMovieDir);



        Directory horrerMovieDir = new Directory("Horrer Movie");
        File Bhootnath = new File("Bhootnath");
        horrerMovieDir.add(Bhootnath);


        rootMovieDirectory.add(horrerMovieDir);

        rootMovieDirectory.ls(0);

    }
}
