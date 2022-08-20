package CorridaMarioKart;

public class Veiculo {
	
	IMotor motor;
	
	public Veiculo(IMotor m) {
		this.motor = m;
	}
	public String acelerar(int intensidade) {
		return this.motor.acelerar(intensidade);
	}

}
