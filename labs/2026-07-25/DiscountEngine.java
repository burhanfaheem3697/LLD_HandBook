/**
 * DiscountEngine
 */
public class DiscountEngine {

    public double calculateDiscount(double orderTotal,String tier){
        if(tier == null || tier.trim().isEmpty()){
            throw new IllegalArgumentException("Tier can't be null or empty");
        }
        if(orderTotal < 0){
            throw new IllegalArgumentException("OrderTotal can't be negative");
        }

        String normalizeTier = tier.trim().toUpperCase();
        if(normalizeTier.equals("STANDARD")){
            if(orderTotal < 100){
                return 0.0;
            } else{
                return 0.05 * orderTotal;
            }
        } else if(normalizeTier.equals("VIP")){
            if(orderTotal < 100){
                return 0.1 * orderTotal;
            } else {
                return 0.2 * orderTotal;
            }
        } else {
            throw new IllegalArgumentException("Tier is unknown");
        }


    }
}