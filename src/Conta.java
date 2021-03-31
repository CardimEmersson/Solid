
/**
 * 2. Princípio do Aberto/Fechado (OCP)
 * "Você deve ser capaz de estender o comportamento de uma classe, sem modificá-lo."
 * A interface não permite modificações
 * @author emersson
 *
 */
public interface Conta {
	public void validarUsuario(Usuario usuario);
	public void calcularGanhos();
	public void registrarConta();
}
