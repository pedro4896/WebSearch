package src;

/**
 * Interface Observer: qualquer objeto que queira
 * ser notificado sobre consultas deve implementar este contrato.
 */
public interface QueryObserver {
    void handleQuery(String query);
}
