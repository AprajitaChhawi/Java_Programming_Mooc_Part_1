
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public int getRoom(){
        return this.rooms;
    }
    public int getSquare(){
        return this.squares;
    }
    public int getPricePerSquare(){
        return this.princePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        int ownRoom = this.getRoom();
        int comparedRoom = compared.getRoom();

        if (ownRoom > comparedRoom) {
            return true;
        }

        if (ownRoom < comparedRoom) {
            return false;
        }

        // 2. Same birthyear, compare months
        int ownSquares = this.getSquare();
        int comparedSquare = compared.getSquare();

        if (ownSquares > comparedSquare) {
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared){
        int ownprice = this.getSquare()*this.getPricePerSquare();
        int comparedprice = compared.getSquare()*compared.getPricePerSquare();
        return Math.abs(ownprice-comparedprice);
    }
    public boolean moreExpensiveThan(Apartment compared){
        int ownprice = this.getSquare()*this.getPricePerSquare();
        int comparedprice = compared.getSquare()*compared.getPricePerSquare();
        if(ownprice>comparedprice){
            return true;
        }
        return false;
    }

}
