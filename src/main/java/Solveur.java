/**
 * Interface de résolveur de Grille
 *
 */
public interface Solveur {
    /**
     * Résout une Grille
     *
     * @param grille Grille à résoudre
     * @return true si la grille a été résolue
     */
    boolean solve(Grille grille) throws SolveurException;
}
