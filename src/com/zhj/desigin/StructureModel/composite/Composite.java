package com.zhj.desigin.StructureModel.composite;

import java.util.ArrayList;

/**
 * 具有叶子节点的节点
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

    //增
    @Override
    public void addChild(Component child) {
        components.add(child);
    }

    //删
    @Override
    public void removeChild(Component child) {
        components.remove(child);
    }

    //查
    @Override
    public Component getChild(int index) {
        return components.get(index);
    }
}
