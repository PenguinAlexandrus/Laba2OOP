import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;

public class Calc {
    private int allProfit = 0;
    private int check = 0, j = 0 , type = 0;
    private int allPrice = 0;
    private ArrayList<Integer> checkFirst = new ArrayList<>();
    private ArrayList<Integer> promoProfit = new ArrayList<>();
    public void Calculate(List operations,int start, int target){
        operations.forEach(new Consumer<Operation>() {
            @Override
            public void accept(Operation o) {
                if (o.getPrice()>0) {
                    if (!checkFirst.contains(o.getPrice())) {
                        allProfit += o.getProfit();
                    }
                    checkFirst.add(o.getPrice());
                    allProfit += o.getProfit();
                    allPrice += o.getPrice();
                } else {
                    allProfit += o.getProfit();
                    promoProfit.add(o.getProfit());
                }
            }
        });
        System.out.println("Полученное количество игровой валюты: "+allProfit);
        System.out.println("Потраченная реальная валюта: "+allPrice);
        System.out.println("Всего игровой валюты: "+(allProfit+start));
        System.out.println("Першагнул ли порог : "+((allProfit+start)>target?"Да":"Нет"));
        Collections.sort(checkFirst);
        check = (int) checkFirst.get(0);
        checkFirst.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                //System.out.println(i+" "+check);
                if (check != i){
                    System.out.println("Покупок типа " + type + ":"+j );
                    j = 1;
                    type++;
                    check = (int) checkFirst.get(checkFirst.lastIndexOf(check)+1);
                } else {
                    j++;
                }
            }
        });
        System.out.println("Покупок типа " + type + ":"+j );
        promoProfit.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println("Введен промокод на "+ i+ " примогемов!");
            }
        });
    }
//    public void sortDonate(List operations){
//        DataProcessor<Operation> dataProcessor = new DataProcessor<>();
//        dataProcessor.setList(operations);
//
//    }
}
