
public class Histoire {

	public static void main(String[] args) {
	Brigants unBrigant1 = new Brigants("John");
	Brigants unBrigant2 = new Brigants("Travolta"," Biere","Super-Vilain");
	Dame uneDame1 = new Dame("Julie");
	Dame uneDame2 = new Dame("Jasmine");
	Cowboy unCowboy1 = new Cowboy("Lucky-Lucke"," RedBull","Rapide");
	Barman unBarman1 = new Barman("Micka");
	Sherif unSherif1 = new Sherif("B.O.B");
	unBrigant1.presenter();
	unBrigant1.boire();
	unBrigant2.presenter();
	uneDame1.presenter();
	unCowboy1.presenter();
	unBarman1.presenter();
	unSherif1.presenter();
	
	uneDame1.changerDeRobe("Bleu");
	unBarman1.Servir(uneDame1);
	unBarman1.Servir(unCowboy1);
	unBarman1.Servir(unBrigant2);
	unBrigant2.Capturer(uneDame1);
	unBrigant2.Capturer(uneDame2);
	unCowboy1.tirer(unBrigant2);
	unCowboy1.libere(uneDame1);
	unSherif1.Coffrer(unBrigant2);
	unSherif1.Rechercher(unBrigant2);
	//unCowboy1.Coffrer(unBrigant1); On ne peux demander a un simple conwboy de coffrer

	
	unBrigant2.presenter();
	unCowboy1.presenter();

	
	}
}
