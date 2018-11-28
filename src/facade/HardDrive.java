package facade;

public class HardDrive {
	
	public String read(int startPosition, int size) {
		return "Lê dados do HD.";
	}
	
	public void write(int position, String info) {
		System.out.println("Escreve dados no HD.");
	}
}
