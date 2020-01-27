package co.edu.udea.compumovil.gr01_20192.proyectsetapp

import android.R
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class StageActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)

        val values = arrayOf<String>(
            "Android", "iPhone", "WindowsMobile",
            "Blackberry", "WebOS", "Ubuntu", "Windows7", "MacOS X",
            "Linux", "Windows8.1", "Lollipop", "iOS",
            "Lubuntu", "Kali linux", "Windows10", "Windows XP",
            "Symbian"
        )

    }
}
