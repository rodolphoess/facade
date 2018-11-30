package facade;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ClasseCliente {
	private ComputadorFacade computador;
	private CPU cpu = null;
	private Memoria memoria = null;
	private HardDrive hd = null;

	@Before
	public void setUp() {
		cpu = new CPU();
		memoria = new Memoria();
		hd = new HardDrive();
		computador = new ComputadorFacade(cpu, memoria, hd);
	}
	
	@Test
	public void test_ligar_computador() {
		computador.ligarComputador();
	}
}
