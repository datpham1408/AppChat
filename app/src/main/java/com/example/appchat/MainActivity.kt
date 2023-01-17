package com.example.appchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rycchatting : RecyclerView
    private lateinit var newArrayList: ArrayList<DataChat>
    lateinit var imgAvatar : Array<Int>
    lateinit var tvUserName : Array<String>
    lateinit var tvContentChat : Array<String>
    lateinit var tvTime : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgAvatar = arrayOf(
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_background,
            android.R.drawable.arrow_down_float,
            android.R.drawable.btn_dialog,
            android.R.drawable.btn_star_big_on,
            android.R.drawable.checkbox_on_background,
        )

        tvUserName = arrayOf(
            "Pham Quoc Dat",
            "DTN x Gummi",
            "Thien",
            "Nguyen Phu Thinh",
            "Nguyen",
            "Anh Beo",
        )

        tvContentChat = arrayOf(
            "Helllo",
            "Game 1",
            "Ok, fime",
            "meeting Chatting",
            "huhuhuh",
            "kiuungdddddd",
        )

        tvTime = arrayOf(
            "1 hour",
            "3 miute",
            "5 hour",
            "8 hour",
            "10 hour",
            "4 days",
        )

        rycchatting = findViewById(R.id.ryc_chatting)
        rycchatting.layoutManager = LinearLayoutManager(this)
        rycchatting.setHasFixedSize(true)

        newArrayList = arrayListOf<DataChat>()
        getUserData()

    }

    private fun getUserData() {
        for (i in imgAvatar.indices){
            val data = DataChat(imgAvatar[i],tvUserName[i],tvContentChat[i],tvTime[i])
            newArrayList.add(data)
        }
        rycchatting.adapter = ListChatAdapter(newArrayList)
    }
}