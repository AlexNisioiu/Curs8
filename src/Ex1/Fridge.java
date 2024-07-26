package Ex1;

public class Fridge extends Electronics{
    private double temperature;


    public Fridge(double price, String name, String description, int quantity, String type, double length, double width, double height, double weight, double temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }


    public double getTemperature() {
        return temperature;
    }

    public String getResult() {
        return getPrice() + "," + getName() + "," + getDescription() + "," + getQuantity() + "," + getType() + "," + getWeight() + "," + getHeight() + "," + getLength() + "," + getWidth() + "," + getTemperature();
    }
}
