package Item;

public class pencil extends item{
    private String color;
    private String material;
    private String string;
    public pencil(String name, double price, String brand, String color, String material, String string) {
        super(name, price, brand);
        this.color = color;
        this.material = material;
        this.string = string;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getString() {
        return string;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setString(String string) {
        this.string = string;
    }
}
