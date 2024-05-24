/**
 * ValeurImpossibleException.
 *
 * Cette exception est levée lorsqu'une valeur
 * donnée est impossible dans le contexte actuel.
 */
public class ValeurImpossibleException extends RuntimeException {

    public ValeurImpossibleException(String message) {
        super(message);
    }

}
