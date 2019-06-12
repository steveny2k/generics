package shopping;

import java.util.function.BiPredicate;

public class MatchablePair<E> {
    private E left;
    private E right;
    private BiPredicate<E, E> matchCriterion;

    public MatchablePair(E left, E right, BiPredicate<E, E> matchCriterion) {
        this.left = left;
        this.right = right;
        this.matchCriterion = matchCriterion;
    }

    public E getLeft() {
        return left;
    }

    public void setLeft(E left) {
        this.left = left;
    }

    public E getRight() {
        return right;
    }

    public void setRight(E right) {
        this.right = right;
    }

    public void setMatchCriterion(BiPredicate<E, E> newMatchCriterion) {
        matchCriterion = newMatchCriterion;
    }

    public boolean isMatched() {
        return matchCriterion.test(left, right);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
