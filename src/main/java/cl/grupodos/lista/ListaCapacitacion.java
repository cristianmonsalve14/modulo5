package cl.grupodos.lista;

import java.util.ArrayList;
import java.util.List;

public class ListaCapacitacion {
	private static ListaCapacitacion capacitacion;
	private static  List<String> lista;
	
	private ListaCapacitacion () {
		
	}
	
	public static ListaCapacitacion getInstance() {
		
		if (capacitacion == null) {
			 capacitacion = new ListaCapacitacion ();
			 lista = new ArrayList<String>();
		 }
		 
		 return capacitacion;
	}
	
	public List<String> getList(){
		return lista;
	}
}
