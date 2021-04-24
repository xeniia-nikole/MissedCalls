package Missedcalls;

import java.time.LocalDateTime;
import java.util.*;
import java.time.format.DateTimeFormatter;

class MissedCalls {
    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addMissedCall(String missed) {
        missedCalls.put(LocalDateTime.now(), missed);
        System.out.println(">>Пропущенный вызов добавлен");
    }

    public void missedCallsList(AdressBook myContacts) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Список пропущенных вызовов:");
        for (Map.Entry<LocalDateTime, String> item : missedCalls.entrySet()) {
            String formatDateTime = item.getKey().format(formatter);
            String noName = item.getValue();
            String thisContact = myContacts.checkContact(noName);
            if (thisContact != null){
                item.setValue(thisContact);
            }
            System.out.printf("%s : %s \n", formatDateTime, item.getValue());
        }

    }


    public void clearmissedCallsList() {
        missedCalls.clear();

    }

}
