package Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import Modelo.Cuenta;

public class CuentaService {
	List<Cuenta> cuentas=new ArrayList<Cuenta>(List.of(
			new Cuenta("ES1420800222823000247854",
		            "Fernando López Gómez", LocalDate.parse("2018-04-14"),
		            "EUR", Double.valueOf("125477.44")),
		    new Cuenta("ES3520800014523000687719",
		            "Marcos Pérez Sánchez", LocalDate.parse("1998-10-01"),
		            "EUR", Double.valueOf("9465.59")),		
		    new Cuenta("ES4720800136253000145866",
		            "Francisco González Fernández", LocalDate.parse("2000-11-03") ,
		            "JPY", 3258745.7),
		   new Cuenta("8747-369", "Kenji Nakamura",
				   LocalDate.parse("1984-06-17") , "JPY", 985471.4))); 
	
	
	public boolean CuentasExistentes(String nCuenta) {
		return cuentas.stream().anyMatch(c->c.getNCuenta().equals(nCuenta));
		
	}
	public int CuantasDivisas(String divisa) {

		return (int)cuentas.stream().filter(c -> c.getDivisa().equals(divisa)).count();
	}
	public int contarCuentasDespuesFecha(LocalDate fecha) {
		return (int)cuentas.stream().filter(c -> c.getFApertura().isBefore(fecha)).count();
	}
	public Cuenta CuentaBuscar (String numero) {
		return cuentas.stream().filter(c -> c.getNCuenta().equals(numero)).findFirst().orElse(null);
	}
	public Optional<Cuenta> CuentaBuscarTitular (String titular) {
		return cuentas.stream().filter(c -> c.getTitular().equals(titular)).findFirst();
	}
	
	//metodo que deuelva la cuenta con menor saldo
	
	public Optional <Cuenta> MenorSaldo() {
		//return cuentas.stream().sorted((a,b)-> Double.compare(a.getSaldo(), b.getSaldo())).findFirst();
		//return cuentas.stream().min((a,b)->Double.compare(a.getSaldo(), b.getSaldo()));
		return cuentas.stream().min(Comparator.comparingDouble(c -> c.getSaldo()));
		
	}
	
	 public List<Cuenta> listaCuentasPorDivisa (String divisa){
		return cuentas.stream().filter(c->c.getDivisa().equalsIgnoreCase(divisa)).collect(Collectors.toList());
	}
	 
	public Map<String,Double> cuentasSaldo(){
		return cuentas.stream().collect(Collectors.toMap(c -> c.getNCuenta(), g-> g.getSaldo()));
	}
	 
}
