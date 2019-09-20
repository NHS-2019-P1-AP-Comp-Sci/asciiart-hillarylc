/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main(String[] args) {
		cloudySky();
		textBubble();
		chickenBody();
		theGround();
		System.out.println("\nA sentient chicken making a bad joke about its anatomy.");

	}

	public static void textBubble() {
		System.out.println("  \t\t ______________");
		System.out.println("  \t\t| Guess what?  |");
		System.out.println("  \t\t| Chicken butt.|");
		System.out.println("  \t\t|     :D       |");
		System.out.println("  \t\t|______________|");
		System.out.println(" \t\t/");

	}
	/*
	 * Prints out rear view of Chicken
	 */
	public static void chickenBody() {
		System.out.println("            _^_");
		System.out.println("          / | | \\");
		System.out.println("         /  | |  \\");
		System.out.println("        '   | |   '");
		System.out.println("        |   | |   |");
		System.out.println("       _/    -    \\_");
		System.out.println("    __/             \\__");
		System.out.println("   / /               \\ \\");
		System.out.println("   | |                | |");
		System.out.println("   | |       @        | |");
		System.out.println("   \\_\\                /_/");
		System.out.println("      \\______________/");
		System.out.println("         |        |");
		System.out.println("        \\|/      \\|/");

	}

	public static void cloudySky() {
		System.out.println("      \t    * ____");
		System.out.println("      \t .   (    )   .");
		System.out.println("    ___\t   (____)__)   .          ___");
		System.out.println(" * (   )          .   .     *    (   )  :");
		System.out.println(". (__)__) .    :           .    (___)__) .");

	}

	public static void theGround() {
		System.out.println("  ________________________________________\\|/______");
		System.out.println("  .......       ...              ............. .....");
		System.out.println("...                  ..  .        .....  .......  ");
		System.out.println(".                                       .....     ");

	}

}
