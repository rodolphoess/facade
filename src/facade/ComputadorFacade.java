package facade;

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
