package uz.ttpu.framephases.data.books.impl

import uz.ttpu.framephases.data.books.api.BookRepository

object BooksDataModule {
    fun provideRepository(): BookRepository =
        InMemoryBookRepository(BookLocalDataSource())
}