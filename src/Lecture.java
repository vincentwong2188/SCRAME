/**
 * Represents a lecture. Is a subclass of Lesson.
 * @author Shen Chen
 * @version 1.0
 * @since 2018-10-24
 */
public class Lecture extends Lesson {

    /**
     * Contains the name of the lecturer.
     */
    private String lecturer;

    /**
     * Instantiates a new lecture. Name of the lecturer will be "Not Specified".
     * @param classID The class code of the lecture.
     * @param time The time of the lecture in 24 HRS format.
     * @param venue The venue of the lecture.
     */
    public Lecture(String classID, int time, String venue){
        super(classID, time, venue);
        this.lecturer = "Not Specified";
    }

    /**
     * Instantiates a new lecture.
     * @param classID The class code of the lecture.
     * @param time The time of the lecture in 24 HRS format.
     * @param venue The venue of the lecture.
     * @param lecturer The name of the lecturer.
     */
    public Lecture(String classID, int time, String venue, String lecturer){
        super(classID, time, venue);
        this.lecturer = lecturer;
    }

    /**
     * Method to set the name of the lecturer.
     * @param lecturer The name of the lecturer.
     */
    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    /**
     * Method to get the name of the lecturer.
     * @return The name of the lecturer.
     */
    public String getLecturer() {
        return lecturer;
    }
}
