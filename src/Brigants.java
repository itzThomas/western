
public class Brigants extends Humain{
	private String look="méchant";
	private int nbDameEnleve;
	private int recompense;
	private boolean prisonier;
	
	
	public Brigants (String unNom){
		super(unNom);
		boisson="tord-Boyaux";
		
	}
	public Brigants (String unNom, String uneBoisson){
		super(unNom,uneBoisson);
		
	}
	public Brigants (String unNom, String uneBoisson,String unLook){
		super(unNom,uneBoisson);
		look=unLook;
		;
		
	}
	public void Capturer(Dame uneDame){
		uneDame.seFaireCapturer();
		nbDameEnleve++;
		parle("Ah ah ! " + uneDame.quel_est_ton_nom() + ", vous êtes mienne désormais !");
		recompense = recompense+100;
		
	}
	
	public void EnPrison(Cowboy unCowboy)
    {
	prisonier = true;
	parle("Damned, je suis fait ! "+ unCowboy.quel_est_ton_nom() + ", tu m'as eu !");
    }
	
	public int get_mise_a_prix()
    {
	return recompense;
    }
	
	public String quel_est_ton_nom()
    {
	return super.quel_est_ton_nom() + " "+ look;
    }

	public void presenter()
    {
	super.presenter();
	parle("Je suis " + look + " et j'ai enlevé " + nbDameEnleve + " dames, et ma tête a pour prix "+recompense+"$ ");
    }
	
	
}

