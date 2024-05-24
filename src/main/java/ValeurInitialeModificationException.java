/**
 * ValeurInitialeModificationException.
 *
 * Cette exception est levée lorsqu'une tentative de modification d'une valeur initiale est effectuée.
 */
public class ValeurInitialeModificationException extends RuntimeException {

    /**
     * Construit une nouvelle exception
     * ValeurInitialeModificationException
     * avec le message détaillé spécifié.
     *
     * @param message le message détaillé.
     */
    public ValeurInitialeModificationException(final String message) {
        super(message);
    }

}
