package sprint;

import java.util.Scanner;




public class CypherTool implements CypherUI {
    private int operation;
    private int cypher;
    String message;
    Scanner scanner = new Scanner(System.in);
    AtBashTool atBashTool = new AtBashTool();
    CaesarTool caesarTool = new CaesarTool();
    Rot13Tool rot13Tool = new Rot13Tool();



    @Override
    public void selectOperation() {

        boolean validInput = false;
        while(!validInput){
            try {
                System.out.println("""
                                   \nSelect operation:
                                   1. Encrypt
                                   2. Decrypt""");
                operation = scanner.nextInt();
                if(operation == 1 || operation == 2){
                    validInput = true;
                }
                else{
                    System.out.println("\nInvalid input. Please enter a number (1 or 2).");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input. Please enter a number (1 or 2).");
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
        boolean validInput = false;
        while(!validInput){
            try {
                System.out.println("""
                                   \nSelect cypher:
                                   1. ROT13
                                   2. AtBash3.
                                   3. CAESAR 
                                   """);
                cypher = scanner.nextInt();
                if(cypher == 1 || cypher == 2 || cypher == 3){
                    validInput = true;
                }
                else{
                    System.out.println("\nInvalid input. Please enter a number (1 or 2 or 3).");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input. Please enter a number (1 or 2 or 3).");
            }
        }
    }

    public int getCypher(){
        return cypher;
    }

    @Override
    public void processMessage() {
        boolean validInput = false;
        
        while (!validInput) {
            System.out.println("\nEnter the message:");
            message = scanner.nextLine();
            
            if (message == null || message.trim().isEmpty() || message.matches("\\d+")) {
                System.out.println("\nInvalid input. Please enter the message correctly.");
            } else {
                validInput = true; 
            }
        }


        if(cypher == 1){
            if (operation == 1) {
                message = Rot13Tool.encryptRot13(message.trim());
                System.out.println("\nEncrypted message (ROT13):\n" + message);
            }

            else{
                message = Rot13Tool.decrypRot13(message.trim());
                System.out.println("\nDecrypted message (ROT13):\n" + message);
            }
        }

        else if(cypher == 2){
            if (operation == 1) {
                message = AtBashTool.encryptAtbash(message.trim());
                System.out.println("\nEncrypted message (ATBASH):\n" + message);
            }

            else{
                message = AtBashTool.decryptAtbash(message.trim());
                System.out.println("\nDecrypted message (ATBASH):\n" + message);
            }

        }

        else {
            int shift = 0;
            boolean validShiftInput = false;
            while(!validShiftInput){
                try {
                    System.out.println("\nPlease, enter shift for CAESAR (use numbers 1 - 30):\n");
                    shift = scanner.nextInt();
                    if(shift >= 1 && shift <=30){
                        validShiftInput = true;
                    }
                    else{
                        System.out.println("\nInvalid input. Please enter a number from 1 - 30.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\nInvalid input. Please enter a number from 1 - 30.");
                }
            } 

            if (operation == 1) {

                message = CaesarTool.encrypt(message.trim(), shift);
                System.out.println("\nEncrypted message (CAESAR):\n" + message);
            }

            else{        
                       
                message = CaesarTool.decrypt(message.trim(), shift);
                System.out.println("\nDecrypted message (CAESAR):\n" + message);
            }

        }
        




        // Просить ввести сообщение. 
        // Получить сообщение и выполнить необходимую операцию (шифрование или дешифровку) на основании ранее сделанного выбора.
    }
}