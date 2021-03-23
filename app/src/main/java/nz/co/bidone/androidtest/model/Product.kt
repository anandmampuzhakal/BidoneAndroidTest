package nz.co.bidone.androidtest.model

import androidx.annotation.Nullable
/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
data class Product(
    val productCode: Int,
    val description: String,
    @Nullable
    val brand: String,
    val price: Double,
    val quantity: Double
)
