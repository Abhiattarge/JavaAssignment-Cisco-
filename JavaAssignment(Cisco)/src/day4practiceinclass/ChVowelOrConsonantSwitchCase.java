package day4practiceinclass;

import java.util.Scanner;

public class ChVowelOrConsonantSwitchCase {

	public static void main(String[] args) {
		// write a java program using switch to check ch vowel or consonant
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter a Character: ");
		char ch=((sc.nextLine()).charAt(0));
		char z=Character.toUpperCase(ch);
		
		switch(z)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':System.out.println(ch+" is a Vowel.");
		break;
		
		default:System.out.println(ch+" is a Conconant.");
		}

	}

}
