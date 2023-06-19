package com.example.IMC;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

class ImcValues {

	
	
	void antes() {
		
	}
	@Test
	void BaixoPesoMuitoGrave() {
		
		Paciente baixoPesoMuitoGrave = new Paciente(40, 1.70);
		
		//Diagnostico
		assertEquals("Baixo peso muito grave", baixoPesoMuitoGrave.diagnostico());
		
		//Valor
		assertEquals(13.8, baixoPesoMuitoGrave.iMC, 1); // uma unidade de tolerancia
		
		
		
	}
	@Test
	void BaixoPesoGrave() {
		
		Paciente baixoPesoMuitoGrave = new Paciente(54, 1.8);
		
		//Diagnostico
		assertEquals("Baixo peso grave", baixoPesoMuitoGrave.diagnostico());
		
		//Valor
		assertEquals(16.6, baixoPesoMuitoGrave.iMC, 1); // uma unidade de tolerancia
		
		
		
	}
	@Test
	void BaixoPeso() {
		
		Paciente BaixoPeso = new Paciente(58, 1.8);
		
		//Diagnostico
		assertEquals("Baixo peso", BaixoPeso.diagnostico());
		
		//Valor
		assertEquals(17.9, BaixoPeso.iMC, 1); // uma unidade de tolerancia
		
		
		
	}
	@Test
	void PesoNormal() {
		
		Paciente PesoNormal = new Paciente(45, 1.5);
		
		//Diagnostico
		assertEquals("Peso normal", PesoNormal.diagnostico());
		
		//Valor
		assertEquals(20.0, PesoNormal.iMC, 1); // uma unidade de tolerancia
		
		
		
	}
	@Test
	void SobrePeso() {
		
		Paciente SobrePeso = new Paciente(100, 2.0);
		
		//Diagnostico
		assertEquals("Sobrepeso", SobrePeso.diagnostico());
		
		//Valor
		assertEquals(25.0, SobrePeso.iMC, 1); // uma unidade de tolerancia
		
		
		
	}
	@Test
	void Obesidade1() {
		
		Paciente Obesidade1 = new Paciente(120, 2.0);
		
		//Diagnostico
		assertEquals("Obesidade grau I", Obesidade1.diagnostico());
		
		//Valor
		assertEquals(30.0, Obesidade1.iMC, 1); // uma unidade de tolerancia
		
		
		
	}
	@Test
	void Obesidade2() {
		
		Paciente Obesidade2 = new Paciente(140, 2.0);
		
		//Diagnostico
		assertEquals("Obesidade grau II", Obesidade2.diagnostico());
		
		//Valor
		assertEquals(35.0, Obesidade2.iMC, 1); // uma unidade de tolerancia
		
		
		
	}
	@Test
	void Obesidade3() {
		
		Paciente Obesidade3 = new Paciente(157, 1.85);
		
		//Diagnostico
		assertEquals("Obesidade grau III (obesidade morbida)", Obesidade3.diagnostico());
		
		//Valor
		assertEquals(45.87, Obesidade3.iMC, 1); // uma unidade de tolerancia
		
		
		
	}

}
