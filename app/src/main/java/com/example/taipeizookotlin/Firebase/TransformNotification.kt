package com.example.taipeizookotlin.Firebase

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.example.taipeizookotlin.DetailActivity
import com.example.taipeizookotlin.MainActivity

class TransformNotification : BroadcastReceiver() {


    /**
     * 未使用 可以從這裡接收到推播傳送過來這裡抓到資料 以後可以使用
     */
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.v("aaa","onReceive")
        context?.let {
            Log.v("aaa","onReceive")
            FirebaseService.mFirebaseHavePageCode = true
            val intent = Intent(it, DetailActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            context.startActivity(intent)
        }
    }
}