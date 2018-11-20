package com.company.WaterHouse;

public class KhoanChi extends CacKhoanThu {
    //int pay;
    public KhoanChi(String time, String address, int payment, String reason, String man_benefit) {
        super(time, address, payment, reason, man_benefit);
        //this.pay =pay;
    }

    void Info() {
        System.out.println("Thong tin tai khoan chi: ");

    }

    @Override
    void ThongtinCacKhoan() {
        super.ThongtinCacKhoan();
        System.out.println("Tong so tien chi: " + payment);
        System.out.println("Ly do: " + reason);
        System.out.println("Nguoi thu huong: " + man_benefit);
    }


}
