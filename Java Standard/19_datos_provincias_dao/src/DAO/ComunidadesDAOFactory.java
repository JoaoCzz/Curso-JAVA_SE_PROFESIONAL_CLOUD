package DAO;

public class ComunidadesDAOFactory {
public static ComunidadesDAO getComunidadesDAO() {
	return new ComunidadesDAOimpl();
	
}
public static ProvinciasDAO getProvinciasDAO() {
	return new ProvinciasDAOimpl();
}


}
