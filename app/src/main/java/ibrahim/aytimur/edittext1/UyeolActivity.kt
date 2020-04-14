package ibrahim.aytimur.edittext1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.uye_ol.*

class UyeolActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.uye_ol)
        uyeolgirisyapbtn.setOnClickListener({
            val gecisyap=Intent(applicationContext,MainActivity::class.java)
            startActivity(gecisyap)
        })
    }
}
