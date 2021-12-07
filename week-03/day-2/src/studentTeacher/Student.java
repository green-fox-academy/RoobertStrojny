package studentTeacher;

public class Student {
    String name;

    public Student(String name){
        this.name = name;
    }

    public void learn(){
        System.out.println(name + " is actually learning");
    }

    public void question(Teacher teacher){
        teacher.giveAnswer();
    }
}
