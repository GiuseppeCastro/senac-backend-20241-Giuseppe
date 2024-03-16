package service;

import model.entity.Vacina;
import model.repository.VacinaRepository;

public class VacinaService {

	 private VacinaRepository vacinaRepository;

	    public VacinaService() {
	        this.vacinaRepository = new VacinaRepository();
	    }

	    // Método para salvar uma nova vacina
	    public void salvarVacina(Vacina vacina) {
	        vacinaRepository.salvarVacina(vacina);
	    }
	
}
