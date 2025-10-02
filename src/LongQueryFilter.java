package src;

/**
 * Strategy concreta.
 * Define que uma consulta é interessante
 * se tiver mais de 60 caracteres.
 */
public class LongQueryFilter implements QueryFilter {
    @Override
    public boolean isInteresting(String query) {
        return query.length() > 60;
    }
}
