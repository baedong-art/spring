package hello.core.singleton;

public class StatefulService {


    public int order(String name, int price) {
        System.out.println("name  = "+ name + " price = " +price);
//        this.price =price;
        return price;


    }

//    public int getPrice() {
////        return price;
//    }

}
