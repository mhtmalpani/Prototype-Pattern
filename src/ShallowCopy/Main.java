package ShallowCopy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String sql = "Select * from movies Where title = ?";

        List<String> parameters = new ArrayList<>();
        parameters.add("Star Wars");

        Record record = new Record();

        Statement statement1 = new Statement(sql, parameters, record);

        System.out.println(statement1.getSql());
        System.out.println(statement1.getParameters());
        System.out.println(statement1.getRecord());

        Statement statement2 = statement1.clone();

        System.out.println(statement2.getSql());
        System.out.println(statement2.getParameters());
        System.out.println(statement2.getRecord());
    }
}
