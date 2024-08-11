package com.WebCook.guessthenumber;
import java.util.*;

class Game{
	public int number;
	public int inputNumber;
	public int noOfGusses=0;
	public int getNoOfGusses() {
		return noOfGusses;
	}

	public void setNoOfGusses(int noOfGusses) {
		this.noOfGusses = noOfGusses;
	}

	 Game()
	{
		Random rand=new Random();
		this.number=rand.nextInt(100);
	}
	
	void takeUserInput()
	{
		System.out.println("Guess The Number");
		Scanner sc=new Scanner(System.in);
		inputNumber=sc.nextInt();
		
	}
	boolean isCorrectNumber()
	{
		noOfGusses++;
		if(noOfGusses>=6)
		{
			System.out.println("You exceeds number of attempt,please try again");
			System.exit(0);
		}
		if(inputNumber==number)
			{
			System.out.println("Yes You Guess Right Number,It Was" +number+" And you guess in" +noOfGusses+ "steps");
			return true;
			}
		else if(inputNumber<number)
		{
			System.out.println("Too Less..");
		}
		else if(inputNumber>number)
		{
			System.out.println("Too High..");
		}
		return false;
	}
}
public class GuessTheNumber {
	public static void main(String[] args) {
		Game game=new Game();
		boolean b=false;
		while(!b)
		{
		game.takeUserInput();
		 b= game.isCorrectNumber();
		System.out.println(b);
		
		}
		
	}

}
