package uz.ttpu.framephases.core.util

import org.junit.Assert
import org.junit.Test
import uz.ttpu.framephases.core.util.PriceFormatter

class PriceFormatterTest {

    @Test
    fun formatsWholeDollars() {
        Assert.assertEquals("\$35.00", PriceFormatter.format(3500))
    }

    @Test
    fun padsSingleDigitCents() {
        Assert.assertEquals("\$12.05", PriceFormatter.format(1205))
    }

    @Test
    fun formatsZero() {
        Assert.assertEquals("\$0.00", PriceFormatter.format(0))
    }
    @Test
    fun formatsNinetyNineCents() {
        Assert.assertEquals("\$0.99", PriceFormatter.format(99))
    }
}