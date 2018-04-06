package Food2Door;

public class HealthyFoodProcess implements OrderProcess {

    @Override
    public boolean process(OrderRequest orderRequest) {

        if(orderRequest.getQuantity()%20==0){
            return true;
        }else{
            System.out.println("Orders are only available in packs of 20 pieces");
            return false;
        }
    }
}
