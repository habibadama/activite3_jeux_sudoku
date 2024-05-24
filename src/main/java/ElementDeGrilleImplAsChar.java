/**
 * Implémentation de l'interface ElementDeGrille utilisant un caractère comme valeur.
 */
public class ElementDeGrilleImplAsChar implements ElementDeGrille {

    /**
     * La valeur de l'élément de grille.
     */
    private final char value;

    /**
     * Constructeur prenant en paramètre la valeur de l'élément de grille.
     * @param value la valeur de l'élément de grille.
     */
    public ElementDeGrilleImplAsChar(final char value) {
        this.value = value;
    }

    /**
     * Renvoie la valeur de l'élément de grille.
     * @return la valeur de l'élément de grille.
     */
    @Override
    public char getValue() {
        return value;
    }
}
