package vn.poly.nguyenmanhha_ph61371;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaiHatServiceTest {
    private BaiHatService baiHatService;

    @BeforeEach
    void setUp() {
        baiHatService = new BaiHatService();
    }

    @Test
    public void themBaiHatHopLe() {
        BaiHat baiHat = new BaiHat("BH01","Bài hát 1", "Ca sĩ 1", 3.5F, "Nhạc trẻ");
        assertTrue(baiHatService.themBaiHat(baiHat));
    }

    @Test
    public void themBaiHatHopLe_BienDuoi() {
        BaiHat baiHat = new BaiHat("BH02","Bài hát 2", "Ca sĩ 2", 2F, "Nhạc trẻ");
        assertTrue(baiHatService.themBaiHat(baiHat));
    }

    @Test
    public void themBaiHatHopLe_BienTren() {
        BaiHat baiHat = new BaiHat("BH03","Bài hát 3", "Ca sĩ 3", 5.59F, "Nhạc trẻ");
        assertTrue(baiHatService.themBaiHat(baiHat));
    }

    @Test
    public void themBaiHatHopLe_NgoaiBienDuoi() {
        BaiHat baiHat = new BaiHat("BH04","Bài hát 4", "Ca sĩ 4", 1F, "Nhạc vàng");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {baiHatService.themBaiHat(baiHat);});
    }

    @Test
    public void themBaiHatHopLe_NgoaiBienTren() {
        BaiHat baiHat = new BaiHat("BH05","Bài hát 5", "Ca sĩ 5", 7F, "Nhạc vàng");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {baiHatService.themBaiHat(baiHat);});
    }

    @Test
    public void themBaiHatHopLe_TrongDuLieu() {
        BaiHat baiHat = new BaiHat("BH05","", "Ca sĩ 5", 7F, "Nhạc vàng");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {baiHatService.themBaiHat(baiHat);});
    }
}