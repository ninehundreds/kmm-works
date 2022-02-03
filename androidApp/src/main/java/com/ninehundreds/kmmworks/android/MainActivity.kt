package com.ninehundreds.kmmworks.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ninehundreds.kmmworks.Greeting
import android.widget.TextView
import com.ninehundreds.kmmworks.network.WhizApiClient
import com.ninehundreds.kmmworks.network.WhizBang
import kotlinx.coroutines.runBlocking

fun greet(): String {
    return Greeting().greet()
}

class MainActivity : AppCompatActivity() {

    private val apiClient = WhizApiClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
    }

    private fun getAllWhizBangs() {

        runBlocking {
            apiClient.getWhizBangs(success = {

            }, failure = {
                it?.printStackTrace()
            })
        }
    }

    private fun getWhizBang(id: String) {

        runBlocking {
            apiClient.getWhizBang(id, success = {

            }, failure = {
                it?.printStackTrace()
            })
        }
    }

    private fun deleteWhizBang(id: String) {

        runBlocking {
            apiClient.deleteWhizBang(id, success = {

            }, failure = {
                it?.printStackTrace()
            })
        }
    }

    private fun createWhizBang(code: Int, snap: String, desc: String) {

        runBlocking {
            apiClient.createWhizBang(code, snap, desc,  success = {

            }, failure = {
                it?.printStackTrace()
            })
        }

    }

    private fun updateWhizBang(whizBang: WhizBang) {

        runBlocking {
            apiClient.updateWhizBang(whizBang, success = {

            }, failure = {
                it?.printStackTrace()
            })
        }
    }

}
