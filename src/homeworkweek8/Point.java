package homeworkweek8;

/**
 * Question I have written in Programme16
 */

public class Point {                    //created class called point

    int x;                              //two instance variable
    int y;

    public Point() {                    //zero args constructor

    }

    public Point(int x, int y) {         //2 args constructor
        this.x = x;
        this.y = y;
    }

    public int getX() {                 //identified int method - getX
        return x;
    }

    public int getY() {                 //identified int method getY
        return y;
    }

    public void setX(int x) {           //setX method
        this.x = x;
    }

    public void setY(int y) {           //setY method
        this.y = y;
    }


    public static void main(String[] args) {                                                    //main method
        Point first = new Point(6, 5);                                                     //code from the question
        Point second = new Point(3, 1);
        System.out.println("distance (0,0) = " + first.distance());
        System.out.println("distance (second) = " + first.distance());
        System.out.println("distance(2,2) = " + first.distance(2, 2));
        Point point = new Point(); // instantiating object with zero args constructor
        System.out.println("distance() = " + point.distance());
    }

    public double distance() {                                                                  //method distance without any parameters
        return Math.sqrt((this.x - 0) * (this.x - 0) + (this.y - 0) * (this.y - 0));            //calculation for square root
    }

    public double distance(int x, int y) {                                                       //method distance with two parameters
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));             //calculation for square root
    }

    public double distance(Point point) {                                                                           //method distance with parameter another of type point
        return Math.sqrt((this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y));       //calculation for square root
    }
}
