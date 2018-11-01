import java.util.ArrayList;

public class Shenc {
    public static void main(String[] args){
        System.out.println("This is mine no touchie!");

        ArrayList <Lecture> lectureList = new ArrayList<>(0);

        lectureList.add(new Lecture("SEP2001", 2230, "LT4", "SIM WEE WEE"));
        lectureList.add(new Lecture("SSP2010", 1230, "LT2", "ABCDEFG"));

        System.out.println(lectureList.get(0).getClassID());
    }
}
