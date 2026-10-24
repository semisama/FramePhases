package uz.ttpu.framephases.core.util

import uz.ttpu.framephases.core.model.Book

fun Book.displayPrice(): String = PriceFormatter.format(priceCents)