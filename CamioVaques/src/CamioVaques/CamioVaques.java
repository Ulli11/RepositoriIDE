package CamioVaques;

import java.util.List;
import java.util.ArrayList;

public class CamioVaques {
    private int pesMaxim;
    private int numeroVaques;
    List<Vaca> vaques = new ArrayList<>();

	public CamioVaques(int max) {
		pesMaxim = max;
	}
	
    public boolean posarVAca( Vaca vaca) {
    	if (pesVaques() + vaca.getPes() > pesMaxim) {
    		return false;
    	}
    	
    	vaques.add(vaca);
    	return true;
    }

	private int pesVaques() {
		int pes = 0;
		for(Vaca burra: vaques) {
			pes += burra.getPes();
		}
		return pes;
	}
	public void treureVaques() {
		vaques.clear();
	}
	
	public int lletVaques() {
		int llet = 0;
		for (Vaca vaca: vaques) {
			llet += vaca.getLitres();
		}
		return llet;
	}

	@Override
	public String toString() {
		return vaques.toString();
	}
	
	
	
}
