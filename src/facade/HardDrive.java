package facade;

public class HardDrive {
	
	public void read(int startPosition, int size) {
		System.out.println("Lê dados do HD.");
	}
	
	public void write(int position, String info) {
		System.out.println("Escreve dados no HD.");
	}
}
