package uz.ttpu.framephases.core.util

object PriceFormatter {
    fun format(priceCents: Int): String {
        val dollars = priceCents / 100
        val cents = priceCents % 100
        return "\$$dollars.${cents.toString().padStart(2, '0')}"
    }
}