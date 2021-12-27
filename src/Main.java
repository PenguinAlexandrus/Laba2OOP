import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //типо ввод
        List<Operation> operations = new ArrayList<>();
        DefaultData defaultData = new DefaultData();
        List<User> usersActions = defaultData.getUsersActionsList();
        List<Action> actions = new ArrayList<>();
        actions.addAll(operations);
        actions.addAll(usersActions);
                defaultData.setDefaultOperations();
        operations = defaultData.getDefaultOperationList();
        //типо конец ввода
        Calc calc = new Calc();
        calc.Calculate(operations,3154,38000);
        actions.addAll(operations);
        actions.addAll(usersActions);
        actions.forEach(new Consumer<Action>() {
            @Override
            public void accept(Action action) {
                action.info();
            }
        });

        try {
            DataProcessor<Operation> dataProcessor = new DataProcessor<>(-1, 500, 2);
            dataProcessor.sortList(operations);
            dataProcessor.searchElem(operations,60 );
        } catch (MyException e){
            System.out.println(e.getFatalERROR());
        }
    }
}
