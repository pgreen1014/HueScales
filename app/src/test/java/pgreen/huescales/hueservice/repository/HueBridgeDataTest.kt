package pgreen.huescales.hueservice.repository

import android.os.Build
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import java.io.File

@Config(manifest = Config.NONE, sdk = [Build.VERSION_CODES.O_MR1])
@RunWith(RobolectricTestRunner::class)
class HueBridgeDataTest {

    @Test
    fun `getHueBridgeBaseUrl returns the base url for the hue bridge`() {
        val hueTestDataPath = HueBridgeDataTest::class.java.getResource("/HueBridgeTestData.json")!!.path
        val file = File(hueTestDataPath)
        val expectedUrl = "https://1.1.1.1/api/test_username/"
        val hueBridgeData = HueBridgeData(file.inputStream())

        val urlResult = hueBridgeData.getHueBridgeBaseUrl()

        assertEquals(expectedUrl, urlResult)
    }
}