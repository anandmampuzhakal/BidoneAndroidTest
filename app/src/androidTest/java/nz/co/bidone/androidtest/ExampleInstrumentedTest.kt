package nz.co.bidone.androidtest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import nz.co.bidone.androidtest.ui.MainActivity
import org.junit.Rule
import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleInstrumentedTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun productFlowTest() {
        onView(withId(R.id.button_list_of_orders_start)).perform(click())
        onView(withId(R.id.card_list)).perform(ViewActions.swipeUp())
        onView(withId(R.id.card_list)).perform(ViewActions.swipeDown())
        onView(withId(R.id.card_list)).perform(ViewActions.swipeUp())
    }

}