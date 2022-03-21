package a_MadLibs;
import java.util.Scanner;
import org.json.JSONObject;
import org.omg.IOP.TaggedComponentHelper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
//Author Sharon Mutugi    email jeltsmutugi@yahoo.com

/*This  Java code is for a math mad lib  game.   
I use JSON to store the user responses and accompanying story  in a file. 
While it may remain a game, this code can  be improved and
turned into a math learning app where the user inputs a response and gets a result. 
E.g. a teacher might provide all the nouns, adjectives, etc for the student to use and then assess the student's
understanding based on their input. 
This code is not available for sale or licensing. Please, ask me first  if  you want to use it. Thank you*/

public class MadLibs {
	Scanner scanner = new Scanner(System.in);
	String story;
	String name1;
	String name2;
	String adverb;
	String adjective1;
	String adjective2;
	String adjective3;
	String adjective4;
	String adjective5;
	String adjective6;
	String noun1;
	String noun2;
	String noun3;
	String noun4;
	String noun5;
	String verb1;
	String verb2;
	String verb3;
	String randomNums;
	Random rand = new Random();  // random generator
	
	//Accessors  and Mutators
	public String getStory() {
		return story;
	}
	public void setStory(String newStory) {
	this.story = newStory;
	}
	
	public String getName1() {
		return name1;
	}
	public void setName1(String newName1) {
	this.name1 = newName1;
	}
	
	public String getName2() {
		return name2;
	}
	public void setName2(String newName2) {
	this.name2 = newName2;
	}
	
	public String getAdjective1() {
		return adjective1;
	}
	public void setAdjective1(String newAdjective1) {
	this.adjective1 = newAdjective1;
	}
	
	public String getAdjective2() {
		return adjective2;
	}
	public void setAdjective2(String newAdjective2) {
		this.adjective2 = newAdjective2;
		}
	
	public String getAdjective3() {
		return adjective3;
	}
	public void setAdjective3(String newAdjective3) {
		this.adjective3 = newAdjective3;
		}
	
	public String getAdjective4() {
		return adjective4;
	}
	public void setAdjective4(String newAdjective4) {
		this.adjective4 = newAdjective4;
		}
	
	public String getAdjective5() {
		return adjective5;
	}
	public void setAdjective5(String newAdjective5) {
		this.adjective5 = newAdjective5;
		}
	
	public String getAdjective6() {
		return adjective6;
	}
	public void setAdjective6(String newAdjective6) {
		this.adjective6 = newAdjective6;
		}
	
	public String getNoun1() {
		return noun1;
	}
	public void setNoun1(String newNoun1) {
	this.noun1 = newNoun1;
	}
	
	public String getNoun2() {
		return noun2;
	}
	public void setNoun2(String newNoun2) {
		this.noun2 = newNoun2;
		}
	
	public String getNoun3() {
		return noun3;
	}
	public void setNoun3(String newNoun3) {
		this.noun3 = newNoun3;
		}
	
	public String getNoun4() {
		return noun4;
	}
	public void setNoun4(String newNoun4) {
		this.noun4 = newNoun4;
		}
	
	public String getNoun5() {
		return noun5;
	}
	public void setNoun5(String newNoun5) {
		this.noun5 = newNoun5;
		}
	
	public String getAdverb() {
		return adverb;
	}
	public void setAdverb(String newAdverb) {
	this.adverb= newAdverb;
	}
	
	public String getVerb1() {
		return verb1;
	}
	public void setVerb1(String newVerb1) {
	this.verb1= newVerb1;
	}
	
	public String getVerb2() {
		return verb2;
	}
	public void setVerb2(String newVerb2) {
	this.verb2= newVerb2;
	}
	
	public String getVerb3() {
		return verb3;
	}
	public void setVerb3(String newVerb3) {
	this.verb3= newVerb3;
	}
	
	public String getRandomNums() {
		return randomNums;
	}
	public void setRandomNums() {
		int number = Math.abs(rand.nextInt()) % 100;  // Get a random number
		int index = 0;
		int[] numberArray = new int[3];  // array to hold 3 integers
		while (index < numberArray.length) {
			numberArray[index] = number + index;
			index++;
		}
		this.randomNums = " not " + numberArray[0] + ", not " + numberArray[1] + ",  but more than " + numberArray[2];
	}

//Print instructions for how to play the game. 
	 public void printInstructions() {
			System.out.println("Welcome to MathMadLibs game."
					+ "\n This is  how it works. Hit enter, follow the  instructions and the words  will form a story.  ");
		}
	 
	 //Get user input from player
	 public void enterName1() {
		 System.out.println("Please enter a name here ");
		 setName1(scanner.nextLine());
	 }
	 
	 public void enterName2() {
		 System.out.println("Another name here please ");
		 setName2(scanner.nextLine());
	 }
	 public void enterAdjective1() {
		 System.out.println("I need an  adjective please ");
		 setAdjective1(scanner.nextLine());
	 }
	 public void enterAdjective2() {
		 System.out.println("Another  adjective  please ");
		 setAdjective2(scanner.nextLine());
	 }
	 public void enterAdjective3() {
		 System.out.println("Another adjective needed  here ");
		 setAdjective3(scanner.nextLine());
	 }
	 public void enterAdjective4() {
		 System.out.println("Yet another adjective here please ");
		 setAdjective4(scanner.nextLine());
	 }
	 public void enterAdjective5() {
		 System.out.println("Hang in there - another adjective please ");
		 setAdjective5(scanner.nextLine());
	 }
	 public void enterAdjective6() {
		 System.out.println("Yup, I need an adjective here too. ");
		 setAdjective6(scanner.nextLine());
	 }
	 
	 public void enterNoun1() {
		 System.out.println("Please type in a noun ");
		 setNoun1(scanner.nextLine());
	 }
	 
	 public  void enterNoun2() {
		 System.out.println("Another noun  please ");
		 setNoun2(scanner.nextLine());
	 }
	 public void enterNoun3() {
		 System.out.println("Yet another noun please. ");
		 setNoun3(scanner.nextLine());
	 }
	 
	 public void enterNoun4() {
		 System.out.println("I need a noun here again please ");
		 setNoun4(scanner.nextLine());
	 }
	 
	 public void enterNoun5() {
		 System.out.println("I'm still craving nouns - please type in a noun ");
		 setNoun5(scanner.nextLine());
	 }
	 public void enterAdverb() {
		 System.out.println("Ooooo...how about an adverb here.  ");
		 setAdverb(scanner.nextLine());
	 }
	 
	 public void enterVerb1() {
		 System.out.println("Ahh... I need a verb now  ");
		 setVerb1(scanner.nextLine());
	 }
	 
	 public void enterVerb2() {
		 System.out.println("Another verb please  ");
		 setVerb2(scanner.nextLine());
	 }
	 
	 public void enterVerb3() {
		 System.out.println("Yet another verb is needed here ");
		 setVerb3(scanner.nextLine());
	 }
	
	 //Put all the user input into the story
	 public void pieceStoryTogether() {
		String story;
		int number = Math.abs(rand.nextInt()) %3 ;
		if (number ==0) {    // if the random number is divisible by 3, this topic is selected. 			
		story = " \nAlgebra  seeks to make sense of the world using  " +getRandomNums() + " symbols,  and replacing "+ getNoun1()+ " with letters. " 
		+  " \n" + getName1() + ", one of the first " + getAdjective1() + " women mathematicians from  ancient Egypt was skilled at "
		+ "\nbreaking down " + getAdjective2() + "  matters into simpler ones for people to understand. "
				+ "\n Variables represent numbers which can "  + getVerb1() + "  depending on the circumstance. "
				+ "\n E.g. If a barber charges $20 per person,  the barber's weekly earnings  depend on how many "+ getNoun2() + " he gets. "
				+  "\nSo if the barber earns $600 per week, it means he  had 30 customers.  Why?  Here is how to set up an  " + getNoun3() 
				+ "\nLet variable x be the number of customers so x multipled by $20 = $600.  You want x by itself  in the equation therefore  "
				+ "\n" + getVerb2() + " that the = sign is a fence and anything next to the variable x needs to be kicked over  the fence. "
				+ "\nHowever, " + getName2() + "  has rules, one of which is that  if a number goes over the fence, something has to change. "
				+ "\n If the number is " + getVerb3() + " on one side of the fence, it gets divided on the other, if added, then subtracted, and vice versa. "
				+ "\nSo back to the barber's " + getNoun4() + ",variable x now = $600 / $200, which means x  " + getAdverb() + " = 30."
				 + "\n Algebra helps us understand our world where  " + getNoun5() + " and numbers are always changing. "
			
				 + "\n\n--------------------------The correct paragraph should read as follows:----------------------------------"
       +" \nAlgebra  seeks to make sense of the world using not (e.g. 15) or (e.g. 34), but more than (e.g. 87) symbols, and replacing numbers with letters. " 
		+  " \nHypatia, one of the first famous women mathematicians from  ancient Egypt was skilled at "
		+ "\nbreaking down complex matters into simpler ones for people to understand. "
		+ "\n Variables represent numbers which can change depending of the circumstance. "
		+ "\n E.g. If a barber charges $20 per person,  the barber's weekly earnings  depend on how many customers he gets. "
		+  "So if the barber earns $600 per week, it means he  had 30 customers.  Why?  Here is how to set up an equation. "
		+ "\nLet variable x be the number of customers so  x multipled by $20 = $600.  You want x by itself  in the equation so "
		+ "\n pretend that the = sign is a fence and anything next to the variable x needs to be kicked over. "
		+ "\nHowever, Algebra  has rules,  one of which is that  if a number goes over the fence, something has to change."
		+ "\n If the number is multiplied on one side of the fence, it gets divided on the other, if added, then subtracted, and vice versa. "
		+ "So back to the barber , variable  x  now = $600 / $200, which means x finally = 30."
		 + "\n Algebra helps us understand our world where circumstances and numbers are always changing. ";
		}
		else  if  (number ==1) {  // if the random number is  not divisible by 3, this topic is selected. 
			
			story = "\nGeometry involves measurement and study of " + getNoun1() +", shapes, and sizes. "
					+ "\nIt is widely used in " + getAdjective1() + " apects of life such as construction, art, astronmy, computer graphics and radiology. "
					+ "\n " +  getName1() + " was a famous  " +  getNoun2()  + " who contributed much to the study of geometry. "
					+ "\nIf, for example  you want  to " + getVerb1() + "  how " + getAdjective2() + "  water a cylindrical flask holds, " + getVerb2()  + " the radius (r) of the " + getAdjective3()
					+ " \n base and  the height (h) of the " +  getNoun3()  +". Next, multiply the " + getName2() + "  letter  pi (3.14) by radius (r) squared by height (h) to get the " +  getNoun4() + "." 
					+ "\nThe word 'geo' means " +  getNoun5() + "  and 'metry' means measurement. So yes, one can say that  geometry"
					+ "\nteaches us how to measure " + getRandomNums() + " angles and shapes on  the earth. "
				
			 +"\n\n--------------------------The correct paragraph should read as follows:----------------------------------"
			 +"\nGeometry involves measurement and study of    angles, shapes, and sizes. "
			+ "\nIt is widely used in various apects of life such as construction, art, astronmy, computer graphics and radiology. "
			+ "  \nEuclid was a famous mathematician who contributed much to the study of geometry. "
			+ "\nIf,  for example  you want  to know how much water a cylindrical flask holds,  measure the radius (r) of the  circular base and "
			+ "\nthe height (h) of the cylinder . Next, multiply the Greek number  pi (3.14) by radius (r) squared by height (h) to get the volume. "
			+ "\nThe word 'geo' means earth and 'metry' means measurement. So yes, one can say that  geometry"
			+ "\nteaches us how to measure  not (e.g. 15) or (e.g. 34), but more than (e.g. 87)   angles and shapes on the earth. ";
			}
		else   //  // if the random number is  not divisible by 3 again, this topic is selected. 
		 {
			story = "\nCaclulus is the branch of mathematics which explores how things  " + getNoun1() + "  and the accompanying effects. "
					+ "\nIt is very useful for detemining " + getRandomNums() + "  areas and volumes of irregular shapes. " 
					+ "\nThis topic is about  F.T.O.C. which  stands for  the  " + getName1() + " Theorem of Calculus. " 
		+ " \n In essence it states that differentiation and  definite integration are  " + getAdjective1() + " operations. "
		+ "\n Differential calculus studies how " + getAdjective2() + " changes affect the whole. E.g. The rate at which water fills a swimming pool. "
		+ "\n Integral calculus studies  the " + getAdjective3() + "  as it is composed of smaller parts. E.g. The amount of material an architect needs to construct a new dome."
		+ " \n A famous physicist named "  + getName2() + " is said to have known something about this process. "
		+ "\n To define the slope  of a  " + getNoun2() + "   line, we use  the quotient deltaY/deltaX. "
		+ "\n When defining  the area of a region  under the curve,  we use the product deltaY multiplied by deltaX which is the area under a " + getNoun3() 
		+" \n So at least in the initial approximation stage, the operations   of " + getAdjective4() + "  and "  + getAdjective5() + " integration "
		 + " \n look like they have an " + getAdjective6() + "   relationshp."
		 +"\n Kinda like " + getNoun4() + " and " +  getNoun5() + " do. "
		 
		 +"\n\n--------------------------The correct paragraph should read as follows:----------------------------------"
		 + "\nCaclulus is the branch of mathematics which explores how things  change and the accompanying effects. "
		+ "\nIt is very useful for detemining not (e.g. 15) or (e.g. 34), but more than (e.g. 87)  areas and volumes of irregular shapes. " + "\n This topic is about  F.T.O.C. which  stands for  the   Fundamental Theorem of Calculus. " 
		 + "\n In essence it states that differentiation and  definite integration are inverse operations. "
		 + "\n Differential calculus studies how small changes affect the whole. E.g. The rate at which water fills a swimming pool. "
			+ "\n Integral calculus studies   the whole as it is composed of smaller parts. E.g. The amount of material an architect needs to construct a new dome."
			+ " \n A famous physicist named  Newton  is said to have known something about this process. "
			+ "\n To define the  slope  of a  tangent line, we use  the quotient deltaY/deltaX. "
			+ "\n When defining  the area of a region  under the curve,  we use the product deltaY multiplied by deltaX, which is  the area under a  rectangle. "
			+" \n So at least in the initial approximation stage, the operations  of differentiation  and definite integration "
			 + " \n look like they have an  inverse relationshp."
			 +"\n Kinda like multiplication  and division do. "
			 + "\n Now isn't math a beautiful thing? ";
		 }
		setStory(story);
		}  // ends PieceStoryTogether.
	 
	 public void playTheGame() {
		 enterName1();
		 enterAdjective1();
		 enterNoun1();
		 enterAdverb();
		 enterName2();
		 enterAdjective2();
		 enterAdjective3();
		 enterNoun2();
		 enterNoun3();
		 enterAdjective4();
		 enterNoun4();
		 enterAdjective5();
		 enterNoun5();
		 enterAdjective6();
		 enterVerb1();
		 enterVerb2();
		 enterVerb3();
		 setRandomNums();
		 pieceStoryTogether();
		 System.out.println(getStory());
	 }
	public static void main (String args[]) {
		MadLibs game = new MadLibs();
		game.printInstructions();	
		game.playTheGame();
		System.out.println("-------------------Results-------------------------");
		
		JSONObject sampleStory = new JSONObject(game);  // JSON object  introduced here. 
		System.out.println(sampleStory);   // Prints the story to the console. 
		
		try (FileWriter file = new FileWriter("sampleStory.json")){  
			sampleStory.write( file, 2, 0);   //Story written to a file via JSON object. 
			file.flush();
		}catch (IOException e ) {
			e.printStackTrace();
		} // ends catch 
	}// ends main

}
