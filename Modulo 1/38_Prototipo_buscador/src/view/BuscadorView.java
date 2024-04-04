package view;

import java.security.Provider.Service;
import java.util.HashSet;
import java.util.Scanner;

import Model.Direccion;
import Service.BuscadorService;

public class BuscadorView {
public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	BuscadorService se= new BuscadorService();
	System.out.println("Introduce tematica");
	String tematica= teclado.nextLine();
	HashSet<Direccion> direcciones= se.buscadorTematicas(tematica);
	for(Direccion d:direcciones) {
		System.out.println("URL: "+d.getUrl());
		System.out.println("Descripción: "+d.getDescripcion());
		System.out.println("-----------------------");
	}
	
}



}
