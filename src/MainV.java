import java.util.*;

public class MainV {


    public static void main(String[] args) {
        int a;


        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Add a student");
            System.out.println("4. Check course vacancy");
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
                case 4:
                    System.out.println("What is the name of the course?");
                    String name = sc.nextLine();
                    System.out.println("What is the name of the professor for the course?");
                    String professor = sc.nextLine();
                    System.out.println("How many slots are taken?");
                    int takenSlots = sc.nextInt();
                    System.out.println("What is the total slots for the course?");
                    int totalSlots = sc.nextInt();


                    System.out.println("What is the course you are interested in?");




                    break;
                default:
                    break;
            }

        }while (a != 11);


    }
}
