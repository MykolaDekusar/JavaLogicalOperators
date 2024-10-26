import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//operatori logici sono utilizzati per connette 2 o piu operazioni
		// && AND entrambi le condizioni devono essere vere
		// || OR una delle condizione deve essere vera
		// ! NOT inverte il valore di una condizione booleana (se era true diventa false e viceversa)
		//Testiamo l'AND
		int temperatura= 3;
		if(temperatura >20 && temperatura <=30) {
			System.out.println("Si sta bene");
		}
		else if(temperatura <=20 && temperatura >=5) System.out.println("Fa fresco");
		else if (temperatura >=0 && temperatura <5 ) System.out.println("Fa freddo");
		
		//Testiamo l'OR
		Scanner scanner = new Scanner(System.in);//inizializziamo lo scanner per prendere 
		//l'input dell'utente
		System.out.println("Premi q oppure Q per uscire dal gioco");
		String answer = scanner.nextLine();
		//per verificare se due stringhe sono uguali dobbiamo usare il metodo .equals()
		if(answer.equals("q") || answer.equals("Q") )System.out.println("Sei uscito dal gioco");
		else System.out.println("Continua a giocare");
		
		//Testiamo il NOT
		//se non ho premuto q e Q allora continuo a giocare 
		if(!answer.equals("q")&& !answer.equals("Q"))System.out.println("Continua a giocare");
		else System.out.println("Sei uscito dal gioco");
		
	}
}
