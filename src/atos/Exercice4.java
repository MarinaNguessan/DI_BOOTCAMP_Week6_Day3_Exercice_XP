package atos;

public class Exercice4 {

	public static void main(String[] args) {
		
		for(int i = 1; i<500; i++) {
            String value = String.valueOf(i);
            
            if(value.length() > 1) {
                int sum = 0;
                for(int j = 0; j<value.length(); j++) {
                    int el = Integer.parseInt(String.valueOf(value.charAt(j)));
                    sum += Math.pow(el, 3);
                }
                
                if(sum == Integer.parseInt(value)) {
                    System.out.println(value + " est le nombre  l'Armstrong");
                }
            }
        }
	}

}
