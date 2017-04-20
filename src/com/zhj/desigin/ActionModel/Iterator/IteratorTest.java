package com.zhj.desigin.ActionModel.Iterator;

/**
 * 迭代器测试类，相当于Boss
 */
public class IteratorTest {

    public static void main(String[] args){
        test();
    }

    public static void test(){
        CompanyMin companyMin = new CompanyMin();
        check(companyMin.iterator());

        CompanyHui companyHui = new CompanyHui();
        check(companyHui.iterator());

    }

    private static void check(Iterator iterator) {
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
