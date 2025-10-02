package src;

/**
 * Strategy concreta.
 * Define que uma consulta é interessante
 * se contiver a palavra "friend" (sem diferenciar maiúsculas).
 */
public class FriendFilter implements QueryFilter {
    @Override
    public boolean isInteresting(String query) {
        return query.toLowerCase().contains("friend");
    }
}
