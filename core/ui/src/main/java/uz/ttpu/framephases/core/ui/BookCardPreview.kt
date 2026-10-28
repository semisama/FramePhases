package uz.ttpu.framephases.core.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import uz.ttpu.framephases.core.model.Book

@Preview(showBackground = true)
@Composable
private fun BookCardPreview() {
    FramePhasesTheme {
        BookCard(book = Book("p1", "Kotlin in Action", "Dmitry Jemerov", 3500))
    }
}