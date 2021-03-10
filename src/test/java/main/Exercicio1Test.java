/**		boolean validaMes(int mes)
{
if(mes <=0 || mes > 12){
	return false;
}else{
	return true;
}
**/

package main;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Exercicio1Test {

	@Test
	public void ValidaMesTest1() {				
		ValidaMes objExerc = new ValidaMes();		
			int entradaUser = 1;
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaMes(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	
	@Test
	public void ValidaMesTest2() {				
		ValidaMes objExerc = new ValidaMes();		
			int entradaUser = 13;
			boolean resultadoesperado = false;
			boolean resultadoPrograma = objExerc.validaMes(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void ValidaMesTest3() {				
		ValidaMes objExerc = new ValidaMes();		
			int entradaUser = 0;
			boolean resultadoesperado = false;
			boolean resultadoPrograma = objExerc.validaMes(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void ValidaMesTest4() {				
		ValidaMes objExerc = new ValidaMes();		
			int entradaUser = 1;
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaMes(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
	@Test
	public void ValidaMesTest5() {				
		ValidaMes objExerc = new ValidaMes();		
			int entradaUser = 11;
			boolean resultadoesperado = true;
			boolean resultadoPrograma = objExerc.validaMes(entradaUser);
			Assert.assertEquals(resultadoesperado, resultadoPrograma);
		}
}