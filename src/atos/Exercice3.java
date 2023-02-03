package atos;
import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("entrer un numéro : ");
	        int number = sc.nextInt();
	        
	        String numberToString = String.valueOf(number);
	        String numberToStringReverse = "";
	        
	        for(int i = numberToString.length() - 1; i >= 0; i--) {
	        	numberToStringReverse += numberToString.charAt(i);
	        }
	        
	        System.out.println("le nombre entré est : " + number + ", le nombre inversé est : " + numberToStringReverse);
	        
	        
	}

}
