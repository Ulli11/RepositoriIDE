package CamioVaques;

import java.util.List;

public class Pastor {
	
	private String resultat;
	
	public void ompleCamio (CamioVaques camio, List<Vaca> vaques) {
		int maximLitres = 0;
		
		for (int i = 0; i < vaques.size(); i++) {
			int litres=calculaResultat(camio, vaques.subList(i,  vaques.size()));
			if (litres > maximLitres) {
				maximLitres=litres;
				resultat= camio.toString();
			}
			camio.treureVaques();
		}
	}
	private int calculaResultat(CamioVaques camio, List<Vaca> subList) {
		for (Vaca vaca:  subList){
			if (camio.posarVAca(vaca)==false) {
				break;
			}
		}
		return camio.lletVaques();
	}
	public String getResultat() {
		return resultat;
	}
	
}
