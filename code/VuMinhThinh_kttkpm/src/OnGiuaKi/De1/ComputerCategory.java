package OnGiuaKi.De1;

import java.util.ArrayList;
import java.util.List;

public class ComputerCategory {
    private String categoryName;
    private List<Computer> computers;

    public ComputerCategory(String categoryName) {
        this.categoryName = categoryName;
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void display() {
        System.out.println("Category: " + categoryName);
        for (Computer computer : computers) {
            computer.display();
        }
    }
}
