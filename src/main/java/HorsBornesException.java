/**
 * Exception personnalisée pour indiquer qu'un indice est hors des bornes de la grille.
 */
public class HorsBornesException extends RuntimeException {

    /**
     * Construit une nouvelle exception avec le message spécifié.
     *
     * @param message Le message détaillant la cause de l'exception.
     */
    public HorsBornesException(String message) {
        super(message);
    }
}
