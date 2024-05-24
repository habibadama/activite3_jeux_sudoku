import java.util.Arrays;

/**
 * Implémentation de l'interface Grille.
*/
public class GrilleImpl implements Grille {
       /**
        * Représentation de la grille de jeu sous forme d'un tableau bidimensionnel d'éléments de grille.
        */
    private ElementDeGrille[][] grille;

       /**
        * Constructeur de la classe GrilleImpl.
        *
        * @param grille le tableau représentant la grille de jeu.
        * @throws NullPointerException si le tableau grille est null.
        */

       public GrilleImpl(ElementDeGrille[][] grille) {
        // Copie du tableau passé en argument pour
        // éviter la modification externe
        this.grille = Arrays.stream(grille)
                            .map(ElementDeGrille[]::clone)
                            .toArray(ElementDeGrille[][]::new);
    }

    @Override
    public ElementDeGrille getValue(int x, int y) throws HorsBornesException {
        // Implémentation de la méthode getValue
        if (x < 0 || x >= grille.length || y < 0 || y >= grille[0].length) {
            throw new HorsBornesException("Position hors limites de la grille");
        }
        return grille[x][y];
    }

    @Override
    public void setValue(int x, int y, ElementDeGrille element) throws HorsBornesException,
     ValeurImpossibleException,
     ElementInterditException,
     ValeurInitialeModificationException {
        // Implémentation de la méthode setValue
        if (x < 0 || x >= grille.length || y < 0 || y >= grille[0].length) {
            throw new HorsBornesException("Position hors limites de la grille");
        }
        grille[x][y] = element;
    }
}
