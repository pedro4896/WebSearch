package src;

/**
 * Snooper: Observador concreto.
 * Agora só cuida de "como imprimir".
 * "Quando imprimir" é responsabilidade da Strategy (filtro).
 *
 * - Snooper agora recebe prefixo no construtor
 * - Impressão delegada pelo filtro (Strategy)"
 */
public class Snooper implements QueryObserver {
    private final String prefix;

    public Snooper(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public void handleQuery(String query) {
        System.out.println(prefix + " " + query);
    }
}
