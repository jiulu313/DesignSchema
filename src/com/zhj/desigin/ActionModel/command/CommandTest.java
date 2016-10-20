package com.zhj.desigin.ActionModel.command;

/**
 * Created by zhanghongjun on 16/10/20.
 */
public class CommandTest {

    public static void test(){
        //创建播放器，也就是命令的接收器
        MediaPlayer mediaPlayer = new MediaPlayer();

        //创建各种命令
        PlayCommand playCommand = new PlayCommand();
        StopCommand stopCommand = new StopCommand();
        RewindCommand rewindCommand = new RewindCommand();

        //设置命令的接收器
        playCommand.setMediaPlayer(mediaPlayer);
        stopCommand.setMediaPlayer(mediaPlayer);
        rewindCommand.setMediaPlayer(mediaPlayer);

        //创建一个遥控器
        Keyboard keyboard = new Keyboard();

        //为遥控器安装各种命令按钮
        keyboard.setPlayCommand(playCommand);
        keyboard.setStopCommand(stopCommand);
        keyboard.setRewindCommand(rewindCommand);

        //调用命令按钮控制播放器
        keyboard.play();
        keyboard.rewind();
        keyboard.stop();
    }





}
