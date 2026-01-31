class Student{
  int uid;
  String name;
  int age;
  public Student(){    //default constructor
    this.uid=0;
    this.name="No";
    this.age=0;
  }
  public Student(int uid,String name,int age){   //parameterized constructor
    this.uid=uid;
    this.name=name;
    this.age=age;
  }
  void display(){
    System.out.println("UID : "+ uid);
    System.out.println("Name : "+ name);
    System.out.println("Age : "+ age);
  }
}
public class Main{
  public static void main(String[] args){
    Student s1=new Student();                         //default constructor calling
    Student s2=new Student(10261,"Pahul",19);         //parameterized constructor calling
    s1.display();
    s2.display();
  }
}

//OUTPUT - 
/*
UID : 0
Name : No
Age : 0
UID : 10261
Name : Pahul
Age : 19
*/








