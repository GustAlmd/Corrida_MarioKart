/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CorridaMarioKart;

public class App {
    
    public static void main(String[] args) {
    	Equipe equipeMario = new Equipe();
    	equipeMario.v1 = new Veiculo(new MotorMario());
    	equipeMario.p1 = new Piloto ("Mario Bross", 1.50, "Arremessar Cogumelos");
    	equipeMario.mecanicos.add(new Mecanico());
    	equipeMario.mecanicos.add(new Mecanico());
    	System.out.println(equipeMario.v1.acelerar(5));
        new Pessoa();
    	new Piloto("Mario Bross", 1.50, "Arremessar Cogumelos");
    	MotorMario mMario = new MotorMario();
    	new Veiculo(mMario);

    	Equipe equipeLuigi = new Equipe();
    	equipeLuigi.v1 = new Veiculo(new MotorLuigi());
    	equipeLuigi.p1 = new Piloto ("Luigi Bross", 1.40, "Invisivel por Segundos");
    	equipeLuigi.mecanicos.add(new Mecanico());
    	equipeLuigi.mecanicos.add(new Mecanico());
    	System.out.println(equipeLuigi.v1.acelerar(5));
        new Pessoa();
    	new Piloto("Luigi Bross", 1.40, "Invisivel por Segundos");
    	MotorLuigi mLuigi = new MotorLuigi();
    	new Veiculo(mLuigi);
    }
}
