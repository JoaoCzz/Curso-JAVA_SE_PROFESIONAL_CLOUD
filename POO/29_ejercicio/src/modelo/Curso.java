package modelo;
import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
private String curso;
private String Tema;
private double precio;
private LocalDate fInicio;
private LocalDate fFinal;
private List <Alumno> alumnos;




}
