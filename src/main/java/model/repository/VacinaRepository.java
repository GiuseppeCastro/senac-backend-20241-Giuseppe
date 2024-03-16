package model.repository;

import java.util.ArrayList;
import java.util.List;
import model.entity.Vacina;


public class VacinaRepository {

	private List<Vacina> vacinas;

    public VacinaRepository() {
        this.vacinas = new ArrayList<>();
    }

    // Método para salvar uma nova vacina
    public void salvarVacina(Vacina vacina) {
        vacinas.add(vacina);
    }

    // Método para listar todas as vacinas cadastradas
    public List<Vacina> listarVacinas() {
        return vacinas;
    }

    // Método para excluir uma vacina
    public void excluirVacina(Vacina vacina) {
        vacinas.remove(vacina);
    }
	
}
