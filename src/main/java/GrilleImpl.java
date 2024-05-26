import java.util.Arrays;

/**
 * Implémentation de l'interface Grille.
 */
public class GrilleImpl implements Grille {
    /**
     * Représentation de la grille de jeu sous forme d'un tableau bidimensionnel d'éléments de grille.
     */
    private final ElementDeGrille[][] grille;

    @Override
    public int getDimension() {
        return grille.length; // Ou toute autre logique pour obtenir la dimension de la grille
    }

    /**
     * Constructeur de la classe GrilleImpl.
     *
     * @param grille le tableau représentant la grille de jeu.
     * @throws NullPointerException si le tableau grille est null.
     */
    public GrilleImpl(ElementDeGrille[][] grille) {
        if (grille == null) {
            throw new NullPointerException("Le tableau grille ne peut pas être null");
        }
        this.grille = Arrays.stream(grille)
                            .map(ElementDeGrille[]::clone)
                            .toArray(ElementDeGrille[][]::new);
    }

    @Override
    public ElementDeGrille getValue(int x, int y) throws HorsBornesException {
        if (x < 0 || x >= grille.length || y < 0 || y >= grille[0].length) {
            throw new HorsBornesException("Position hors limites de la grille");
        }
        return grille[x][y];
    }

    @Override
    public void setValue(int x, int y, ElementDeGrille element) throws HorsBornesException,
            ValeurImpossibleException, ElementInterditException, ValeurInitialeModificationException {
        if (x < 0 || x >= grille.length || y < 0 || y >= grille[0].length) {
            throw new HorsBornesException("Position hors limites de la grille");
        }

        // Supposons que nous avons une méthode pour vérifier les valeurs initiales
        if (isInitialValue(x, y)) {
            throw new ValeurInitialeModificationException("Tentative de modification d'une valeur initiale");
        }

        // Supposons que nous avons une méthode pour vérifier si une valeur est possible
        if (!isPossibleValue(element)) {
            throw new ValeurImpossibleException("Valeur impossible à cette position");
        }

        // Supposons que nous avons une méthode pour vérifier les éléments interdits
        if (isForbiddenElement(element)) {
            throw new ElementInterditException("Cet élément est interdit");
        }

        grille[x][y] = element;
    }

    // Méthodes de vérification fictives pour illustration
    private boolean isInitialValue(int x, int y) {
        // Logique pour déterminer si la valeur est initiale
        return false;
    }

    private boolean isPossibleValue(ElementDeGrille element) {
        // Logique pour vérifier si la valeur est possible
        return true;
    }

    private boolean isForbiddenElement(ElementDeGrille element) {
        // Logique pour vérifier si l'élément est interdit
        return false;
    }
}
