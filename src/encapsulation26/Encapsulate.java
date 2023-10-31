package encapsulation26;

public class Encapsulate {
    //Private variable declared these can only be accessed by public methods of class
    private String name;
    private int rollNo;
    private int age;

    //set method for name to acess private variable name
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    //get method for roll to access private variable roll no
    public int getRollNo(){
        return rollNo;
    }
    //set method for roll to access private variable rollNo
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    //get method for age to access private variable age
    public int getAge(){
        return age;
    }
    //set method for age to access private variable age
    public void setAge(int age){
        this.age = age;
    }

    public class TestEncapsulation{
        public static void main (String[] args){
            Encapsulate obj = new Encapsulate();

            //setting value of the variable

            obj.setName("Amit");
            obj.setAge(19);
            obj.setRollNo(51);

            //Displaying value of the variables

            System.out.println("Prime's name: " + obj.getName());
            System.out.println("Prime's age: " + obj.getAge());
            System.out.println("Prime's rollNo: " + obj.getRollNo());
                //Direct access of rollNo is not possible due to encapsulation
                //System.out.println("Prime's rollNo : " + obj.geekName);
        }
    }
}

