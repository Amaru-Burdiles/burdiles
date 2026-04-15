package duoc.amaru.burdiles.model;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Problema {
    private static AtomicInteger contador = new AtomicInteger(100);
    private int id;

    @NotNull(message = "La descripción no puede ser nula")
    @NotBlank(message = "La descripción no puede estar vacía")
    @Size(min = 10, max = 200, message = "La descripción debe tener entre 10 y 200 caracteres")
    private String descripcion;

    @NotNull(message = "El estado no puede ser nulo")
    @NotBlank(message = "El estado no puede estar vacío")
    private String estado;

    @NotNull(message = "La prioridad no puede ser nula")
    @NotBlank(message = "La prioridad no puede estar vacía")
    private String prioridad;

    @NotNull(message = "El autor no puede ser nulo")
    @NotBlank(message = "El autor no puede estar vacío")
    @Size(min = 3, max = 50, message = "El nombre del autor debe tener entre 3 y 50 caracteres")
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
