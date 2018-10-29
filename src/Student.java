import java.util.Scanner;

public class Student {
    private int matric;
    private Course[] courses; //can i just use courseCode instead of an array of course obj
    private Assessment[] listAssessments;

    Scanner sc=new Scanner(System.in);

    public Students(){
    }

    public Students( int matric, Course[] courses){
        this.matric=matric;
        this.courses=courses;
    }

    public int getMatric(){
        return matric;
    }

    public void setMatric(int matric){
        this.matric=matric;
    }

    public Course[] getCourses(){
        return courses;
    }

    public void setCourses(Course[] courses){
        this.courses=courses;
    }

    public Assessment[] filllistAssessments(){ //get an array of assessments for this student
        for(int i=0;i<courses.length;i++) {
            String courseCode=courses[i].getcourseCode(); //to be implemented
            listAssessments[i]= new Assessment(courseCode);
            System.out.println("Please enter the student's Exam Marks:");
            double examMark = sc.nextDouble();
            listAssessments[i].setExamMark(examMark);
            System.out.println("Please enter the student's Course Marks:");
            double courseMark = sc.nextDouble();
            listAssessments[i].setCourseMark(courseMark); //within this has the component alr
        }
        return listAssessments;
    }

    public void printTranscript(){
        for(int i=0;i<listAssessments.length;i++)
            listAssessments[i].printCourseTranscript(); //need to modify to print components
    }
}
