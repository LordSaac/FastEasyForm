package com.creativity.dev.formsimple

import androidx.test.core.app.ActivityScenario
import org.junit.runner.RunWith
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ToolsUnitTest {

    private lateinit var scenario: ActivityScenario<UnitTestActivity>

    @Before
    fun setUp() {

        scenario = ActivityScenario.launch(UnitTestActivity::class.java)

        scenario.onActivity { activity ->

            val result = activity.init()

            // Perform assertions on the result
            Assert.assertEquals(true,result)
        }
    }


    @Test
    fun validateAll_isCorrect() {

        // Retrieve the activity instance from the scenario
        scenario.onActivity { activity ->

            val result = activity.validateAll()

            // Perform assertions on the result
            Assert.assertEquals(activity.success,result)
        }
    }

    @Test
    fun validateByTag_isCorrect() {

        // Retrieve the activity instance from the scenario
        scenario.onActivity { activity ->

            val result = activity.validateByTag()

            // Perform assertions on the result
            Assert.assertEquals(activity.success,result)
        }
    }

    @Test
    fun resultByTag_isCorrect() {

        // Retrieve the activity instance from the scenario
        scenario.onActivity { activity ->

            val result = activity.resultByTag()

            // Perform assertions on the result
            Assert.assertEquals(activity.success,result)
        }
    }

    @Test
    fun getResultAll_isCorrect() {

        // Retrieve the activity instance from the scenario
        scenario.onActivity { activity ->

            val result = activity.getResultAll()

            // Perform assertions on the result
            Assert.assertEquals(activity.success,result)
        }
    }

    @Test
    fun updateRows_isCorrect() {

        // Retrieve the activity instance from the scenario
        scenario.onActivity { activity ->

            val result = activity.updateRow()

            // Perform assertions on the result
            Assert.assertEquals(activity.success,result)
        }
    }

    @After
    fun tearDown() {

        scenario.close()

    }

}