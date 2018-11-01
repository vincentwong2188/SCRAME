/* To do:
  * time of class and class id wont change so dont need to implement
   * tutlab --> public int get vacancy --> calls
    * getClassSize
    * gettutor
    *
    *
    *   public int addStudent(lesson, classID){
        for(int i=0; i<lectureList.size(); i++){
            if(lectureList.get(i).getClassID().equals()) {
                lectureList.get(i).addStudent(matric whatever parameters needed for this method)
            }
*/



public class MainJ {

public String getLecturer(String classID) {                //lecture list is within course which is within courselist
    for (int i = 0; i < lectureList.size(); i++) {
        if (lectureList.get(i).getClassID().equals(classID)) {
            return lectureList.get(i).getLecturer();
        }
    }
}

public String getTutor(String classID)  {
    for (int i = 0; i < tutorialList.size(); i++)   {
        if (tutorialList.get(i).getClassID().equals(classID))   {
            return tutorialList.get(i).getTutorial;                 // returning the method gives the return of variable tutor
        }
    }
}


public int getClassSize(String classID){
    for (int i = 0; i < tutorialList.size(); i++)   {
        if (tutorialList.get(i).getClassID().equals(ClassID))   {
            return getClassSize.get(i).getClassSize;
        }
    }
}



}
