import sprint.CypherTool;
import sprint.CypherUI;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса CypherTool, который реализует интерфейс CypherUI
        CypherUI tool = new CypherTool();

        // Вызываем методы интерфейса
        tool.welcomeMessege();
        tool.selectOperation();
        tool.selectCypher();
        tool.processMessage();
    }
}
