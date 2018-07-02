package `in`.eyehunt.androidglobalvariablekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get value of global var used getApplication
        var mApp = MyApplication()
        var strGlobalVar = mApp.globalVar

        Toast.makeText(this, strGlobalVar, Toast.LENGTH_LONG).show()
    }
}
