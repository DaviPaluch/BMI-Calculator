package use;

import java.text.DecimalFormat;

public class Paciente {
	
	
	public static void main(String[] args) {
		Paciente p1 = new Paciente(58, 1.8);
		Paciente p2 = new Paciente(45, 1.5);
		Paciente p3 = new Paciente(100, 2.0);
		
		System.out.println("p1:\n" + p1.diagnostico()+"\n");
		System.out.println("p2:\n" + p2.diagnostico()+"\n");
		System.out.println("p3:\n" + p3.diagnostico()+"\n");

	}
	
	
	
	
	
	double peso;
	double altura;
	
	public Paciente(double peso, double altura) {
		
		try{
			if(peso <= 0 || altura <= 0) {
				throw new RuntimeException("O valor inserido deve ser maior que zero!");
			}
			this.peso = peso;
			this.altura = altura;
			
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
			return "Diagnostico: Baixo peso muito grave\nIMC: " + value + "kg/m²";
		} 
		else if(value < 17 && value >= 16) {
			return "Diagnostico: Baixo peso grave\nIMC: " + value + "kg/m²";
		}
		else if (value >= 17 && value < 18.5) {
			return "Diagnostico: Baixo peso\nIMC: " + value + "kg/m²";
		}
		else if (value >= 18.5 && value < 25) {
			return "Diagnostico: Peso normal\nIMC: " + value + "kg/m²";
		}
		else if (value >= 25 && value < 30) {
			return "Diagnostico: Sobrepeso\nIMC: " + value + "kg/m²";
		}
		else if (value >= 25 && value < 30) {
			return "Diagnostico: Obesidade grau I\nIMC: " + value + "kg/m²";
		}
		else if (value >= 25 && value < 30) {
			return "Diagnostico: Obesidade grau II\nIMC: " + value + "kg/m²";
		}
		else{
			return "Diagnostico: Obesidade grau III (obesidade morbida) \nIMC: " + value + "kg/m²"; 
		}
		
	}
}

