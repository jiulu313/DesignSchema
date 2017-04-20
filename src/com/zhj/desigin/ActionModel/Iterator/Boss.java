package com.zhj.desigin.ActionModel.Iterator;

import java.util.List;

/**
 * 一般的写法
 */
public class Boss {
    public static void main(String[] args){
        //遍历小民公司的员工
        CompanyMin min = new CompanyMin();
        List minList = min.getList();
        for (int i = 0;i<minList.size();i++){
            System.out.println(minList.get(i).toString());
        }

        //遍历小辉公司的员工
        CompanyHui hui = new CompanyHui();
        Employee[] huiArr = hui.getEmployees();
        for (int i = 0;i<huiArr.length;i++){
            System.out.println(huiArr[i].toString());
        }
    }

}
