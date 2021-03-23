package nz.co.bidone.androidtest.model

import kotlin.math.round
/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class Order(
    val id: Int,
    val description: String,
    val orderDate: String,
    val deliveryDate: String?,
    val products: List<Product>
) {
    // Returns total value of products in order
    fun getOrderTotal(): Double {
        var total = 0.00
        for (item in products) {
            (total + (item.price *  item.quantity)).also { total = it }
        }
       return  round(total * 100) / 100
    }
}
