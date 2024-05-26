/**
 * Exception personnalisée pour indiquer des erreurs lors de la résolution d'une grille de Sudoku.
 */
public class SolveurException extends RuntimeException {

    /**
     * Construit une nouvelle exception avec le message spécifié.
     *
     * @param message Le message détaillant la cause de l'exception.
     */
    public SolveurException(String message) {
        super(message);
    }

    /**
     * Construit une nouvelle exception avec le message spécifié et la cause.
     *
     * @param message Le message détaillant la cause de l'exception.
     * @param cause La cause (qui est sauvegardée pour une récupération ultérieure par la méthode {@link Throwable#getCause()}).
     */
    public SolveurException(String message, Throwable cause) {
        super(message, cause);
    }
}
