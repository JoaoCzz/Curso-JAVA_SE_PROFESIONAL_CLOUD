package DAO;

import java.util.List;

import model.Comunidad;
import model.Provincia;

public interface ProvinciasDAO {
	void save (List<Provincia> provincias);
	List<String> FindCODE();
}
