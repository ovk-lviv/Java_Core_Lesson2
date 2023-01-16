package ua.lviv.lgs.Lesson15;

public class Pet {

    private String type;
    private String petName;

    public Pet(String type, String petName) {
        this.type = type;
        this.petName = petName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", petName='" + petName + '\'' +
                '}';
    }
}
