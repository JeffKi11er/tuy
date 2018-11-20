package com.company.WaterHouse;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int th = 0;
        int ch = 0;
        int la = 0;
        int va = 0;
        int no = 0;
        int s1 = 0;
        int s = 0;
        int b;
        int n;
        int i;
        String t1;
        String a1;
        int d1;
        String r1;
        String m1;
        String l1;
        int i1;
        String b1;
        String d2;
        System.out.println("*************************PHAN MEM QUAN LY CHI TIEU****************************");
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------");

        do {
            System.out.println("press [1] 'Khoan Thu'");
            System.out.println("press [2] 'Khoan Chi'");
            System.out.println("press [3] 'Khoan ChoVay'");
            System.out.println("press [4] 'Khoan No'");
            System.out.println("press [5] 'Ngan quy'");
            Scanner a = new Scanner(System.in);
            b = a.nextInt();
            if (b == 1) {
                b = 0;
                System.out.println("nhap so nguoi thu:");
                Scanner c = new Scanner(System.in);
                n = c.nextInt();
                for (i = 0; i < n; i++) {
                    System.out.println(i + 1 + ". ");
                    Scanner q = new Scanner(System.in);
                    t1 = q.next();
                    Scanner q1 = new Scanner(System.in);
                    a1 = q1.next();
                    Scanner q2 = new Scanner(System.in);
                    d1 = q2.nextInt();
                    Scanner q3 = new Scanner(System.in);
                    r1 = q3.next();
                    Scanner q4 = new Scanner(System.in);
                    m1 = q4.next();
                    CacKhoanThu t = new KhoanThu(t1, a1, d1, r1, m1);
                    ((KhoanThu) t).Info2();
                    t.ThongtinCacKhoan();
                    s += d1;
                }
                System.out.println("------------------------------------------------------------");
                System.out.println("Thong tin bao cao thu chi trong tuan :");
                System.out.println("Tong so tien thu trong tuan la: " + s);
                th = s;
                System.out.println("do u want to continue? [1]yes/[0]no");
                b = a.nextInt();

            } else if (b == 2) {
                System.out.println("nhap so nguoi chi:");
                Scanner c = new Scanner(System.in);
                n = c.nextInt();
                for (i = 0; i < n; i++) {
                    System.out.println(i + 1 + ". ");
                    Scanner q = new Scanner(System.in);
                    t1 = q.next();
                    Scanner q1 = new Scanner(System.in);
                    a1 = q1.next();
                    Scanner q2 = new Scanner(System.in);
                    d1 = q2.nextInt();
                    Scanner q3 = new Scanner(System.in);
                    r1 = q3.next();
                    Scanner q4 = new Scanner(System.in);
                    m1 = q4.next();
                    /*Scanner q5 = new Scanner(System.in);
                    qy = q5.nextInt();*/
                    CacKhoanThu t = new KhoanChi(t1, a1, d1, r1, m1);
                    ((KhoanChi) t).Info();
                    t.ThongtinCacKhoan();
                    s += d1;
                }
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Thong tin bao cao thu chi trong tuan");
                System.out.println("Tong so tien thu trong tuan la:" + 0);
                System.out.println("Tong so tien chi trong tuan la: " + s);
                ch = s;
                System.out.println("do u want to continue? [1]yes/[0]no");
                b = a.nextInt();
            } else if (b == 3) {
                b = 0;
                System.out.println("nhap so nguoi vay:");
                Scanner c = new Scanner(System.in);
                n = c.nextInt();
                for (i = 0; i < n; i++) {
                    System.out.println(i + 1 + ". ");
                    Scanner q = new Scanner(System.in);
                    t1 = q.next();
                    Scanner q1 = new Scanner(System.in);
                    a1 = q1.next();
                    Scanner q2 = new Scanner(System.in);
                    d1 = q2.nextInt();
                    Scanner q3 = new Scanner(System.in);
                    r1 = q3.next();
                    Scanner q4 = new Scanner(System.in);
                    m1 = q4.next();
                    Scanner q5 = new Scanner(System.in);
                    l1 = q5.next();
                    Scanner q6 = new Scanner(System.in);
                    i1 = q6.nextInt();
                    Scanner q7 = new Scanner(System.in);
                    d2 = q7.next();
                    Scanner q8 = new Scanner(System.in);
                    b1 = q8.next();
                    CacKhoanThu t = new KhoanChoVay(t1, a1, d1, r1, m1, l1, i1, d2, b1);
                    ((KhoanChoVay) t).Info3();
                    t.ThongtinCacKhoan();
                    s += d1;
                    s1 += i1;
                }
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Thong tin bao cao ngan quy : ");
                System.out.println("Tong so tien vay trong tuan la: " + s);
                System.out.println("Tong so tien lai trong tuan la: " + s1);
                va = s;
                la = s1;
                System.out.println("do u want to continue? [1]yes/[0]no");
                b = a.nextInt();

            } else if (b == 4) {
                b = 0;
                System.out.println("nhap so nguoi no:");
                Scanner c = new Scanner(System.in);
                n = c.nextInt();
                for (i = 0; i < n; i++) {
                    System.out.println(i + 1 + ". ");
                    Scanner q = new Scanner(System.in);
                    t1 = q.next();
                    Scanner q1 = new Scanner(System.in);
                    a1 = q1.next();
                    Scanner q2 = new Scanner(System.in);
                    d1 = q2.nextInt();
                    Scanner q3 = new Scanner(System.in);
                    r1 = q3.next();
                    Scanner q4 = new Scanner(System.in);
                    m1 = q4.next();
                    Scanner q5 = new Scanner(System.in);
                    l1 = q5.next();
                    Scanner q6 = new Scanner(System.in);
                    i1 = q6.nextInt();
                    Scanner q7 = new Scanner(System.in);
                    d2 = q7.next();
                    Scanner q8 = new Scanner(System.in);
                    b1 = q8.next();
                    CacKhoanThu t = new KhoanNo(t1, a1, d1, r1, m1, l1, i1, d2, b1);
                    ((KhoanNo) t).Info4();
                    t.ThongtinCacKhoan();
                    s += d1;
                }
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Tong so tien no trong tuan la: " + s);
                no = s;
                System.out.println("do u want to continue? [1]yes/[0]no");
                b = a.nextInt();
            } else if (b == 5) {
                b = 0;
                System.out.println("Thong tin bao cao ngan quy :");
                System.out.println("Tong so tien thu : " + th);
                System.out.println("Tong so tien chi :" + ch);
                System.out.println("Tong so tien cho vay : " + va);
                System.out.println("Tong so tien lai : " + la);
                System.out.println("Tong so tien no : " + no);
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Ngan quy : " + (th - ch - va - no + la));
            }
        } while (b == 1);

    }
}
