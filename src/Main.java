package src;

/**
 * Cliente do sistema.
 * Registra dois Snoopers com filtros diferentes:
 *  - FriendFilter -> imprime "Oh Yes!"
 *  - LongQueryFilter -> imprime "So long"
 */
public class Main {
    public static void main(String[] args) {
        WebSearchModel model = new WebSearchModel();

        // Observador que reage a consultas com "friend"
        Snooper friendSnooper = new Snooper("Oh Yes!");
        model.addObserver(friendSnooper, new FriendFilter());

        // Observador que reage a consultas longas (>60 caracteres)
        Snooper longSnooper = new Snooper("So long");
        model.addObserver(longSnooper, new LongQueryFilter());

        // Lê Hamlet.txt simulando as consultas
        model.readQueries("data/Hamlet.txt");
    }
}
