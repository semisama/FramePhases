package uz.ttpu.framephases.data.books.api

import kotlinx.coroutines.flow.Flow
import uz.ttpu.framephases.core.model.Book


interface BookRepository {
    fun observeBooks(): Flow<List<Book>>
    fun observeFavoriteIds(): Flow<Set<String>>
    suspend fun getBook(id: String): Book?
    suspend fun setFavorite(id: String, favorite: Boolean)
}