package com.zhj.desigin.ActionModel.command;

/**
 * Created by zhanghongjun on 16/10/20.
 */
public class RewindCommand implements command{
    MediaPlayer mediaPlayer;

    public void setMediaPlayer(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void execute() {
        mediaPlayer.rewind();
    }
}
