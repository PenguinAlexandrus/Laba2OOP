import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultData {
    List<Operation> defaultOperationList = new ArrayList<>();
    List<User> usersActionsList = new ArrayList<>();
    public List<User> getUsersActionsList(){
        User user1 = new User(1, "Эль-Примо");
        User user2 = new User(2, "Милашка пудж");
        usersActionsList.add(user1);
        usersActionsList.add(user2);
        return usersActionsList;
    }
    public void setDefaultOperations() {
        int[] price = { 99, 449, 1390, 2790, 4690, 9490 };
        int[] profit = { 60, 300, 980, 1980, 3280, 6480 };
        int[] operations = { 0, 1, 5, 5, 5, 4, 2, 1, 1, 0, 4 };
        for (int i = 0; i<operations.length; i++){
            Operation operation = new Donate();

            operation.setPrice(price[operations[i]]);
            operation.setProfit(profit[operations[i]]);
            defaultOperationList.add(operation);
        }
        Operation operation = new Promo();
        operation.setProfit(100);
        defaultOperationList.add(operation);
    }

    public List getDefaultOperationList() {
        return defaultOperationList;
    }
}
