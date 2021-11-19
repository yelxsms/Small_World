
public class TestCourse {
    public static void main(String[] args){
        Course course1 = new Course("Data Structures");
        Course course2=new Course("Database System");

        course1.addStudents("Peter Jnoes");
        course1.addStudents("Kitty");
        course2.addStudents("Lion");
        System.out.println("the number of the course1 is "+course1.getNumberOfstudents());
        System.out.println("the name of the course1 is "+course1.getCourseName());
        System.out.println("the name of the course2 is "+course2.getCourseName());
    }
}
