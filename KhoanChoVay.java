package com.company.WaterHouse;

public class KhoanChoVay extends CacKhoanThu {
    int money_borrowed;
    String creditor;
    String limited_time;
    int interest;
    String day_paybck;
    String identify;


    public KhoanChoVay(String time, String address, int payment, String reason, String man_benefit, String limited_time, int interest, String day_paybck, String identify) {
        super(time, address, payment, reason, man_benefit);
        this.money_borrowed = this.payment;
        this.creditor = this.man_benefit;
        this.limited_time = limited_time;
        this.interest = interest;
        this.day_paybck = day_paybck;
        this.identify = identify;

    }

    void Info3() {
        System.out.println("Thong tin tai hoan cho vay: ");
    }

    @Override
    void ThongtinCacKhoan() {
        super.ThongtinCacKhoan();
        System.out.println("Tong so tien vay: " + payment);
        System.out.println("Ly do: " + reason);
        System.out.println("Nguoi vay: " + man_benefit);
        System.out.println("Thoi han: " + limited_time);
        System.out.println("Lai suat: " + interest);
        System.out.println("Ngay tra: " + day_paybck);
        System.out.println("Chung thuc: " + identify);
    }
}
