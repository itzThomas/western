public class Humain {
	private String nom;
	protected String boisson="eau";
	
	public Humain(String unNom, String uneBoisson){
		nom=unNom;
		boisson=uneBoisson;
	
	}
	public Humain(String unNom){
		nom=unNom;
		boisson="eau";
	
	}

	public void parle(String text){
		System.out.println("(" +quel_est_ton_nom()+ ")"+"-"+text);
		
	}
	
	
	public void presenter(){
		 parle( "bonjour, je suis  "+nom+" et j aime le "+boisson);
		
	}
	public void boire(){
		 parle( "Ah un bon verre de "+quel_est_ta_boisson()+" ! GLOUPS ");
		
	}
	public String quel_est_ton_nom() {
		
		return nom;
	}
	public String quel_est_ta_boisson() {
		
		return boisson;
	}
	
	
	
}
	

