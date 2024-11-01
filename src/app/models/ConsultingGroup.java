package app.models;

import app.service.Printer;

public class ConsultingGroup implements Printer {


    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }


        public void setSender(String sender) {
            this.sender = sender;


        }
    }

    @Override
    public void print(Message message) {
        if (message.getSender() == null) {
            System.out.println("Анонімний користувач відправив повідомлення: Вітаю, мені треба допомога");
        } else if (message.getSender() != null) {
            System.out.println("Користувач <sender> відправив повідомлення: Як це можна завантажити...?");
        }
    }
}




