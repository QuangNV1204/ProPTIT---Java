package Item;

public class pen extends item{
    private String color;
    private String material;
    private String typeInk;
    private String smooth;
    public pen(String name, double price, String brand, String color, String material, String typeInk, String smooth) {
        super(name, price, brand);
        this.color = color;
        this.material = material;
        this.typeInk = typeInk;
        this.smooth = smooth;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getTypeInk() {
        return typeInk;
    }

    public String getSmooth() {
        return smooth;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setTypeInk(String typeInk) {
        this.typeInk = typeInk;
    }

    public void setSmooth(String smooth) {
        this.smooth = smooth;
    }
}
