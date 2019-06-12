package shopping;

public class Hat implements Colored {
    private String color;

    public Hat(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Hat{" +
                "color='" + color + '\'' +
                '}';
    }
}
