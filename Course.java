public class Course {
    private String courseName;
    private String[] students=new String[100];
    private int numberOfstudents;

    public Course(String courseName){
        this.courseName=courseName;
    }
    public void addStudents(String student){
        students[numberOfstudents]=student;
        numberOfstudents++;
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfstudents(){
        return numberOfstudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudents(String student){

    }
}
