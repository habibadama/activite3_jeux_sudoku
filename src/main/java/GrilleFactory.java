/**
 * Interface de fabrique pour créer des instances de Grille.
 */
public interface GrilleFactory {

    /**
     * Construit une instance de Grille avec les éléments fournis et la configuration initiale de la grille.
     *
     * @param elementDeGrilles Un tableau d'éléments à utiliser dans la grille.
     * @param grille Un tableau 2D représentant l'état initial de la grille.
     * @return Une instance de Grille.
     * @throws ElementInterditException Si un élément n'est pas autorisé dans la grille.
     * @throws ValeurInitialeModificationException S'il y a une tentative de modification d'une valeur initiale.
     * @throws HorsBornesException Si un indice est hors des bornes.
     * @throws ValeurImpossibleException Si une valeur ne peut pas être placée dans la grille.
     */
    Grille buildGrille(ElementDeGrille[] elementDeGrilles,
                       ElementDeGrille[][] grille) throws
            ElementInterditException,
            ValeurInitialeModificationException,
            HorsBornesException,
            ValeurImpossibleException;
}
