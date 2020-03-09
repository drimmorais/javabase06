
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

    int i;

    String[] carros = new String [5];

    carros[1] = "Civic";
    carros[2] = "Gol";
    carros[3] = "Palio";
    carros[4] = "Uno";

  
    for(i = 1; i < 5; i++){
        System.out.println(carros[i]);
    }

    carros[2] = "L200";

    for(i = 1; i < 5; i++){
        System.out.println(carros[i]);
    }

    carros[1] = "Civic";
    carros[2] = "Palio";
    carros[3] = "Uno";    
    carros[4] = "Gol";

     for(i = 1; i < 5; i++){
        System.out.println(carros[i]);
    }
    
    
  }
}