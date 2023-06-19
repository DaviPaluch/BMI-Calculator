package com.example.IMC;

import java.text.DecimalFormat;

public class Paciente {
	
	
	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(40, 1.7);
		Paciente p2 = new Paciente(54, 1.8);
		Paciente p3 = new Paciente(58, 1.8);
		Paciente p4 = new Paciente(45, 1.5);
		Paciente p5 = new Paciente(100, 2.0);
		Paciente p6 = new Paciente(120, 2.0);
		Paciente p7 = new Paciente(130, 2.0);
		Paciente p8 = new Paciente(140, 2.0);
		Paciente p9 = new Paciente(157, 1.85);
		
		System.out.println("p1:\n" + p1.diagnostico()+" "+ p1.iMC+  "\n");
		System.out.println("p2:\n" + p2.diagnostico()+" "+ p2.iMC+  "\n");
		System.out.println("p3:\n" + p3.diagnostico()+" "+ p3.iMC+  "\n");
		System.out.println("p4:\n" + p4.diagnostico()+" "+ p4.iMC+  "\n");
		System.out.println("p5:\n" + p5.diagnostico()+" "+ p5.iMC+  "\n");
		System.out.println("p6:\n" + p6.diagnostico()+" "+ p6.iMC+  "\n");
		System.out.println("p7:\n" + p7.diagnostico()+" "+ p7.iMC+  "\n");
		System.out.println("p8:\n" + p8.diagnostico()+" "+ p8.iMC+  "\n");
		System.out.println("p9:\n" + p9.diagnostico()+" "+ p9.iMC+  "\n");


	}
	
	
	
	
	
	double peso;
	double altura;
	double iMC;
	
	public Paciente(double peso, double altura) {
		
		try{
			if(peso <= 0 || altura <= 0) {
				throw new RuntimeException("O valor inserido deve ser maior que zero!");
			}
			this.peso = peso;
			this.altura = altura;
			this.iMC = this.calcularIMC(peso, altura);
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	public double calcularIMC(double peso, double altura) {
		return peso/(altura*altura);
	}
	
	public String diagnostico() {
		
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		
		double value = Double.parseDouble(decimalFormat.format(calcularIMC(this.peso,this.altura))) ;
		
		
		if(value < 16) {
			return "Baixo peso muito grave";
		} 
		else if(value < 17 && value >= 16) {
			return "Baixo peso grave";
		}
		else if (value >= 17 && value < 18.5) {
			return "Baixo peso";
		}
		else if (value >= 18.5 && value < 25) {
			return "Peso normal";
		}
		else if (value >= 25 && value < 30) {
			return "Sobrepeso";
		}
		else if (value >= 30 && value < 35) {
			return "Obesidade grau I";
		}
		else if (value >= 35 && value < 40) {
			return "Obesidade grau II";
		}
		else{
			return "Obesidade grau III (obesidade morbida)"; 
		}
		
	}
}

