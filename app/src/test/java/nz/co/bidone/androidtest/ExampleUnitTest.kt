package nz.co.bidone.androidtest

import nz.co.bidone.androidtest.viewmodel.MainActivityViewModel
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private lateinit var mainActivityViewModel : MainActivityViewModel
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

}