package com.company.WaterHouse;

public abstract class CacKhoanThu {
    String time;
    String address;
    int  payment;
    String reason;
    String man_benefit;

    public CacKhoanThu(String time, String address, int payment, String reason, String man_benefit) {
        this.time = time;
        this.address = address;
        this.payment = payment;
        this.reason = reason;
        this.man_benefit = man_benefit;
    }

    void ThongtinCacKhoan() {
        System.out.println(time);
        System.out.println(address);
        /*System.out.println("Tong so tien thu: "+payment);
        System.out.println("Ly do: "+reason);
        System.out.println("Nguoi thu huong: "+man_benefit);*/
    }

}
