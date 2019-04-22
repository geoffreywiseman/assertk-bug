package com.willowtreeapps.assertk.bug

import assertk.assertThat
import assertk.assertions.containsExactly
import org.junit.Test

class OptionTest {

	@Test
	fun testCompatibility() {
		val expectedValues = arrayOf( "ONE", "TWO" )
		assertThat(Option.getCompatibleOptions()).containsExactly(*expectedValues)
	}
}
