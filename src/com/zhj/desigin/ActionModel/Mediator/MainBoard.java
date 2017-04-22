package com.zhj.desigin.ActionModel.Mediator;

/**
 * 具体的中介者，也就是主板
 */
public class MainBoard extends Mediator{
    private CDDevice cdDevice;
    private CPU cpu;
    private SoundCard soundCard;
    private GraphicsCard graphicsCard;

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void changed(Colleague c){
        if(c == cdDevice){
            handleCD((CDDevice) c);
        }else if(c == cpu){
            handleCPU((CPU) c);
        }

    }

    //处理光驱读取数据后与其他设备的交互
    private void handleCD(CDDevice cdDevice){
        cpu.decodeData(cdDevice.read());
    }

    //处理CPU读取数据后与其它设备的交互
    private void handleCPU(CPU cpu){
        soundCard.soundPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataVideo());
    }
}
