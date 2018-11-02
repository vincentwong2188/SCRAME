
public class zach {
    public static void main(String[] args){
        //Add a student
        //Student gwen = new Student();
        Student gwen = new Student(123);
        gwen.setCourses("algo");
        System.out.println(gwen.getCourseCodes());
        System.out.println(gwen.fillAssessments());
        gwen.printTranscript();
    }
}
