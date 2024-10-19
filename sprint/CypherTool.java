package sprint;

import java.util.Scanner;
import sprint.AtBashTool;




public class CypherTool implements CypherUI {
    private int operation;
    private int cypher;

    @Override
    public void selectOperation() {

        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while(!validInput){
            try {
                System.out.println("Select operation:\n" + "1. Encrypt\n" + "2. Decrypt");
                operation = scanner.nextInt();
                if(operation == 1 || operation == 2){
                    validInput = true;
                }
                else{
                    System.out.println("Invalid input. Please enter a number (1 or 2).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
            }
        }



        // Вывести меню с вариантами выбора (шифрование или дешифровка).
        // Получить ввод от пользователя и проверить корректность (чтобы оно было 1 или 2).
        // Если ввод некорректный, продолжать запрос до получения корректного ввода.
        // Сохранить ввод в переменную "operation".
    }

    public int getOperation() {
        return operation; // Метод для получения выбора пользователя
    }



    // Остальные методы интерфейса
    @Override
    public void selectCypher() {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while(!validInput){
            try {
                System.out.println("Select cypher:\n" + "1. ROT13\n" + "2. AtBash" + "3. ");
                cypher = scanner.nextInt();
                if(cypher == 1 || cypher == 2){
                    validInput = true;
                }
                else{
                    System.out.println("Invalid input. Please enter a number (1 or 2 or 3).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1 or 2 or 3).");
            }
        }
    }

    public int getCypher(){
        return cypher;
    }

    @Override
    public void processMessage() {
        Scanner scanner = new Scanner(System.in);   
        boolean validInput = false;
        String message = new String();
        AtBashTool atBashTool = new AtBashTool();
        while (!validInput) {
            System.out.println("Enter the message:");
            message = scanner.nextLine();
            
            if (message == null || message.trim().isEmpty()) {
                System.out.println("Invalid input. Please enter the message correctly.");
            } else {
                validInput = true; 
            }
        }
        if(operation == 1 && cypher == 1){        //atBashTool
            message = AtBashTool.
            System.out.println(message);
        }
        else if(operation == 2 && cypher == 1){     //ROT13

        }
        else if(operation == 1 && operation == 2){           //our

        }
        else if(){

        }


        // Просить ввести сообщение. 
        // Получить сообщение и выполнить необходимую операцию (шифрование или дешифровку) на основании ранее сделанного выбора.
    }
}