package Modelo;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
	@SerializedName(value="nombre")
private String nombre;
private String email;
private double salario;
private String departamento;
}
