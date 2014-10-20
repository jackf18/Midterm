/**
 * Determines the number of pizza pies required to feed an after school club.
 * 
 * Basic program
 * 	Prompt the user to enter the number of people to be fed, the number of
 * 	slices allowed for each person, and the number of slices in each whole pie.
 * 	Given these inputs, determine and display the number of pizzas to purchase.
 * 
 * For guidance, refer to the flowchart PizzaPalace.pdf distributed with this file
 * 
 * @author <Jack Flaherty>
 * @version <10/20/14>
 */
 
import java.util.Scanner;
public class PizzaPalace {

	public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
   int numPeople = 0;
   int numSlicesPerPerson = 0;
   int numSlicesPerPizza = 0;
   double numPizzas = 0;
   System.out.println("How many people are there?");
   numPeople = scnr.nextInt();
   System.out.println("How many slices does each person get?");
   numSlicesPerPerson = scnr.nextInt();
   System.out.println("How many slices does each pizza have?");
   numSlicesPerPizza = scnr.nextInt();
   numPizzas = (numPeople * numSlicesPerPerson) / numSlicesPerPerson;
   System.out.println("If there's " + numPeople + " and each person receives " + numSlicesPerPerson + " then you need " + Math.ceil(numPizzas) + " pizzas in total");

	}

}
