package chapter_3;

public class PetrolPurchase {
    private String location;
    private String type;
    private int quantityPurchaseLitre;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String location, String type, int quantityPurchaseLitre, double pricePerLitre, double percentageDiscount) {
        this.location = location;
        this.type = type;
        this.quantityPurchaseLitre = quantityPurchaseLitre;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
    this.type = type;
    }
    public void setQuantityPurchaseLitre(int quantity) {
        quantityPurchaseLitre = quantity;
    }
    public void setPricePerLitre(double priceLitre){
        pricePerLitre = priceLitre;
    }
    public void setPercentageDiscount(double discount){
        percentageDiscount = discount;
    }
    public String getLocation(){
        return location;
    }
    public String getType(){
        return type;
    }
    public int getQualityPurchaseLitre(){
        return quantityPurchaseLitre;
    }
    public double getPricePerLitre(){
        return pricePerLitre;
    }
    public double getPercentageDiscount(){
        return percentageDiscount;
    }
    public double getPurchaseAmount(){
        double multiply =  quantityPurchaseLitre * pricePerLitre;
        double netAmount =  multiply - percentageDiscount;
        return netAmount;
    }
}