
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int cost(int squares, int pricePerSquare) {
        return squares * pricePerSquare;
    }
    
    public int priceDifference(Apartment compared) {
        int priceDifference = cost(this.squares, this.princePerSquare) - cost(compared.squares, compared.princePerSquare);
        if (priceDifference < 0) {
            return priceDifference * -1;
        }
        return priceDifference;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (cost(this.squares, this.princePerSquare) > cost(compared.squares, compared.princePerSquare)) {
            return true;
        }
        return false;
    }
}
