package duoc.amaru.burdiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> getIncidencias() {
        List<Problema> problemas = problemaServicio.readAll();
        if (problemas.isEmpty()) {
            return ResponseEntity.status(404).body("No hay incidencias registradas");
        }
        return ResponseEntity.ok(problemas);
    }
    
    @PostMapping
    public ResponseEntity<?> postProblema(@Valid @RequestBody Problema newProblema) {
        String result = problemaServicio.createProblema(newProblema);
        return ResponseEntity.ok(result);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> putProblema(@PathVariable int id, @Valid @RequestBody Problema newInfo) {
        boolean resultado = problemaServicio.updateProblema(id, newInfo);
        if (resultado) {
            return ResponseEntity.ok("Incidencia actualizada correctamente");
        }
        return ResponseEntity.status(404).body("Incidencia no encontrada");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProblema(@PathVariable int id) {
        boolean resultado = problemaServicio.deleteProblema(id);
        if (resultado) {
            return ResponseEntity.ok("Incidencia eliminada correctamente");
        }
        return ResponseEntity.status(404).body("Incidencia no encontrada");
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
