
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int price;


    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){
        if(this.squareMeters>=otherApartment.squareMeters) {
            return true;
        }else
        return false;
    }

    public int priceDifference(Apartment otherApartment){
        this.price=(this.squareMeters * this.pricePerSquareMeter);
        otherApartment.price=(otherApartment.pricePerSquareMeter*otherApartment.squareMeters);
        if(this.price>otherApartment.price){
            return this.squareMeters * this.pricePerSquareMeter-otherApartment.pricePerSquareMeter*otherApartment.squareMeters;
        } else
        return otherApartment.pricePerSquareMeter*otherApartment.squareMeters-this.squareMeters * this.pricePerSquareMeter;
    }
    public boolean moreExpensiveThan(Apartment otherApartment){
        this.price=(this.squareMeters * this.pricePerSquareMeter);
        otherApartment.price=(otherApartment.pricePerSquareMeter*otherApartment.squareMeters);
        if(this.price>=otherApartment.price){
            return true;
        } else
            return false;

    }
}
