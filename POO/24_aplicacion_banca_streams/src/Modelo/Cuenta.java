package Modelo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cuenta {
private String nCuenta;
private String titular;
private LocalDate fApertura;
private String divisa;
private double saldo;

}
