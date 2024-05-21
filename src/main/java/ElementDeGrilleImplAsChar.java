
public class ElementDeGrilleImplAsChar implements ElementDeGrille {
    private char value;

    public ElementDeGrilleImplAsChar(char value) {
        this.value = value;
    }

    @Override
    public char getValue() {
        return value;
    }
}
