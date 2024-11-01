package app;

import app.models.ConsultingGroup;
import app.service.Printer;

public class Lesson14App {
    public static void main(String[] args) {

        ConsultingGroup consultingGroup = new ConsultingGroup();


        ConsultingGroup.Message message1 = new ConsultingGroup.Message("Привіт", "Родіон");
        consultingGroup.print(message1);


        ConsultingGroup.Message message2 = new ConsultingGroup.Message("Допоможи обрати сорочку", null);
        consultingGroup.print(message2);


        ConsultingGroup.Message message3 = new ConsultingGroup.Message(null, null);
        consultingGroup.print(message3);
    }
}

