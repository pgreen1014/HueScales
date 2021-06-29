package pgreen.huescales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pgreen.huescales.huepitch.PitchDetectorActivity

class LauncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        startInitialActivity()
    }

    fun startInitialActivity() {
        startActivity(Intent(this, PitchDetectorActivity::class.java))
    }
}