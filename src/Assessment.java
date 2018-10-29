import java.util.*;

public class Assessment {

    private double examMark;
    private double courseMark;
    private double assignmentMark;
    private double classPartMark;
    private String courseCode;

    public Assessment(String courseCode){
        this.courseCode=courseCode;
    }

    public Assessment(String courseCode, double examMark, double courseMark){ //assessment obj
        this.courseCode = courseCode;
        this.examMark = examMark;
        this.courseMark = courseMark;
    }

    public String getCourseCode(){
        return courseCode;
    }

    public double getExamMark() {
        return examMark;
    }

    public double getCourseMark() {
        return courseMark;
    }

    public double getAssignmentMark() {
        return assignmentMark;
    }

    public double getClassPartMark() {
        return classPartMark;
    }

    public void setCourseCode(){
        System.out.println("Please enter the student's Course Code:");
        Scanner sc = new Scanner(System.in);
        String courseCode = sc.nextLine();
        this.courseCode = courseCode;
    }

    public void setExamMark(double examMark) {
        this.examMark = examMark;
    }

    public void setCourseMark(double courseMark) {

        System.out.println("How many components does the student's Coursework have?");
        Scanner sc = new Scanner(System.in);
        int componentNumber = sc.nextInt();

        switch(componentNumber){
            case 1:
                System.out.println("Please enter the student's Assignment Marks:");
                assignmentMark = sc.nextDouble();
                this.courseMark = assignmentMark; //assignment mark is everything of course mark

                break;

            case 2:
                System.out.println("Please enter the student's Assignment Marks:");
                assignmentMark = sc.nextDouble();

                System.out.println("Please enter the student's Class Participation Marks:");
                classPartMark = sc.nextDouble();

                courseMark = 0.7*assignmentMark + 0.3*classPartMark;

                this.courseMark = courseMark;

                break;

            default:
                System.out.println("Error! The student's Course Work can only have either 1 or 2 components. Please try again.");

                break;



        }

    }

    public void printCourseTranscript(){

        if (Double.isNaN(this.courseMark) || Double.isNaN(this.examMark) || this.courseCode == null){

            System.out.println("Error! Missing Course Code, Exam Mark, or Course Code!");

        }
        else {
            this.assignmentMark = 0.6 * this.examMark + 0.4 * this.courseMark;
            System.out.println("Student Transcript");
            System.out.println(this.courseCode + " : " + assignmentMark); //need to print out components also
        }
    }
}
