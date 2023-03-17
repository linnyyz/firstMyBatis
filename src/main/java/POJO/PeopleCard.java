package POJO;

public class PeopleCard {
    int cardId;
    String sex;
    int age;
    int peopleId;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(int peopleId) {
        this.peopleId = peopleId;
    }

    @Override
    public String toString() {
        return "PeopleCard{" +
                "cardId=" + cardId +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

}
