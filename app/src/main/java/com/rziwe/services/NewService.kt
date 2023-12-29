package com.rziwe.services

import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.util.Log

class NewService : android.app.Service() {


    lateinit var mediaPlayer: MediaPlayer


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
        mediaPlayer.isLooping = true
        Log.d("music" ,"play agin =====================")
        mediaPlayer.start()



        return (START_STICKY)
    }


    override fun onDestroy() {
        super.onDestroy()

        mediaPlayer.stop()
    }


    override fun onBind(intent: Intent?): IBinder? {
        return null
    }


}