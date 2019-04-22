package com.willowtreeapps.assertk.bug

enum class Option {
	ONE, TWO, THREE, FOUR, FIVE;

	companion object {
		fun getCompatibleOptions(): List<String> {
			return listOf( ONE, TWO, THREE ).map(Option::name)
		}
	}
}
