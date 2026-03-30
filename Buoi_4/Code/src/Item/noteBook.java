package Item;

public class noteBook extends item {
    private int numOfPage;
    private String type;
    private String color;
    private String paperMaterial;
    private String size;
    public noteBook(String name, double price, String brand, int numOfPage, String type, String color, String paperMaterial, String size) {
        super(name, price, brand);
        this.numOfPage = numOfPage;
        this.type = type;
        this.color = color;
        this.paperMaterial = paperMaterial;
        this.size = size;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getPaperMaterial() {
        return paperMaterial;
    }

    public String getSize() {
        return size;
    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPaperMaterial(String paperMaterial) {
        this.paperMaterial = paperMaterial;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
