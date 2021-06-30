package pgreen.huescales.hueservice.repository

import org.json.JSONObject
import java.io.InputStream


// TODO delete this class for production.
class HueBridgeData(
    data: InputStream,
) : HueServiceRepository {

    private val hueBridgeData: JSONObject

    init {
        val lines = StringBuilder()
         data.bufferedReader().forEachLine { lines.append(it) }
        hueBridgeData = JSONObject(lines.toString())
    }

    override fun getHueBridgeBaseUrl(): String {
        val ipAddress = hueBridgeData["hueBridgeAddress"]
        val username = hueBridgeData["hueUsername"]
        return "https://$ipAddress/api/$username/"
    }

}