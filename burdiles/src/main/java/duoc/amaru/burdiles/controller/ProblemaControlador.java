package duoc.amaru.burdiles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import duoc.amaru.burdiles.service.ProblemaServicio;

@RestController
@RequestMapping("api/v1/incidencias")
public class ProblemaControlador {
    @Autowired
    private ProblemaServicio problemaServicio;
}
