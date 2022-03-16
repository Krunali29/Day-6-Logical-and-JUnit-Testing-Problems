package com.bridgelabz.LogicalPrograms;
//Logical Problems
//Que.5
//Coupon Numbers

public class CouponNumbers
{
    public static void main(String[] args)
    {
        char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max=100000000;
        int random=(int) (Math.random()*max);
        StringBuilder sb=new StringBuilder();

        while (random>0)
        {
            sb.append(chars[random % chars.length]);
            random /= chars.length;
        }

        String couponCode=sb.toString();
        System.out.println("Coupon Code: "+couponCode);
    }


}

