package com.zenbi.moshiproguardrule.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

//@Keep
data class Person(
    @Json(name = "name") val name: String = ""
) {
    companion object {
        private val moshi by lazy { Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build() }
        val adapter: JsonAdapter<Person> by lazy { moshi.adapter(Person::class.java) }
    }
}