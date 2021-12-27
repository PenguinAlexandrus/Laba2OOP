public class User implements Action {
    private int ID;
    private String name;

    @Override
    public void info() {
        System.out.println("Игрок "+name+" подключился к серверу №"+ID);
    }
    public User(int ID, String name){
        this.ID = ID;
        this.name = name;
    }
}
