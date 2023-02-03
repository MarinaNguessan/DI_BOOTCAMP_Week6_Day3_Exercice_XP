package atos;

public class Exercice2 {

	public static void main(String[] args) {

        
        
       String triangle = "";
        
        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= i; j++) {
                triangle += String.valueOf(i);
            }
            System.out.println(triangle);
            triangle = "";
        }
        


	}

}
