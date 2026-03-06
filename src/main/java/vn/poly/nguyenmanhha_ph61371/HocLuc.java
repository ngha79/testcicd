package vn.poly.nguyenmanhha_ph61371;

public class HocLuc {
    public String kiemTraHocLuc(double diem) {
        if(diem < 0 || diem > 10) {
            throw new ArithmeticException("Điểm trung bình nằm trong khoảng từ 0-10.");
        }

        if(diem >= 9) {
            return "Xuất sắc";
        }else if(diem >= 7) {
            return "Giỏi";
        }else if(diem >= 5) {
            return "Trung bình";
        }else {
            return "Yếu";
        }
    }
}
