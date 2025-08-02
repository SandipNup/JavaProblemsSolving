


class ShoppingAddicted {
    public static int fetchBestPrice(String[] products){
        float realPrice = 399.99F;
        int price = (int) realPrice;
        return price;
    }

    public static float fetchBestPriceReal(String[] products){
        float realPrice = 399.99F;
        return realPrice;
    }

    public static  boolean debitCard(float amount){
        return true;
    }

    public static boolean debitCard(int amount){
        return true;
    }

    public static boolean purchaseCart(long customerId){
        int price = ShoppingAddicted.fetchBestPrice(new String[0]);
        boolean paid = ShoppingAddicted.debitCard(price);
        return paid;
    }

    //if you have used var keyword in purchaseCart method you would not have to change the code
    public static boolean purchaseCartReal(long customerId){
        var price = ShoppingAddicted.fetchBestPrice(new String[0]);
        var paid = ShoppingAddicted.debitCard(price);
        return paid;
    }
}

public class UsingVarAndImplicitTypeCastingToSustainCode {

}
