package facade;

public class CPU {
	
	public void start() {
		System.out.println("Inicializa��o inicial.");
	}
	
	public void execute() {
		System.out.println("Executando algo no processador.");
	}
	
	public void load() {
		System.out.println("Carrega registrador.");
	}
	
	public void free() {
		System.out.println("Libera registradores.");
	}
}
