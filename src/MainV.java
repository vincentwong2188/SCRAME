import java.util.*;

public class MainV {


    public static void main(String[] args) {
        int a;


        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Add a student");
            System.out.println("2. Add a course");
            System.out.println("11. Add a course");

            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("What is the matriculation number of the student?");

                    int b = sc.nextInt();
                    Student stud = new Student(b);

                    System.out.println("The matriculation number of the student is " + stud.getMatric());




                    break;
                case 2:
                    System.out.println("");
                    break;
                default:
                    break;
            }

        }while (a != 11);


    }
}
