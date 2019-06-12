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

    public <F extends Colored> boolean matches(F c) {
        return c.getColor().equals(getLeft().getColor());
    }

    public static <E extends Sized & Colored> boolean match(E left, E right) {
        return left.getColor().equals(right.getColor()) &&
                left.getSize() == right.getSize();
    }

}
