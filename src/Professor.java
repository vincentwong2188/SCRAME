public class Professor {
    private String courseCode; //suggested implementation, professor in the parameter of constructor of course with smth to change this prof's coursecode
    private String name; //assuming only teaches 1 course

    public Professor(){
    }

    public Professor(String name){
        this.name=name;
    }

    public Professor(String courseCode, String name){
        this.courseCode=courseCode;
        this.name=name;
    }

    public String getCourseCode(){
        return courseCode;
    }

    public void setCourseCode(Course course){
        this.courseCode=courseCode;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name=name;
    }

}
