import java.util.HashMap;

public class enums {
    enum coffeeType{
        AMERICANO,
        CAFE_LATTE,
        ESPRESSO
    };

    static void printCoffeePrice(coffeeType type) {
        HashMap<coffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(coffeeType.AMERICANO, 3000);  // 1: 아메리카노
        priceMap.put(coffeeType.CAFE_LATTE, 4000);  // 2: 카페라떼
        priceMap.put(coffeeType.ESPRESSO, 5000);  // 3: 에스프레소
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public static void main(String[] args) {
        printCoffeePrice(coffeeType.AMERICANO);  // "가격은 3000원 입니다." 출력
        //printCoffeePrice(99);  // NullPointerException 발생
    }
}