package ua.lviv.lgs.Lesson12;

public class Auto {
    private int horsePowerValue;
    private int year;

    StirringWheel stirringWheel = new StirringWheel();
    Engine engine = new Engine();

    private int diameter = stirringWheel.getDiameter();
    private String material = stirringWheel.getMaterial();

    private int cylinders = engine.getCylinders();

    public Auto(int horsePower, int year, int diameter, String material, int cylinders) {
        this.horsePowerValue = horsePower;
        this.year = year;
        this.diameter = diameter;
        this.material = material;
        this.cylinders = cylinders;

    }

    @Override
    public String toString() {
        return "Auto{" +
                "horsePowerValue=" + horsePowerValue +
                ", year=" + year +
                ", diameter=" + diameter +
                ", material='" + material + '\'' +
                ", cylinders=" + cylinders +
                '}';
    }
}
