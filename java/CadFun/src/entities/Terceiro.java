package entities;

public class Terceiro extends Funcionario {
	
	private double adicional;

	public Terceiro(String nome, String matricula,double adicional) {
		super(nome, matricula);
		this.adicional=adicional;

		
		// TODO Auto-generated constructor stub
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	
	public double calculoSalario(){
		
		// se horasTrabalhadas e valorHora fossem protect:
		  // return (this.horasTrabalhadas*this.valorHora)+this.adicional
		// poderia ser tambem (get.HorasTrabalhadas()*getValorHora())+getAdicional()
		// ou eu poderia criar uma variavel salario= ((super.getHorasTrabalhadas()*super.getValorHora())+this.adicional) e retornar salario
		return ((super.getHorasTrabalhadas()*super.getValorHora())+this.adicional);
	}
	

}
