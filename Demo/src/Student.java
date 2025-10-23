public class Student {
    public String name;
    public String dia_chi;
    public int age;
    public int toan;
    public int van;
    public int anh;
    public Student(String name, String dia_chi, int age, int toan, int van, int anh) {
        this.name = name;
        this.dia_chi = dia_chi;
        this.age = age;
        this.toan = toan;
        this.van = van;
        this.anh = anh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getToan() {
        return toan;
    }

    public void setToan(int toan) {
        this.toan = toan;
    }

    public int getVan() {
        return van;
    }

    public void setVan(int van) {
        this.van = van;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}
