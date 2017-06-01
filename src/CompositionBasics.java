//CompositionBasics.java
import java.util.Scanner;
public class CompositionBasics {
	public static void main(String[] args) {
		Person bobby = new Person();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program will print the last education institutes you have attended, but first enter up to 20.");
		for(int i =0; i < bobby.educationLength(); i++){
			bobby.setSchools(keyboard.nextLine(),i);
		}
		System.out.println(bobby.toString());
	}
}