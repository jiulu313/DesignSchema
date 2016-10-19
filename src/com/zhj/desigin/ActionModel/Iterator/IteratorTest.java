package com.zhj.desigin.ActionModel.Iterator;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class IteratorTest {

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
