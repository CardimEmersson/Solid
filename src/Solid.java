
public class Solid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario u1 = new Usuario();
		
		FactoryConta factoryConta = new FactoryConta();
		
		u1.abrirConta(factoryConta.criarConta("corrente"));
		u1.abrirConta(factoryConta.criarConta("empresarial"));
		u1.abrirConta(factoryConta.criarConta("poupanca"));
		
	
	}

}
