package model.repository;

import java.util.ArrayList;
import java.util.List;
import model.entity.Vacina;


public class VacinaRepository {

	private List<Vacina> vacinas;

    public VacinaRepository() {
        this.vacinas = new ArrayList<>();
    }

    public void salvarVacina(Vacina vacina) {
        vacinas.add(vacina);
    }

    public List<Vacina> listarVacinas() {
        return vacinas;
    }

    public void excluirVacina(int idVacina) {
        vacinas.remove(idVacina);
    }
    
    public boolean vacinaAplicadaEmPessoa(int idVacina) {
        return false;
    }

	public static Vacina consultarVacinaPorId(int idVacina) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void atualizarVacina(Vacina vacina) {
		// TODO Auto-generated method stub
		
	}
    
    
	
}
