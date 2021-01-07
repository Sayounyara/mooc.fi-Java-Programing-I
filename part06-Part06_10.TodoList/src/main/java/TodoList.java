import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList() {
        this.tasks = new ArrayList<>();
    }
    
    public void add(String task) {
        tasks.add(task);
    }
    
    public void remove(int number) {
        number--;
        tasks.remove(number);
    }
    
    public void print() {
        int index = 0;
        int task = 1;
        while (index < tasks.size()) {
            System.out.println(task + ": " + tasks.get(index));
            index++;
            task++;
        }
    }
}
