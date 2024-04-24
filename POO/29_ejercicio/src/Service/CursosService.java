package Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

import modelo.Alumno;
import modelo.Curso;
import modelo.Pedidos;

public class CursosService {
	List<Curso> cursos=new ArrayList<>(List.of(
			new Curso("Java","Programación",120,LocalDate.of(2014, 11, 10),LocalDate.of(2015, 1, 30),List.of(new Alumno("a1",5.6),
					new Alumno("a2",8),new Alumno("a8",6),new Alumno("b7",4))),
			new Curso("Angular","Programación",80,LocalDate.of(2021, 06, 10),LocalDate.of(2021, 9, 8),List.of(new Alumno("r2",3.6),
					new Alumno("a9",7),new Alumno("b4",5))),
			new Curso("HTML y CSS","Web",60,LocalDate.of(2019, 03, 15),LocalDate.of(2019, 5, 30),List.of(new Alumno("r9",4),
					new Alumno("v4",6),new Alumno("h1",3),new Alumno("s9",5),new Alumno("k2",2))),
			new Curso("Oracle","Bases de datos",100,LocalDate.of(2020, 10, 20),LocalDate.of(2021, 2, 12),List.of(new Alumno("s10",9),
					new Alumno("r1",4))),
			new Curso("SQL","Bases de datos",40,LocalDate.of(2018, 02, 06),LocalDate.of(2018, 4, 20),List.of(new Alumno("y6",7),
					new Alumno("u7",2),new Alumno("b8",4),new Alumno("t2",6))),
			new Curso("Python","Programación",90,LocalDate.of(2016, 10, 23),LocalDate.of(2017, 3, 30),List.of(new Alumno("l9",7.6),
					new Alumno("g5",3),new Alumno("n1",8.4),new Alumno("x6",5.9)))
			)); 
	
	
	public boolean nuevoCurso(Curso curso) {
		 if (!cursos.stream().anyMatch(c -> c.getCurso().equals(curso.getCurso()) && c.getFInicio().equals(curso.getFInicio()))) {
		        cursos.add(curso);
		        return true; 
		 }else {
		return false;
		 }
	}
	
	public OptionalDouble precioMedio(String tematica) {
	return cursos.stream().filter(t -> t.getTema().equals(tematica)).mapToDouble(n->n.getPrecio()).average();
	}
	
	public int cursosFinalizados(LocalDate fecha) {
		return (int) cursos.stream().filter(cursos -> cursos.getFFinal().isBefore(fecha)).count();                 
	}
	public List <Curso> cursosPorTematica(String tematica){
	return cursos.stream().filter(t -> t.getTema().equals(tematica)).collect(Collectors.toList());
	}
	
	public Set<String> conjuentotematica(){
		return cursos.stream().map(c -> c.getTema()).distinct().collect(Collectors.toSet());
	}
	public List<Curso> cursosporPrecio(Double precio1, Double precio2){
		return cursos.stream().filter(p -> p.getPrecio() >= precio1 && p.getPrecio() <= precio2)
                .collect(Collectors.toList());
	}
	public List<Curso> cursosPorMeses(int meses){
	return cursos.stream()
                .filter(curso -> ChronoUnit.MONTHS.between(curso.getFInicio(), curso.getFFinal()) <= meses)
                .collect(Collectors.toList());
	}
	
}


