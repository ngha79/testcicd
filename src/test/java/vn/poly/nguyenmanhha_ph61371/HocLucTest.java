package vn.poly.nguyenmanhha_ph61371;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HocLucTest {
    private HocLuc hocLuc;

    @BeforeEach
    void setUp() {
        hocLuc = new HocLuc();
    }

    @Test
    public void kiemTraHocLucHopLe() {
        assertEquals("Yếu", hocLuc.kiemTraHocLuc(4.5));
    }

    @Test
    public void kiemTraHocLucHopLe_BienXuatSac() {
        assertEquals("Xuất sắc", hocLuc.kiemTraHocLuc(10));
    }

    @Test
    public void kiemTraHocLucHopLe_BienGioi() {
        assertEquals("Giỏi", hocLuc.kiemTraHocLuc(7));
    }

    @Test
    public void kiemTraHocLucHopLe_BienTrungBinh() {
        assertEquals("Trung bình", hocLuc.kiemTraHocLuc(5));
    }

    @Test
    public void kiemTraHocLucKhongHopLe() {
        Assertions.assertThrows(ArithmeticException.class, ()->hocLuc.kiemTraHocLuc(11));
    }
}