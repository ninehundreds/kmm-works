package com.ninehundreds.kmmworks.network

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*

class WhizBangServiceImpl(private val client: HttpClient): WhizBangService {

    companion object {
        private const val url = "https://61f931ba783c1d0017c449eb.mockapi.io/api/v1/whizbang/"
    }

    override suspend fun createWhizBang(whiz: WhizBang): WhizBang {
        val response: WhizBang = client.post(url) {
            contentType(ContentType.Application.Json)
            body = whiz
        }
        return response
    }

    override suspend fun updateWhizBang(whiz: WhizBang): WhizBang {
        val id = whiz.id
        val response: WhizBang = client.put("$url$id") {
            contentType(ContentType.Application.Json)
            body = whiz
        }
        return response
    }

    override suspend fun deleteWhizBang(id: String): Boolean {
        val httpResponse: HttpResponse = client.delete("$url$id")
        return (httpResponse.status.value in 200..299)
    }

    override suspend fun getWhizBang(id: String): WhizBang {
        return client.get("$url$id")
    }

    override suspend fun getAllWhizBangs(): ArrayList<WhizBang> {
        return client.get(url)
    }
}