package com.zhj.desigin.StructureModel.adapter.objectAdapter;

import com.zhj.desigin.StructureModel.adapter.FiveVolt;
import com.zhj.desigin.StructureModel.adapter.Volt220;

/**
 * Created by zhanghongjun on 16/10/18.
 */
public class ObjectVoltAdapter implements FiveVolt{
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
