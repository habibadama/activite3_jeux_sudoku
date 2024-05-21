public class GrilleImpl implements Grille {
    
    private ElementDeGrille[][] grille;

    public GrilleImpl(ElementDeGrille[][] grille) {
        this.grille = grille;
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
    public void setValue(int x, int y, ElementDeGrille element) throws HorsBornesException, ValeurImpossibleException, ElementInterditException, ValeurInitialeModificationException {
        // Implémentation de la méthode setValue
        if (x < 0 || x >= grille.length || y < 0 || y >= grille[0].length) {
            throw new HorsBornesException("Position hors limites de la grille");
        }
        // Vous pouvez ajouter la logique pour vérifier les autres exceptions ici
        grille[x][y] = element;
    }
}
