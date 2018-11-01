import java.util.*;
import java.util.ArrayList;
public abstract class Course {

    // attributes
    private String courseCode;
    private String professor;
    private int takenSlots;
    private int totalSlots;

    public Course(String courseCode, String professor, int takenSlots, int totalSlots){
        this.courseCode = courseCode;
        this.professor = professor;
        this.takenSlots = takenSlots;
        this.totalSlots = totalSlots;
    }
    public abstract void lecture();

    Scanner sc = new Scanner(System.in);
    ArrayList<Course> labList = new ArrayList<>(); // objects instantiated will include courseCode + details which is variable
    ArrayList<Course> tutorialList = new ArrayList<>();

    // methods
    public int checkSlotAvalailability(){ // what are the parameters?
        System.out.println("Out of " + totalSlots + " slots in total, " + (totalSlots-takenSlots) + " are available.");
        return (totalSlots-takenSlots);
    }

    public String getCourseCode(){return courseCode;}

    public void setCourseCode(String courseCode){this.courseCode = courseCode;}

    public String getProfessor(){return professor;}

    public void setProfessor(){this.professor = professor;}
}