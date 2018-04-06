package Food2Door;

public class OrderProcessor {

    public static final String EXTRA_FOOD_SHOP = "ExtraFoodShop";
    public static final String HEALTHY_FOOD = "HealthyFood";
    public static final String GLUTEN_FREE_SHOP = "GlutenFreeShop";

    public boolean order(final OrderRequest orderRequest){

        OrderProcess orderProcess = null;

        switch(orderRequest.getSupplier()){
            case EXTRA_FOOD_SHOP:
                System.out.println("ExtraFoodShop processing...");
                orderProcess = new ExtraFoodShopProcess();
                break;
            case HEALTHY_FOOD:
                System.out.println("HealthyFood processing...");
                orderProcess = new HealthyFoodProcess();
                break;
            case GLUTEN_FREE_SHOP:
                System.out.println("GlutenFreeShop processing...");
                orderProcess = new GlutenFreeShopProcess();
                break;
            default:
                System.out.println("Supplier is not supported!");
                return false;
        }

        return orderProcess.process(orderRequest);
    }
}
