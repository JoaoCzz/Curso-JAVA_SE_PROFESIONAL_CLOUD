package DAO;

import java.util.List;

import model.Comunidad;

public interface ComunidadesDAO {
	void save(Comunidad comunidad);
	void save (List<Comunidad> comunidades);
	boolean existComunidad(String codigo);
	

}
