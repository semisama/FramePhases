package uz.ttpu.framephases.core.testing

import uz.ttpu.framephases.core.model.Book
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import uz.ttpu.framephases.data.books.api.BookRepository

class FakeBookRepository(books: List<Book> = testBooks) : BookRepository {

    private val bookFlow = MutableStateFlow(books)
    private val favorites = MutableStateFlow<Set<String>>(emptySet())

    override fun observeBooks(): Flow<List<Book>> = bookFlow

    override fun observeFavoriteIds(): Flow<Set<String>> = favorites

    override suspend fun getBook(id: String): Book? =
        bookFlow.value.firstOrNull { it.id == id }

    override suspend fun setFavorite(id: String, favorite: Boolean) {
        favorites.update { if (favorite) it + id else it - id }
    }
}