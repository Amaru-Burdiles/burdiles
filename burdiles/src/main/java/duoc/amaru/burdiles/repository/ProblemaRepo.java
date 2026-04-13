package duoc.amaru.burdiles.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import duoc.amaru.burdiles.model.Problema;

@Repository
public class ProblemaRepo {
    private List<Problema> incidencias = new ArrayList<>();

    public List<Problema> getIncidencias() {
        return incidencias;
    }

    public String addProblema(Problema newProblema) {
        incidencias.add(newProblema);
        return "Añadido";
    }

    public String setProblema(int id, Problema newInfo) {
        for (Problema problema : incidencias) {
            if (problema.getId() == id) {
                problema.setDescripcion(newInfo.getDescripcion());
                problema.setEstado(newInfo.getEstado());
                problema.setPrioridad(newInfo.getPrioridad());
                problema.setAutor(newInfo.getAutor());
                return "Actualizado";
            }
        }
        return "No encontrado";
    }

    public String deleteProblema(int id) {
        for (Problema problema : incidencias) {
            if (problema.getId() == id) {
                incidencias.remove(problema);
                return "Eliminado";
            }
        }
        return "No encontrado";
    }
}
