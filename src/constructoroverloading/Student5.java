package constructoroverloading;

//Java program to overload constructors
class Student5 {
    int id;
    String name;
    int age;
    //creating two arg constructor
    Student5(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }
    public void display(){
        System.out.println(id + " " + name + " " + age);
    }
    public static void main (String args []){
     //   Student5 s1 = new Student5(111,"Karan");
     //   Student5 s2 = new Student5(222, "Aryan",25);
     //   s1.display();
     //   s2.display();
    }       //I am getting error on line 18 and 19
}
