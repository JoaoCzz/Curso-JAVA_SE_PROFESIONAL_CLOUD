package Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cuenta {
private int numeroCuenta;
private double saldo;
private Cliente cliente;
private String tipoCuenta;
}
