package app.service;

import app.models.ConsultingGroup;

public interface Printer {

    void print(ConsultingGroup.Message message);
}
