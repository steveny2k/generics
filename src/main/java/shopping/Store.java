package shopping;

public class Store {
    public static void main(String[] args) {
        ClothingPair<Glove> pg =
                new ClothingPair<>(new Glove(9, "Black"), new Glove(9, "Brown"));
        int size = pg.getLeft().getSize();

        System.out.println("Gloves match? " + pg.isMatched());
    }
}
