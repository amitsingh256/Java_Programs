package Java_Examples;

import java.util.Random;
import java.util.Scanner;

public class Game_Rock_Paper {
public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	System.out.println("enter youe choice 1. rock    2. paper       3. scissor");
	int userinput= in.nextInt();
	
    Random random = new Random();
	int computerinput= random.nextInt();
	
	if (userinput == computerinput) {
		System.out.println("draw");
		}
	
	else if (userinput==0 && computerinput==2 || userinput==1 && computerinput==0 || userinput==2 && computerinput==1) {
		System.out.println("you win");
	}
	else {
		System.out.println("computer win");
	}
	System.out.println("computer choice :"+ computerinput);
}

}

