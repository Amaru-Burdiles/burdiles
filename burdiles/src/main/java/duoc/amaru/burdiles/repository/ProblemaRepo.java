package duoc.amaru.burdiles.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import duoc.amaru.burdiles.model.Problema;

@Repository
public class ProblemaRepo {
    private List<Problema> incidencias = new ArrayList<>();

    // Mostrar todo
    public List<Problema> getIncidencias() {
        return incidencias;
    }

    // Agregar incidencia
    public String addProblema(Problema newProblema) {
        incidencias.add(newProblema);
        return "Incidencia añadida con ID: " + newProblema.getId();
    }

    // Buscar por ID
    public Problema getById(int id) {
        for (Problema problema : incidencias) {
            if (problema.getId() == id) {
                return problema;
            }
        }
        return null;
    }

    // Actualizar por ID
    public boolean setProblema(int id, Problema newInfo) {
        Problema existe = getById(id);
        if (existe == null) {
            return false;
        }
        existe.setDescripcion(newInfo.getDescripcion());
        existe.setEstado(newInfo.getEstado());
        existe.setPrioridad(newInfo.getPrioridad());
        existe.setAutor(newInfo.getAutor());
        return true;
    }

    // Eliminar por ID
    public boolean deleteProblema(int id) {
        Problema existe = getById(id);
        if (existe == null) {
            return false;
        }
        incidencias.remove(existe);
        return true;
    }

    public List<Problema> getByUser(String name) {
        List<Problema> resultados = new ArrayList<>();
        for (Problema problema : incidencias) {
            if (problema.getAutor().equalsIgnoreCase(name)) {
                resultados.add(problema);
            }
        }
        return resultados;
    }

    public List<Problema> getByPrioridad(String altoBajo) {
        List<Problema> resultados = new ArrayList<>();
        for (Problema problema : incidencias) {
            if (problema.getPrioridad().equalsIgnoreCase(altoBajo)) {
                resultados.add(problema);
            }
            
        }
        return resultados;
    }
}
