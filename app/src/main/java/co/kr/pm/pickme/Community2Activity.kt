package co.kr.pm.pickme

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import co.kr.pm.pickme.R

class Community2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community2)
    }

    fun cmback(view: View) {
        val intent = Intent(this, CommunityActivity::class.java)
        startActivity(intent)
    }
}