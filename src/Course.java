import java.util.*;
import java.util.ArrayList;
public abstract class Course {

    // attributes
    private String courseCode;
    private String professor;
    private int takenSlots;
    private int totalSlots;

    public abstract void lecture();

    Scanner sc = new Scanner(System.in);
    ArrayList<Course> labList = new ArrayList<>(); // objects instantiated will include courseCode + details which is variable
    ArrayList<Course> tutorialList = new ArrayList<>();

    // methods
    /* public String addCourse(String courseCode) { // should this whole thing should be in an App Class cos this is an abstract class
        System.out.println("What is the new course code?");
        String newCourseCode = sc.next();
        System.out.println("How many slots are there in" + newCourseCode + "?");
        int totalSlots = sc.nextInt();
        System.out.println("What lessons will the new course have?");
        System.out.println("1. 1 Lecture");
        System.out.println("2. 1 Lecture and 2 Tutorials");
        System.out.println("3. 1 Lecture, 2 Tutorials and 2 Labs");
        int choice = sc.nextInt();
        ArrayList<Course> courseList = new ArrayList<>(); //eg: List<Model> models = new ArrayList<>();
        switch (choice) {
            case 1:
                String details = "1 Lecture";
                courseList.add(new Course(String courseCode, details));
                break;

            case 2:
                String details2 = "1 Lecture and 2 Tutorials"; //why cannot use details2
                courseList.add(new Course(String courseCode, details2));
                break;

            case 3:
                String details3 = "1 Lecture,  Tutorials and 2 Labs";
                courseList.add(new Course(String courseCode, details3));
                break;

            default:

                System.out.println("You have chosen an invalid option. Please enter the option again.");
        }
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println(courseList.get(i));
        }
        return "Your course has been successfully added!";
    } */

    public int checkSlotAvalailability(){ // what are the parameters?
        System.out.println("Out of " + totalSlots + " slots in total, " + (totalSlots-takenSlots) + " are available.");
        return (totalSlots-takenSlots);
    }

    public String getCourseCode(){return courseCode;}

    public void setCourseCode(String courseCode){this.courseCode = courseCode;}


}