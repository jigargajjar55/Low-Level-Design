package StructuralDesignPatterns.CompositeDesignPattern.Solution1WithCompositeDesign;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj) {
        fileSystemList.add(fileSystemObj);
    }

    @Override
    public void ls() {

        System.out.println("Directory Name: " + directoryName);

        for (FileSystem files : fileSystemList) {
            files.ls();
        }

    }

}
