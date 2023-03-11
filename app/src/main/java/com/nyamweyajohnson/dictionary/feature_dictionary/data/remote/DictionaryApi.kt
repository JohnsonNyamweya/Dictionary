package com.nyamweyajohnson.dictionary.feature_dictionary.data.remote

import com.nyamweyajohnson.dictionary.feature_dictionary.data.remote.dto.WordInfoDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {
    @GET("/api/v2/entries/en/{word}")
    suspend fun getWordInfo(
        @Path("word") word: String
    ): List<WordInfoDto>

    companion object{
        const val BASE_URL = "https://api.dictionaryapi.dev/"
    }
}

//this function returns a JSON response that is passed here to one of our DTO classes