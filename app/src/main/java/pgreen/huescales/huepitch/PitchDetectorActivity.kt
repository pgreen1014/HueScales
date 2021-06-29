package pgreen.huescales.huepitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pgreen.huescales.R
import pgreen.huescales.databinding.ActivityPitchDetectorBinding

class PitchDetectorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPitchDetectorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPitchDetectorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.pitchDetectionButton.text = getString(R.string.start)
    }
}