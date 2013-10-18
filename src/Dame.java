
public class Dame extends Humain{
	private String couleurRobe;
	private boolean libre=true;
	public Dame(String unNom){
		
		super(unNom);
		boisson="lait";
		
	}
	public Dame(String unNom, String uneBoisson){
			
			super(unNom, uneBoisson);
			uneBoisson="lait";
			
		}
	public Dame(String unNom, String uneBoisson,String uneCouleur){
		
		super(unNom, uneBoisson);
		couleurRobe=uneCouleur;
	}
	
	public void seFaireCapturer(){
		parle("AHHHHHHHHHHHHHHHHHHHHH !");
		libre=false;
	
	}
	
	public void seFaireLiberer(Cowboy unCowboy){
		
		parle("Merci "+unCowboy.quel_est_ton_nom()+"tu es si beau et si fort");
		libre=true;
		
	}
	public void changerDeRobe(String couleur)
    {
	couleurRobe = couleur;
	parle("Regardez ma belle robe " + couleurRobe + " !");
    }
	
	public String quel_est_ton_nom()
    {
	return "Miss " +super.quel_est_ton_nom();

    }
	
	public void presenter()
    {
	super.presenter();
	parle("J'ai une robe " + couleurRobe + " magnifique !");
    }
	
	
}
