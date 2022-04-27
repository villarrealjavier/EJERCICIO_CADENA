package main.java.model;

public class Cadena<T> {

	
	private Object contenido;
	
	
	public Cadena(Object contenido) {
		this.contenido=contenido;
	}
	
	
	
	public boolean esAnagrama() {
		
		boolean anagrama = false;
		 
			 if (this.contenido instanceof String) {
			String content = this.contenido instanceof String? (String) contenido: null;
		
		
		if(content!=null && !content.isEmpty()	&& !content.trim().isEmpty()) {
			anagrama = true;
			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isAlphabetic(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					anagrama = false;
				}
			}
		}
		}
		return anagrama;
		
	}
public boolean esAnagrama(String cadena) {
		
		boolean anagrama = false;
		if (this.contenido instanceof String) {
		String content = cadena instanceof String? (String) cadena: null;
		
		if(content!=null && !content.isEmpty()	&& !content.trim().isEmpty()) {
			anagrama = true;
			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isAlphabetic(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					anagrama = false;
				}
			}
		}
		}
		return anagrama;
		
	}
	
	
	public boolean esCapicua() {
		boolean capicua = false;
			String content = this.contenido instanceof Number? String.valueOf(this.contenido): null;
			capicua = content!=null && !content.isEmpty() && !content.trim().isEmpty();
		
		if(capicua) {

			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isDigit(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		
		}
		
		 
		 	return capicua;
		
	}
public boolean esCapicua(Number numero) {
		boolean capicua=false;
	 
		String content = numero instanceof Number? String.valueOf(numero): null;
		 capicua = content!=null && !content.isEmpty() && !content.trim().isEmpty();
		
		if(capicua) {

			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isDigit(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		}

	
	return capicua;
	
}
}
