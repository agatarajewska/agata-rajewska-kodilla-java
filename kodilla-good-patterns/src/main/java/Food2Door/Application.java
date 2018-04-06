package Food2Door;

public class Application {

    public static void main(String[] args){

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor();
        if(orderProcessor.order(orderRequest)){
            System.out.println("Order placed");
        }else {
            System.out.println("Something went wrong");
        }

    }
}
