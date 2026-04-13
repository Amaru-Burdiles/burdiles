package duoc.amaru.burdiles.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import duoc.amaru.burdiles.repository.ProblemaRepo;

@Service
public class ProblemaServicio {
    @Autowired
    private ProblemaRepo problemaRepo;
}
