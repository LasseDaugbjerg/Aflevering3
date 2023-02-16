public class Square implements Comparable<Square> {
    private int width;
    private int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public int compareTo(Square other) {
        return Integer.compare(this.getPerimeter(), other.getPerimeter());
    }
}
