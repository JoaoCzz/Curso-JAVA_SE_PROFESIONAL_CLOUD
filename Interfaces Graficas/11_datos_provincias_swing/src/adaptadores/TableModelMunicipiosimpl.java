package adaptadores;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Municipio;

import service.DatosProvinciasService;


public class TableModelMunicipiosimpl extends AbstractTableModel {
	List<Municipio> municipios;
	DatosProvinciasService municipiosService;
	public TableModelMunicipiosimpl(String Provincias) {
		var MunicipiosService= municipiosService.municipiosComunidad(Provincias);
		municipios= MunicipiosService;
	}
	@Override
	public int getRowCount() {
		
		return municipios.size();
	}

	@Override
	public int getColumnCount() {
		return 1;
	}
	@Override
	public String getColumnName(int column) {
		return switch(column) {
		case 0->"Nombre";
		case 1->"Población";
		default->"";
	};
	}
	
	@Override
	public Object getValueAt(int row, int column) {
		return switch(column) {
		case 0->municipios.get(row).getNombreMunicipio();
		case 1->municipios.get(row).getPoblacion();
		default->"";
	};
	}
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return switch(columnIndex) {
			case 0->String.class;
			case 1->String.class;
			default->String.class;
		};
	}

}
