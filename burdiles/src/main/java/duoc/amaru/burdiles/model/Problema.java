package duoc.amaru.burdiles.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Problema {
    private int id;
    private String descripcion;
    private String estado;
    private String prioridad;
    private String reportedBy;
    private LocalDate fechaRegistro;
}
