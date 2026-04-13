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
}
