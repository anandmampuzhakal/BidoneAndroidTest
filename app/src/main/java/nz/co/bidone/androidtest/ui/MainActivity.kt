package nz.co.bidone.androidtest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nz.co.bidone.androidtest.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}