package Food2Door;

public class ExtraFoodShopProcess implements OrderProcess {

    @Override
    public boolean process(OrderRequest orderRequest) {

        if(orderRequest.getQuantity() >= 80){
            return true;
        }else{
            System.out.println("Too small amount of ordered goods");
            return false;
        }

    }
}
