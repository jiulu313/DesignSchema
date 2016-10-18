package com.zhj.desigin.StructureModel.adapter.objectAdapter;

import com.zhj.desigin.StructureModel.adapter.Volt220;

/**
 * Created by zhanghongjun on 16/10/18.
 */
public class ObjectVoltAdapterTest {

    public static void test(){

        ObjectVoltAdapter voltAdapter = new ObjectVoltAdapter(new Volt220());
        System.out.println(voltAdapter.getVolt5());
    }

}
