package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class NotasService {
	ArrayList<Double> notas=new ArrayList<Double>();
	String ruta= "notas.txt";
	public void agregarNota(double nota) {
		try (FileOutputStream fos = new FileOutputStream(ruta, true);
	            PrintStream out = new PrintStream(fos)) {
			out.print(nota);
		 } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	public double media() {
		double media=0;
		double contador= 0;
		try (FileReader fr= new FileReader(ruta);
				BufferedReader bf= new BufferedReader(fr)){	
			String linea = null;
			while((linea=bf.readLine())!=null){
				String[] partes = linea.split("\\.");
				for (String parte : partes) {
					double value = Double.parseDouble(parte.trim());
                    media += value;
                    contador++;
				}
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return media>0?media/contador:0;
	}
	public double max() {
		double mayor =0;
        try (FileReader fr = new FileReader(ruta);
             BufferedReader bf = new BufferedReader(fr)) {
            String linea = null;
            while ((linea = bf.readLine()) != null) {
            	String[] partes = linea.split("\\.");
				for (String parte : partes) {
                double valor = Double.parseDouble(parte);
                if (valor > mayor) {
                    mayor = valor;
                }
            }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return mayor;
    }

	public double min() {
		double menor= 0;
		try (FileReader fr= new FileReader(ruta);
				BufferedReader bf= new BufferedReader(fr)){	
			String linea = null;
			while((linea=bf.readLine())!=null){
				String[] partes = linea.split("\\.");
				for (String parte : partes) {
			double value = Double.parseDouble(parte);
			if (value < menor) {
                menor = value;
            }
		}
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return menor;
	}
	public Double[] obtenerNotas() {
		String linea = null;
		try (FileReader fr= new FileReader(ruta);
				BufferedReader bf= new BufferedReader(fr)){		
			while((linea=bf.readLine())!=null){
				String[] partes = linea.split("\\.");
				for (String parte : partes) {
					Double nota = Double.parseDouble(parte.trim());
                    notas.add(nota);
			}
			}
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException ex) {
		ex.printStackTrace();
	}
		return notas.toArray(new Double[0]);
	
}
}
