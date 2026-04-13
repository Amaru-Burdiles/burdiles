package duoc.amaru.burdiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import duoc.amaru.burdiles.model.Problema;
import duoc.amaru.burdiles.service.ProblemaServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/v1/incidencias")
public class ProblemaControlador {
    @Autowired
    private ProblemaServicio problemaServicio;

    @GetMapping
    public List<Problema> getIncidencias() {
        return problemaServicio.readAll();
    }
    
    @PostMapping
    public String postProblema(@RequestBody Problema newProblema) {
        return problemaServicio.createProblema(newProblema);
    }
    
}
