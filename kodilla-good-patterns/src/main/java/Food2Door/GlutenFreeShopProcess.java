package Food2Door;

public class GlutenFreeShopProcess implements OrderProcess{

    @Override
    public boolean process(OrderRequest orderRequest) {
        Integer total = orderRequest.getProduct().getPrice() * orderRequest.getQuantity();

        if(total >= 100){
            return true;
        }else{
            System.out.println("The minimum total order cost is 100");
            return false;
        }
    }
}
