
public class Cowboy extends Humain{
	private int popularite=0;
	private String adj="vaillant";
	
public Cowboy (String unNom){
		
		super(unNom);
		boisson="wisky";
		
	}
	public Cowboy (String unNom, String uneBoisson){
		
		super(unNom, uneBoisson);
		
	}
	public Cowboy (String unNom, String uneBoisson,String unAdjectif){
	
		super(unNom, uneBoisson);
		adj=unAdjectif;
	
	}

	public void tirer(Brigants unBrigants)
    {
	System.out.println("Le " + adj + " " + quel_est_ton_nom() + " tire sur " + unBrigants.quel_est_ton_nom() + ". PAN !");
	parle("prend �a, rascal !");
    }
	
	public void libere(Dame uneDame)
    {
	parle("Je viens pour vous lib�rer charmante "+ uneDame.quel_est_ton_nom() + ".");
	uneDame.seFaireLiberer(this);
	popularite++;
	
    }
	public void presenter()
    {
	super.presenter();
	parle("Je suis  "+ adj +" et ma popularitt� est de "+popularite);
    }
}
