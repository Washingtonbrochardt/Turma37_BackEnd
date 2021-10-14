package app;

import entities.Funcionario;
import entities.Terceiro;

public class TesteSalario {
	public static void main(String[] args) {
		
		Funcionario func1=new Funcionario("Cleber","222");
		Terceiro ter1=new Terceiro("Carlos","323",200.00);
		
		func1.setHorasTrabalhadas(20);
		func1.setValorHora(25.00);
		
		ter1.setHorasTrabalhadas(20);
		ter1.setValorHora(25.00);
		
		System.out.println(" O salario de "+func1.getNome()+" � R$ "+func1.calculoSalario());
		System.out.println(" O salario de "+ter1.getNome()+" � R$ "+ter1.calculoSalario());
		
	}

}
