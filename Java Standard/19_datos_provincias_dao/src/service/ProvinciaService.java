package service;
import java.util.List;
import model.Provincia;
import DAO.ProvinciasDAO;
public class ProvinciaService {
ProvinciasDAO provinciasDao;	

public int saveProvincias(List<Provincia> provincias) {
List<String> codigos= provinciasDao.FindCODE();
	return provincias.stream().filter(p -> !codigos.contains(p.getCodigo())).;
}

}
