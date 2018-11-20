package com.company.WaterHouse;

public class KhoanThu extends CacKhoanThu {
    int take;
    int s;

    public KhoanThu(String time, String address, int payment, String reason, String man_benefit) {
        super(time, address, payment, reason, man_benefit);
        this.take = this.payment;
    }

    void Info2() {
        System.out.println("Thong tin tai khoan thu : ");
    }

    @Override
    void ThongtinCacKhoan() {
        super.ThongtinCacKhoan();
        System.out.println("Tong so tien thu: " + take);
        System.out.println("Ly do: " + reason);
        System.out.println("Nguoi thu huong: " + man_benefit);
    }
}
