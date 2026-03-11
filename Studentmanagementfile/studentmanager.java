import java.io.*;
import java.util.*;
class StudentManager{
    void writeStudent(){
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter id :");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name :");
            String name = sc.nextLine();

            System.out.println("Enter marks :");
            double marks = sc.nextDouble();

            FileWriter fw = new FileWriter("students.txt", true);

            fw.write(id + " " + name + " " + marks + "\n");
            fw.close();
            System.out.println("Student record saved");
        }catch(InputMismatchException e)
        {
            System.out.println("Invalid input type");
        }catch(IOException e)
        {
            System.out.println("Error writing to file");
        }
    }
    void readStudents(){
        try{
            File file = new File("students.txt");
            if(!file.exists())
            {
                System.out.println("File does not exist");
                return;
            }
            Scanner sc = new Scanner(file);
            System.out.println("Student record :");
            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch(IOException e){
            System.out.println("Error reading the file");
        }
    }
}