
public class Sherif extends Cowboy{
		private int nbBrigantPrit;
		
	public Sherif (String unNom){
			
			super(unNom);
			
		}
	
	public void Coffrer(Brigants unBrigant)
	{
	parle("Au nom de la loi, je vous arrete !");
	unBrigant.EnPrison(this);
	nbBrigantPrit++;	
	}
	public void Rechercher(Brigants unBrigant)
    {
	System.out.println("Je suis en train de placarder la ville d'affiche de brigant si vous les croisez faite attention ils sont dangereux venez voir le shérif "+ super.quel_est_ton_nom());
	parle("OYEZ OYEZ BRAVE GENS !! " + unBrigant.get_mise_a_prix() + " $ à qui arretera " + unBrigant.quel_est_ton_nom() + " mort ou vif !!");

    }
	public void Presenter()
    {
	super.presenter();
	parle("et j'ai coffrer déjà  "+ nbBrigantPrit + " brigants");
    }
	
}
