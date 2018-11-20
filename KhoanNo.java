package com.company.WaterHouse;

public class KhoanNo extends KhoanChoVay {
    public KhoanNo(String time, String address, int payment, String reason, String man_benefit, String limited_time, int interest, String day_paybck, String identify) {
        super(time, address, payment, reason, man_benefit, limited_time, interest, day_paybck, identify);
    }

    void Info4() {
        System.out.println("Thong tin tai khoan no: ");
    }

    @Override
    void ThongtinCacKhoan() {
        super.ThongtinCacKhoan();
    }
}
