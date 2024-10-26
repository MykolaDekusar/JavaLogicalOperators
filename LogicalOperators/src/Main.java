
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
	}

}
