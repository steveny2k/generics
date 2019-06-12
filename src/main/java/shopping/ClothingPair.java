package shopping;

//public class ClothingPair<E extends Sized & Colored /*, String*/> extends Pair<E> {
////    private java.lang.String s = "Hello";

public class ClothingPair<E extends Sized & Colored /*, String*/> extends Pair<E> {
    public ClothingPair(E left, E right) {
        super(left, right);
    }

    public boolean isMatched() {
        E left = super.getLeft();
        E right = super.getRight();
        return left.getSize() == right.getSize()
                && left.getColor() == right.getColor();
    }
}
