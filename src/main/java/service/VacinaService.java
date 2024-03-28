package service;

import model.entity.Vacina;
import model.repository.VacinaRepository;

public class VacinaService {

	 private VacinaRepository vacinaRepository;

	    public VacinaService() {
	        this.vacinaRepository = new VacinaRepository();
	    }

	    public void salvarVacina(Vacina vacina) {
	        vacinaRepository.salvarVacina(vacina);
	    }
	    
	    public void excluirVacina(int idVacina) {
	        if (vacinaRepository.vacinaAplicadaEmPessoa(idVacina)) {
	            throw new RuntimeException("Não é possível excluir a vacina, pois ela já foi aplicada em pelo menos uma pessoa.");
	        }

	        vacinaRepository.excluirVacina(idVacina);
	    }
	
}
