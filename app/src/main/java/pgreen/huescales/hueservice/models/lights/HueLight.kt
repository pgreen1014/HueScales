package pgreen.huescales.hueservice.models.lights

import com.google.gson.annotations.SerializedName

data class HueLight(
    val state: State,
    @SerializedName("swupdate") val swUpdate: SwUpdate,
    val type: String,
    val name: String,
    @SerializedName("modelid") val modelID: String,
    @SerializedName("manufacturername") val manufacturerName: String,
    @SerializedName("productname") val productName: String,
    val capabilities: Capabilities,
    val config: Config,
    @SerializedName("uniqueid") val uniqueId: String,
    @SerializedName("swversion") val swVersion: String,
    @SerializedName("swconfigid") val swConfigId: String,
    @SerializedName("productid") val productId: String
)

data class State(
    val on: Boolean,
    @SerializedName("bri") val brightness: Int,
    val hue: Int,
    val effect: String,
    val xy: List<Double>,
    val ct: Int,
    val alert: String,
    @SerializedName("colormode") val colorMode: String,
    val mode: String,
    val reachable: Boolean
)

data class SwUpdate(
    val state: String,
    @SerializedName("lastinstall") val lastInstall: String
)

data class Capabilities(
    val certified: Boolean,
    val control: Control
)

data class Control(
    @SerializedName("mindimlevel") val minDimlevel: Int,
    @SerializedName("maxlumen") val maxLumen: Int,
    @SerializedName("colorgamuttype") val colorGamutType: String,
    @SerializedName("colorgamut") val colorGamut: List<List<Double>>,
    val ct: CT,
    val streaming: Streaming
)

data class CT(
    val min: Int,
    val max: Int
)

data class Streaming(
    val renderer: Boolean,
    val proxy: Boolean
)

data class Config(
    val archetype: String,
    val function: String,
    val direction: String,
    val startup: StartUp
)

data class StartUp(
    val mode: String,
    val configured: Boolean
)