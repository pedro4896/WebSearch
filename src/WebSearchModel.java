package src;

import java.io.*;
import java.util.*;

/**
 * Modelo de busca.
 * Agora funciona em conjunto com Strategies (filtros),
 * notificando observadores apenas quando o filtro retornar true.
 *
 * >> - Criação de ObserverEntry
 * >> - Registro de observador junto com filtro
 * >> - Notificação apenas se filtro aprovar"
 */
public class WebSearchModel {

    // Classe interna para associar observador + filtro
    private static class ObserverEntry {
        QueryObserver observer;
        QueryFilter filter;

        ObserverEntry(QueryObserver observer, QueryFilter filter) {
            this.observer = observer;
            this.filter = filter;
        }
    }

    private final List<ObserverEntry> observers = new ArrayList<>();

    /**
     * Registra um observador junto com sua estratégia de filtro.
     */
    public void addObserver(QueryObserver observer, QueryFilter filter) {
        observers.add(new ObserverEntry(observer, filter));
    }

    /**
     * Lê arquivo linha a linha e processa as consultas.
     */
    public void readQueries(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                processQuery(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Notifica apenas os observadores cujos filtros considerarem a consulta interessante.
     */
    private void processQuery(String query) {
        for (ObserverEntry entry : observers) {
            if (entry.filter.isInteresting(query)) {
                entry.observer.handleQuery(query);
            }
        }
    }
}
