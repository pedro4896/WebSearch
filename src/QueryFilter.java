package src;

/**
 * Interface do padrão Strategy.
 * Cada filtro é uma "estratégia" que decide
 * se uma consulta é interessante ou não.
 */
public interface QueryFilter {
    boolean isInteresting(String query);
}
