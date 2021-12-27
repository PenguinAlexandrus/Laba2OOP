import java.util.List;
import java.util.stream.Collectors;

public class DataProcessor<T extends Operation> {
    private List<T> list;
    private int max;
    private int min;
    private int listSize;

    public DataProcessor(int max, int min, int listSize) throws MyException {
        if(max < 0 || min < 0 || listSize < 1){
            throw new MyException("FATAL ERROR TRY TO LEARN MATH");
        }
        this.max = max;
        this.min = min;
        this.listSize = listSize;
    }

    public List<T> sortList(List<T> operationList){

        return operationList.stream()
                .filter(item ->(item.getProfit()>min && item.getProfit() < max))
                .limit(listSize)
                .collect(Collectors.toList());
    }
    public List<T> searchElem(List<T> operationList, int target){
        return operationList
                .stream()
                .filter(item ->(item.getProfit() == target))
                .collect(Collectors.toList());
    }
}
