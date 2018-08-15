package PaqueteMonto;
public class MontoEscrito{

	public static String unidades (int unidad) {
		switch (unidad) {
		case 0: return "cero";
		case 1: return "uno"; 
		case 2: return "dos"; 
		case 3: return "tres";
		case 4: return "cuatro";
		case 5: return "cinco"; 
		case 6: return "seis"; 
		case 7: return "siete";
		case 8: return "ocho"; 
		case 9: return "nueve";
		default:
			return "";
		}
	}
	
	
	public static String decenas (int decena) {
		switch (decena) {
		case 10: return "diez "; 
		case 20: return "veinte "; 
		case 30: return "treinta ";
		case 40: return "cuarenta ";
		case 50: return "cincuenta "; 
		case 60: return "sesenta "; 
		case 70: return "setenta ";
		case 80: return "ochenta "; 
		case 90: return "noventa ";
		default:
			return " y ";
		}
	}
	public static String especiales (int especial) {
		switch (especial) {
		case 11: return "once"; 
		case 12: return "dos"; 
		case 13: return "tres";
		case 14: return "cuatro";
		case 15: return "cinco"; 
		case 16: return "seis"; 
		case 17: return "siete";
		case 18: return "ocho"; 
		case 19: return "nueve";
		default:
			return "";
		}
	}
	
}
//Prueba de modificacion del programa
