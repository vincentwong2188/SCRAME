import java.util.Scanner;

public class Student {
    private int matric;
    private String[] courseCodes; //can i just use courseCode instead of an array of course obj
    private Assessment[] listAssessments;

    Scanner sc=new Scanner(System.in);

    public Student(){
    }

    public Student( int matric, String[] courseCodes){
        this.matric=matric;
        this.courseCodes= courseCodes;
    }

    public int getMatric(){
        return matric;
    }

    public void setMatric(int matric){
        this.matric=matric;
    }

    public static boolean validateMatric(String matric){return true;}

    public String[] getCourseCodes(){
        return courseCodes;
    }

    public void setCourses(String[] courseCodes){
        this.courseCodes=courseCodes;
    }

    public Assessment[] fillListAssessments(){ //get an array of assessments for this student
        for(int i=0;i<courseCodes.length;i++) {
            String courseCode=courseCodes[i]; //to be implemented
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
