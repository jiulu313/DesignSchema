package com.zhj.desigin.ActionModel.strategy;

/**
 * Created by zhanghongjun on 16/10/18.
 * 策略模式
 */
public class StrategyTest {
    public static void main(String[] args){
        test();
    }

    public static void test() {
        Shop shop = new Shop();

        NormalMember normalMember = new NormalMember();
        WhiteGoldMember whiteGoldMember = new WhiteGoldMember();
        YellowGoldMember yellowGoldMember = new YellowGoldMember();

        //一本书100块钱
        double price = 100;

        shop.setStrategy(normalMember);
        System.out.println("我是普通会员，我不打折，价格为：" + shop.calcPrice(price));

        shop.setStrategy(whiteGoldMember);
        System.out.println("我是白金会员，我打9折，价格为：" + shop.calcPrice(price));

        shop.setStrategy(yellowGoldMember);
        System.out.println("我是黄金会员，我打8折，价格为：" + shop.calcPrice(price));

    }


}
