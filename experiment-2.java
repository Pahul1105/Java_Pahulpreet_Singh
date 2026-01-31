class Areacalc{
  public float Area(float s){              //1 parameter type - float
    return s*s;
  }
  public float Area(float l,float b){      //2 parameters type - float
    return l*b;
  }
  public double Area(double r){           //1 paramaters type - double
    return 3.14* r * r;
  }
  void display(){
        System.out.println("Square : "+ Area(5f));
        System.out.println("Rectangle : "+ Area(10f, 5f));
        System.out.printf("Circle : %.2f\n", Area(3.0)); 
  }
}
public class Main {
    public static void main(String[] args) {
        Areacalc a1 = new Areacalc();         //method overloading call
        a1.display(); 
    }
}
//OUTPUT- 
/*
Square : 25.0
Rectangle : 50.0
Circle : 28.26
*/
