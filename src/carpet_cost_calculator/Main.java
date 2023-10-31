package carpet_cost_calculator;

/**
 * 4. Write a class with the name Main. The class needs to have a main method.
 */
public class Main {     //main class for all 3 subclass
    public static void main(String[] args) {                                //main method
        Carpet carpet = new Carpet(3.5);                                //code given in question 17 - it is calling all 3 class in one main method
        Floor floor = new Floor(2.75, 4);                        // - and calculating the cost of carpet.
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Total = " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("Total = " + calculator.getTotalCost());
    }
}
