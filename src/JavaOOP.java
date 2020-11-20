import model.Student;

public class JavaOOP {
    public static void main(String[] args) {
        Student s = new Student("Ernest", 22, 'M', "123213");
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Gender: " + s.getGender());
        System.out.println("ID: " + s.getID());
    }
}
