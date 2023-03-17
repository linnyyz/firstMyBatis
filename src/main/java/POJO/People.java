package POJO;

import java.util.List;

public class People {
    int id;
    String Name;
    PeopleCard card;
    List<Thing> things;

    public List<Thing> getThings() {
        return things;
    }

    public void setThings(List<Thing> things) {
        this.things = things;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public PeopleCard getCard() {
        return card;
    }

    public void setCard(PeopleCard card) {
        this.card = card;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", card=" + card +
                ", things=" + things +
                '}';
    }
}
