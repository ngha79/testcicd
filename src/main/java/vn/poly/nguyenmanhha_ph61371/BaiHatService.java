package vn.poly.nguyenmanhha_ph61371;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    private List<BaiHat> listBaiHat = new ArrayList<BaiHat>();

    public Boolean themBaiHat(BaiHat bh) {
        if (bh == null) {
            throw new IllegalArgumentException("Chưa nhập bài hát");
        }

        if(bh.getMa().isEmpty() || bh.getMa() == null || bh.getTen().isEmpty() || bh.getTen()==null
                || bh.getTenCaSi().isEmpty() || bh.getTenCaSi() == null
                || bh.getTheLoai().isEmpty()  || bh.getTheLoai() == null) {
            throw new IllegalArgumentException("Dữ liệu không được để trống");
        }

        if(bh.getThoiLuong() < 2 || bh.getThoiLuong() > 6) {
            throw new IllegalArgumentException("Thời lượng của bài hát phải từ 2:00 đến 5:59");
        }

        listBaiHat.add(bh);
        return true;
    }
}
