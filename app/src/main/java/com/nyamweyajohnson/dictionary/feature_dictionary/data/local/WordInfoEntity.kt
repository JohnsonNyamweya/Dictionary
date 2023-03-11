package com.nyamweyajohnson.dictionary.feature_dictionary.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nyamweyajohnson.dictionary.feature_dictionary.domain.model.Meaning
import com.nyamweyajohnson.dictionary.feature_dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val license: License,
    val meanings: List<Meaning>,
    val phonetic: String,
    val sourceUrls: List<String>,
    val word: String,
    @PrimaryKey val id: Int? = null
){
    fun toWordInfo(): WordInfo {
        return WordInfo(
            license = license,
            meanings = meanings,
            phonetic = phonetic,
            sourceUrls = sourceUrls,
            word = word
        )
    }
}
