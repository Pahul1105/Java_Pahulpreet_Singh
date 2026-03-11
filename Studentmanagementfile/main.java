import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();

        System.out.println("1 - Add a record");
        System.out.println("2 - View a record");
        System.out.println("Enter choice :");
        int choice = sc.nextInt();
        if(choice == 1){
            sm.writeStudent();
        }
        else if(choice == 2){
            sm.readStudents();
        }else{
            System.out.println("Invalid choice.");
        }
    }
}