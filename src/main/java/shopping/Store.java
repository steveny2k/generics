package shopping;

public class Store {
    public static void main(String[] args) {
        ClothingPair<Glove> pg =
                new ClothingPair<>(new Glove(9, "Black"), new Glove(9, "Brown"));
        int size = pg.getLeft().getSize();

        System.out.println("Gloves match? " + pg.isMatched());

        Hat h = new Hat("Red");
        System.out.println("Hat matches gloves? " + pg.matches(h));

        System.out.println("items match? "
           + ClothingPair.match(new Glove(9, "Red"), new Glove(9, "Red"))); // inferencing
//         + ClothingPair.<Glove>match(new Glove(9, "Red"), new Glove(9, "Red"))); // explicit assignment to E
    }
}
