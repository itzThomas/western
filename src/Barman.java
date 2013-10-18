
public class Barman extends Humain {
	
	private String NomB;
public Barman (String unNom){
		
		super(unNom,"chez"+unNom);
		boisson="Vin";
		NomB="Chez"+unNom;
	}
public Barman (String unNom,String nomBar){
	
	super(unNom,"chez"+unNom);
	boisson="Vin";
	NomB=nomBar;
}
	
	public void Servir(Humain unHumain)
    {
	parle("Tien "+ unHumain.quel_est_ton_nom() + ". cest du " + unHumain.quel_est_ta_boisson() + ".");
    }
	public void presenter()
    {
	parle("Je suis " + quel_est_ton_nom() + " du bar "+NomB+" et j'aime le "+ boisson +", Coco");
    }
}
