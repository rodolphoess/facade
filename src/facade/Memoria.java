package facade;

public class Memoria {
	
	public void load(int position, String info) {
		System.out.println("Carregando dados na memória.");
	}
	
	public void free(int position, String info) {
		System.out.println("Liberando dados na memória.");
	}
}
