package Missedcalls;

import java.util.*;

class AdressBook {
    private Map<String, Contact> contacts = new HashMap<>();

    public Map<String, Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getNumber()))
            System.out.println(">>Такой контакт уже существует");
        contacts.put(contact.getNumber(), contact);
        System.out.println(">>Контакт добавлен");
    }

    public void findContact(String findContact) {
        if (contacts.containsKey(findContact)) {
            System.out.println(contacts.get(findContact).toString());
        } else {
            System.out.println(">>Контакт с таким номером телефона не существует");
        }

    }

    public void deleteContact(String deleteContact){
        Iterator<Map.Entry<String, Contact>> itr = contacts.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, Contact> it = itr.next();
            if (it.getValue().getName().equals(deleteContact)) {
                String key = it.getKey();
                contacts.remove(key);
                System.out.println(">>Контакт успешно удален");
            } else {
                System.out.println(">>Что-то не могу найти такой контакт");
            }
        }
    }

    public String checkContact (String missed){
        String thisContact = null;
        if (contacts.containsKey(missed)) {
            Contact thisPerson = contacts.get(missed);
            thisContact = thisPerson.getName();
        }
        return thisContact;
    }

}
