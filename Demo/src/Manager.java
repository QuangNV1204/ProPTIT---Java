public class Manager {
    public static String hocLuc(double diemTrungBinh) {
        if(diemTrungBinh > 8) return "Gioi";
        else if(diemTrungBinh > 7) return "Kha";
        else if(diemTrungBinh > 6) return "Trung Binh";
        else return "Yeu";
    }
    public static double diemTB(Student student) {
        double diemTrungBinh = 0;
        diemTrungBinh += student.anh;
        diemTrungBinh += student.toan;
        diemTrungBinh += student.van;
        diemTrungBinh /= 3.0;
        return diemTrungBinh;
    }
}
