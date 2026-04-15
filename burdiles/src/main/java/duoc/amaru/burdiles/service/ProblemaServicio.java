package duoc.amaru.burdiles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import duoc.amaru.burdiles.model.Problema;
import duoc.amaru.burdiles.repository.ProblemaRepo;

@Service
public class ProblemaServicio {
    @Autowired
    private ProblemaRepo problemaRepo;

    public List<Problema> readAll() {
        return problemaRepo.getIncidencias();
    }

    public String createProblema(Problema newProblema) {
        return problemaRepo.addProblema(newProblema);
    }

    public boolean updateProblema(int id, Problema newInfo) {
        return problemaRepo.setProblema(id, newInfo);
    }

    public boolean deleteProblema(int id) {
        return problemaRepo.deleteProblema(id);
    }

    public List<Problema> findByUser(String name) {
        return problemaRepo.getByUser(name);
    }

    public List<Problema> sortByPrioridad(String altoBajo) {
        return problemaRepo.getByPrioridad(altoBajo);
    }
}
