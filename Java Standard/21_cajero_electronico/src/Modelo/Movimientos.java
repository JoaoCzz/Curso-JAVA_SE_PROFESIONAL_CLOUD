package Modelo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movimientos {
private int idMovimiento;
private int idCuenta;
private LocalDateTime fecha;
private double cantidad;
private String operacion;
}
