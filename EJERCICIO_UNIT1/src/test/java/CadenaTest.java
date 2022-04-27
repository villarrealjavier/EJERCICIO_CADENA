package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.java.model.Cadena;

class CadenaTest {
	//NUMERO
	@ValueSource(ints = {1111,1991})
	@ParameterizedTest
	void esCapicuatest(int numero) {
		Cadena cadena = new Cadena(numero);
		assertEquals(cadena.esCapicua(), true);
	}
	
	//LONG
	@ValueSource(longs = {111111111,22222222})
	@ParameterizedTest
	void esCapicuaLongtest(Long numero) {
		Cadena cadena = new Cadena(numero);
		assertEquals(cadena.esCapicua(numero), true);
	}
	@ValueSource(longs = {-1114561111,22264222})
	@ParameterizedTest
	void noEsCapicuaLongtest(Long numero) {
		Cadena cadena = new Cadena(numero);
		assertEquals(cadena.esCapicua(numero), false);
	}
	
	//DOUBLE
	@ValueSource(doubles = {55.55,12.21,33.33})
	@ParameterizedTest
	void esCapicuaDoubletest(Double numero) {
		Cadena cadena = new Cadena(numero);
		assertEquals(cadena.esCapicua(numero), true);
	}
	@ValueSource(doubles = {-123,56,22,24})
	@ParameterizedTest
	void noEsCapicuaDoubletest(double numero) {
		Cadena cadena = new Cadena(numero);
		assertEquals(cadena.esCapicua(numero), false);
	}
	
	//STRING
	@ValueSource(strings = {"Hola","ana","paco"})
	@ParameterizedTest
	void noEsCapicuaString(String valor) {
		Cadena cadena = new Cadena(valor);
		assertEquals(cadena.esCapicua(), false);

	}
	//ANAGRAMA
	@ValueSource(strings = {"lool","ana","puup"})
	@ParameterizedTest
	void esAnagrama(String valor) {
		Cadena cadena = new Cadena(valor);
		assertEquals(cadena.esAnagrama(), true);
	}
	
	
	@ValueSource(strings = {"lilaco","paquito","pimpa"})
	@ParameterizedTest
	void noEsAnagrama(String valor) {
		Cadena cadena = new Cadena(valor);
		assertEquals(cadena.esAnagrama(), false);
	}
	
	//STRING
	@ValueSource(strings = {"lool","ana","puup"})
	@ParameterizedTest
	void esAnagramaString(String valor) {
		Cadena cadena = new Cadena(valor);
		assertEquals(cadena.esAnagrama(), true);
	}
	
	@ValueSource(strings = {"julian","","taco"})
	@ParameterizedTest
	void noEsAnagramaString(String valor) {
		Cadena cadena = new Cadena(valor);
		assertEquals(cadena.esAnagrama(), false);
	}
	
	
	
}
