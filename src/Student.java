import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int matric;
    private ArrayList<String> courseCodes; //can i just use courseCode instead of an array of course obj
    private ArrayList<Assessment> assessments;

    Scanner sc=new Scanner(System.in);

    public Student(){
        courseCodes= new ArrayList<>();
        assessments= new ArrayList<>();
    }

    public Student(int matric){
        this.matric=matric;
        courseCodes= new ArrayList<>();
        assessments= new ArrayList<>();
    }

    public Student( int matric, ArrayList<String> courseCodes){
        this.matric=matric;
        this.courseCodes= courseCodes;
        assessments= new ArrayList<>();
    }

    public int getMatric(){
        return matric;
    }

    public void setMatric(int matric){
        this.matric=matric;
    }

    public static boolean validateMatric(String matric){return true;}

    public ArrayList<String> getCourseCodes(){
        return courseCodes;
    }

    public void setCourses(String courseCode){
        this.courseCodes.add(courseCode);
    }

    public ArrayList<Assessment> fillAssessments(){ //get an array of assessments for this student
        for(int i=0;i<courseCodes.size();i++) {
            String courseCode = courseCodes.get(i); //to be implemented
            assessments.add(new Assessment(courseCode));
            System.out.println("Please enter the student's Exam Marks:");
            double examMark = sc.nextDouble();
            assessments.get(i).setExamMark(examMark);
            System.out.println("Please enter the student's Course Marks:");
            double courseMark = sc.nextDouble();
            assessments.get(i).setCourseMark(courseMark); //within this has the component alr
        }
        return assessments;
    }

    public void printTranscript(){
        for(int i=0;i<assessments.size();i++)
            assessments.get(i).printCourseTranscript(); //need to modify to print components
    }
}
