package facade;

public class Memoria {
	
	public void load(int position, String info) {
		System.out.println("Carregando dados na mem�ria.");
	}
	
	public void free(int position, String info) {
		System.out.println("Liberando dados na mem�ria.");
	}
}
