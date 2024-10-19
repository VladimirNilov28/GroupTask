package sprint;

public interface CypherUI{
    
    default void welcomeMessege(){
        System.out.println("\nWelcome to the Cypher Tool\n");
    }

    void selectOperation();   // Выбор операции

    void selectCypher();      // Выбор типа шифрования
    
    void processMessage();    // Обработка сообщения



}

