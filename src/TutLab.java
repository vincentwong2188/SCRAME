/**
 * Represents a tutorial and a lab. Is a subclass of Lesson.
 * @author Shen Chen
 * @version 1.0
 * @since 2018-10-24
 */
public class TutLab extends Lesson {

    private String tutor;
    private int classSize;

    public TutLab(String classID, int time, String venue){
        super(classID, time, venue);
        this.tutor = "Not Specified";
        this.classSize = 0;
    }

    public TutLab(String classID, int time, String venue, String tutor, int classSize){
        super(classID, time, venue);
        this.tutor = tutor;
        this.classSize = classSize;
    }

    /**
     * Method to set the name of the tutor.
     * @param tutor The name of the tutor.
     */
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    /**
     * Method to set the maximum capacity of the tutorial session.
     * @param classSize The maximum capacity of the tutorial session.
     */
    public void setClassSize(int classSize) {
        this.classSize = classSize;
    }

    /**
     * Method to get the name of the tutor.
     * @return The name of the tutor.
     */
    public String getTutor() {
        return tutor;
    }

    /**
     * Method to get the maximum capacity of the tutorial session.
     * @return The maximum capacity of the tutorial session.
     */
    public int getClassSize() {
        return classSize;
    }

    /**
     * Method to get the vacancies of the tutorial session.
     * @return The vacancies of the tutorial session.
     */
    public int getVacancy(){
        return classSize - super.getStudentList().size();
    }

    /**
     * Adds a student into the class.
     * @param studentDatabase accepts an ArrayList of students to check if student exists.
     * @param studentId The unique identifier of the student.
     * @return Returns 0 if successful, 1 if student does not exist, 2 if student is already in the class, 3 if the class is full.
     */

    public int addStudent(ArrayList<Student> studentDatabase, String studentId) {
        if(getVacancy() > 0){
            return super.addStudent(studentDatabase, studentId);
        }
        else{
            return 3;
        }
    }
}
