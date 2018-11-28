package facade;

/*
 * Classe de facha que fará a incialização de todas as classes do subsistema, evitando de fazer todas essas chamdas
 * em uma classe cliente.
 */
public class ComputadorFacade {
	private CPU cpu = null;
	private Memoria memoria = null;
	private HardDrive hd = null;
	
	public ComputadorFacade(CPU cpu, Memoria memoria, HardDrive hd) {
		this.cpu = cpu;
		this.memoria = memoria;
		this.hd = hd;
	}
	
	public void ligarComputador() {
		cpu.start();
		String hdBootInfo = hd.read(1, 1);
		System.out.println(hdBootInfo);
		memoria.load(1, "ok");
		cpu.execute();
		memoria.free(1, "ok");
	}
}
