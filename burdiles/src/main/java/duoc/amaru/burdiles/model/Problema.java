package duoc.amaru.burdiles.model;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Problema {
    private static AtomicInteger contador = new AtomicInteger(100);
    private int id;

    private String descripcion;
    private String estado;
    private String prioridad;
    private String autor;
    private LocalDate fechaRegistro;

    public Problema(String descripcion, String estado, String prioridad, String autor) {
        this.id = contador.getAndIncrement();
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.autor = autor;
        this.fechaRegistro = LocalDate.now();
    }
}
