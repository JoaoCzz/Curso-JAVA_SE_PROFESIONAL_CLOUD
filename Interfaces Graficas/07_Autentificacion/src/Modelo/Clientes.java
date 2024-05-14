package Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Clientes {
private int idCliente;
private String usuario;
private String password;
private String email;
private int telefono;

}
