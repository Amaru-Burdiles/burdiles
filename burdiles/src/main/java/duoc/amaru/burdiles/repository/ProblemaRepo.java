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
}
