package Missedcalls;

class Contact {
    private String name;
    private String number;
    private Group group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Contact (String name, String number, Group group) {
        this.name = name;
        this.number = number;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Группа: " + getGroup() + ", имя контакта: " + getName() + ", номер контакта: " + getNumber();
    }

}