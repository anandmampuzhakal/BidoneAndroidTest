package nz.co.bidone.androidtest.repository

import androidx.lifecycle.MutableLiveData
import nz.co.bidone.androidtest.model.Order
import nz.co.bidone.androidtest.model.Product
/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
object ProductAPIRepository {

    private val PRODUCT_1 = Product(
        136341,
        "Chicken Balls Garlic",
        "Caterer's Choice",
        15.47,
        2.0
    )
    private val PRODUCT_2 = Product(
        172488,
        "Beef Rump G/Fed",
        "Meat",
        17.87,
        3.2
    )
    private val PRODUCT_3 = Product(
        58220,
        "Tomato Puree",
        "null",
        8.28,
        1.0
    )
    private val PRODUCT_4 = Product(
        183968,
        "Chips 10mm French Fries Straight Cut",
        "Jeffersons",
        26.10,
        1.0
    )
    private val PRODUCT_5 = Product(
        64996,
        "Chocolate Buttons Milk",
        "Caterers Choice",
        10.14,
        5.0
    )


    fun getMutableLiveData(): MutableLiveData<List<Order>> {
        val mutableLiveData = MutableLiveData<List<Order>>()

        mutableLiveData.value = listOf(
            Order(
                4937,
                "Friday Order",
                "2020-09-25",
                "2020-09-26",
                listOf(PRODUCT_1, PRODUCT_3)
            ),
            Order(
                1804,
                "Meats",
                "2020-08-11",
                "2020-08-12",
                listOf(PRODUCT_1, PRODUCT_2)
            ),
            Order(
                9639,
                "Chocolate",
                "2020-11-02",
                "2020-11-03",
                listOf(PRODUCT_5)
            ),
            Order(
                2709,
                "Big Order",
                "2020-06-09",
                "2020-06-10",
                listOf(PRODUCT_1, PRODUCT_2, PRODUCT_3, PRODUCT_4, PRODUCT_5)
            )
        )

        return mutableLiveData
    }
}