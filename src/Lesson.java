import java.util.ArrayList;

/**
 * Represents a lesson. Is a superclass of Lecture, TutLab.
 * @author Shen Chen
 * @version 1.0
 * @since 2018-10-24
 */
public class Lesson {

    /**
     * The time in 24 HRS format of the lesson.
     */
    private int time;

    /**
     * The venue of the lesson.
     */
    private String venue;

    /**
     * The class code of the lesson.
     */
    private String classID;

    /**
     * Contains the list of students enrolled in the class.
     */
    private ArrayList<String> studentList = new ArrayList<>(0);

    /**
     * Creates a new lesson object, given the classID, the time and the venue.
     * @param classID The class identifier code.
     * @param time The time of the lesson in 24 HRS format.
     * @param venue The venue of the lesson.
     */
    public Lesson(String classID, int time, String venue){
        this.classID = classID;
        this.time = time;
        this.venue = venue;
    }

    /**
     * Method to set the time of the lesson.
     * @param time Time of the lesson in 24 HRS format.
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * Method to set the venue of the lesson.
     * @param venue The venue of the lesson.
     */
    public void setVenue(String venue) {
        this.venue = venue;
    }

    /**
     * Method to set the class code of the lesson.
     * @param classID The class code of the lesson.
     */
    public void setClassID(String classID) {
        this.classID = classID;
    }

    /**
     * Method to set the list of students that is enrolled in the class.
     * @param studentList ArrayList of student ID numbers.
     */
    public void setStudentList(ArrayList<String> studentList) {
        this.studentList = studentList;
    }

    /**
     * Method to get the time of the lesson.
     * @return The time of the lesson in 24 HRS format.
     */
    public int getTime() {
        return time;
    }

    /**
     * Method to get the venue of the lesson.
     * @return The venue of the lesson.
     */
    public String getVenue() {
        return venue;
    }

    /**
     * Method to get the class code of the lesson.
     * @return The class code of the lesson.
     */
    public String getClassID() {
        return classID;
    }

    /**
     * Gets list of students registered in the course.
     * @return an ArrayList of students of type String.
     */
    public ArrayList<String> getStudentList() {
        return studentList;
    }

    /**
     * Adds a student into the class.
     * @param data accepts a studentDatabase object to check if student exists.
     * @param studentId The unique identifier of the student.
     * @return Returns 0 if successful, 1 if student does not exist, 2 if student is already in the class.
     */
    public int addStudent(ArrayList<Student> data, String studentId){
        if(data.checkStudent(studentId)){
            for(int i = 0; i < studentList.size(); i++){
                if(studentList.get(i).equals(studentId)){
                    return 2;
                }
            }
            studentList.add(studentId);
            return 0;
        }
        else{
            return 1;
        }

    }
}
