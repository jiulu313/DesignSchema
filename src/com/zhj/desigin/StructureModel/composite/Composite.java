package com.zhj.desigin.StructureModel.composite;

import java.util.ArrayList;

/**
 * Created by zhanghongjun on 16/10/18.
 */
public class Composite extends Component{

    private ArrayList<Component> components = new ArrayList<>();

    public Composite(String name){
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if(components != null){
            for (Component child : components){
                child.doSomething();
            }
        }
    }

    @Override
    public void addChild(Component child) {
        components.add(child);
    }

    @Override
    public void removeChild(Component child) {
        components.remove(child);
    }

    @Override
    public Component getChild(int index) {
        return components.get(index);
    }
}
