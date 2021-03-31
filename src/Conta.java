
/**
 * 2. Princ�pio do Aberto/Fechado (OCP)
 * "Voc� deve ser capaz de estender o comportamento de uma classe, sem modific�-lo."
 * A interface n�o permite modifica��es
 * @author emersson
 *
 */
public interface Conta {
	public void validarUsuario(Usuario usuario);
	public void calcularGanhos();
	public void registrarConta();
}
