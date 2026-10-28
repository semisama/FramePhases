package uz.ttpu.framephases.feature.catalog

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uz.ttpu.framephases.data.books.api.BookRepository

@Composable
fun CatalogRoute(
    repository: BookRepository,
    onBookClick: (String) -> Unit,
) {
    Column(Modifier.padding(16.dp)) {
        Text("Catalog (placeholder)")
        Button(onClick = { onBookClick("b1") }) { Text("Open book b1") }
    }
}