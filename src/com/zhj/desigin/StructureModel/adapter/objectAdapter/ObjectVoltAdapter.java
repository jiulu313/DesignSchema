package com.zhj.desigin.StructureModel.adapter.objectAdapter;

import com.zhj.desigin.StructureModel.adapter.FiveVolt;
import com.zhj.desigin.StructureModel.adapter.Volt220;

/**
 * 对象适配器,实现目标接口，保存一个被转换对象的引用
 */
public class ObjectVoltAdapter implements FiveVolt{
    //保存一个被转换对象的引用
    Volt220 volt220;

    public ObjectVoltAdapter(Volt220 volt220){
        this.volt220 = volt220;
    }

    @Override
    public int getVolt5() {
        return 5;
    }

    public int getVolt220(){
        return volt220.getVolt220();
    }
}
