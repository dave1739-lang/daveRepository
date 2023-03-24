package com.dave.test;


import java.util.List;

public class Dave {
    public static void main(String[] args) {

        Num num = new Num();
        boolean flag=true;
        int m=0;
        while (flag){
            List<Integer> num1=num.getNum();
            List<Integer> num2=num.getNum();
            if (num.equals(num1,num2).contains("5")){
                System.out.println("中大奖了");
                flag=false;
            }
            m+=1;
        }
        System.out.println("用了"+m+"次才中奖");
        for (int i=1;i<=100;i++){
            List<Integer> num1=num.getNum();
            List<Integer> num2=num.getNum();
            if (num.equals(num1,num2).contains("5")){
                System.out.println("中大奖了");
            }
            System.out.println("屁都没有");
        }


    }

}
