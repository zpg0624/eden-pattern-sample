package com.eden.adapter;

/**
 * @created by eden
 * @since 2019-03-13 上午 9:43:10
 */

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if("1".equals(audioType)){
            advancedMediaPlayer = new VlcMediaPlayer();
            advancedMediaPlayer.playVlc("vlc");
        }else{
            advancedMediaPlayer = new Mp4MediaPlayer();
            advancedMediaPlayer.playMp4("mp4");
        }
    }


    public static void main(String[] args) {

        MediaAdapter mediaAdapter = new MediaAdapter();

        mediaAdapter.play("1","aaa");



    }
}
