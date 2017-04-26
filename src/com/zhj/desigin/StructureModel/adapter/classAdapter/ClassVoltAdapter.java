package com.zhj.desigin.StructureModel.adapter.classAdapter;

import com.zhj.desigin.StructureModel.adapter.FiveVolt;
import com.zhj.desigin.StructureModel.adapter.Volt220;

/**
 * 适配器，即有5V的，又有220V的，就像转换头一样，两边都可以兼容
 */
public class ClassVoltAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getVolt5() {
        return 5;
    }
}
