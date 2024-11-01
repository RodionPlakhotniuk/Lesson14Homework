package app;

import app.models.ConsultingGroup;
import app.service.Printer;

public class Lesson14App {
    public static void main(String[] args) {

        Printer printer = new Printer() {
            @Override
            public void print(ConsultingGroup.Message message) {
                if (message.getText() == null && message.getSender() == null) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            }
        };

    }
}

