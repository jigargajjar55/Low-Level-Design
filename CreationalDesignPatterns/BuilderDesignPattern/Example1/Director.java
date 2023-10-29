package BuilderDesignPattern.Example1;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){

        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }else{
            return null;
        }
    }

    private Student createEngineeringStudent(){

        return studentBuilder.setRollNumber(1).setName("Jigar").setAge(24).setSubjects().build();

    }

    private Student createMBAStudent(){
        return studentBuilder.setRollNumber(2).setName("Sonal").setAge(29).setSubjects().build();
    }
    
}
