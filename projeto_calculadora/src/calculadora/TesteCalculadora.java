package calculadora;

/**
 * <p><strong>Classe de Testes da Calculadora</strong></p>
 *
 * <p>Esta classe contém o método principal responsável por demonstrar o uso
 * da classe {@link Calculadora} e validar o funcionamento de suas operações
 * matemáticas.</p>
 *
 * <p>O objetivo desta classe é:</p>
 * <ul>
 *     <li>Exemplificar chamadas ao método {@code calcular()}</li>
 *     <li>Exibir os resultados das operações básicas na saída padrão</li>
 *     <li>Testar o tratamento de exceções para:</li>
 *     <ul>
 *         <li>Divisão por zero</li>
 *         <li>Operador inválido</li>
 *     </ul>
 * </ul>
 *
 * <p>Esta classe é utilizada apenas para fins de demonstração e validação,
 * não fazendo parte da lógica principal da calculadora.</p>
 *
 * @author Breno Almeida
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * <p>Método principal responsável por executar exemplos de uso da classe
     * {@link Calculadora} e exibir os resultados no console.</p>
     *
     * <p>Também demonstra o tratamento de exceções lançadas quando:</p>
     * <ul>
     *     <li>Uma divisão por zero é solicitada</li>
     *     <li>Um operador inválido é informado</li>
     * </ul>
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
