package duoc.amaru.burdiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import duoc.amaru.burdiles.model.Problema;
import duoc.amaru.burdiles.service.ProblemaServicio;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




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
    public String postProblema(@Valid @RequestBody Problema newProblema) {
        return problemaServicio.createProblema(newProblema);
    }
    
    @PutMapping("/{id}")
    public String putProblema(@PathVariable int id, @Valid @RequestBody Problema newInfo) {
        return problemaServicio.updateProblema(id, newInfo);
    }

    @DeleteMapping("/{id}")
    public String deleteProblema(@PathVariable int id) {
        return problemaServicio.deleteProblema(id);
    }

    @GetMapping("/user/{name}")
    public List<Problema> getProblemasByUser(@PathVariable String name) {
        return problemaServicio.findByUser(name);
    }
    
    @GetMapping("/sort/{altoBajo}")
    public List<Problema> getByPrioridad(@PathVariable String altoBajo) {
        return problemaServicio.sortByPrioridad(altoBajo);
    }
    
}
