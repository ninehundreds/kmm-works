package com.ninehundreds.kmmworks.network

import co.touchlab.kermit.Kermit
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*

class WhizApiClient {

    private val log = Kermit()
    private val networkLogger = object : Logger {
        override fun log(message: String) {
            log.v("KMM-Works:") { message }
        }
    }

    private fun getClient(): HttpClient {

        return HttpClient().config {

            install(Logging) {
                logger = networkLogger
                level = LogLevel.ALL
            }

            install(JsonFeature) {
                val json = kotlinx.serialization.json.Json { ignoreUnknownKeys = true }
                serializer = KotlinxSerializer(json)
            }
        }
    }

    suspend fun getWhizBangs(success: (List<WhizBang>) -> Unit, failure: (Throwable?) ->Unit) {
        try {
            WhizBangServiceImpl(getClient()).getAllWhizBangs().also(success)
        } catch (e: Exception) {
            failure(e)
        }
    }

    suspend fun getWhizBang(id: String, success: (WhizBang) -> Unit, failure: (Throwable?) -> Unit) {
        try {
            WhizBangServiceImpl(getClient()).getWhizBang(id).also(success)
        } catch (e: Exception) {
            failure(e)
        }
    }

    suspend fun deleteWhizBang(id: String, success: (Boolean) -> Unit, failure: (Throwable?) -> Unit) {
        try {
            WhizBangServiceImpl(getClient()).deleteWhizBang(id).also(success)
        } catch (e: Exception) {
            failure(e)
        }
    }

    suspend fun createWhizBang(code: Int, snap: String, desc: String, success: (WhizBang) -> Unit, failure: (Throwable?) -> Unit) {
        try {
            WhizBangServiceImpl(getClient()).createWhizBang(WhizBang(null, code, snap, desc)).also(success)
        } catch (e: Exception) {
            failure(e)
        }
    }

    suspend fun updateWhizBang(whizBang: WhizBang, success: (WhizBang) -> Unit, failure: (Throwable?) -> Unit) {
        try {
            WhizBangServiceImpl(getClient()).updateWhizBang(whizBang).also(success)
        } catch (e: Exception) {
            failure(e)
        }
    }

}