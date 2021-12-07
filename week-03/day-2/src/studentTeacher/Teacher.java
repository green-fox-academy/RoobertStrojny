package studentTeacher;

public class Teacher {
    String name;

    public Teacher(String name){
        this.name = name;
    }

    public void teach(Student student){
        student.learn();
    }

    public void giveAnswer(){
        System.out.println("the teacher is answering a question");
    }

    public static void main(String[] args) {
        Student student = new Student("student");
        Teacher teacher = new Teacher("teacher");

        student.question(teacher);
        teacher.teach(student);
    }
}
