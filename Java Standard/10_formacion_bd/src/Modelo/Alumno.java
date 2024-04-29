package Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alumno {
private String dni;
private int edad;
private String nombre;
private double nota;
private int idCurso;

}
