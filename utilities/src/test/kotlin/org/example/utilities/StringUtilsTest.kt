package org.example.utilities

import org.junit.Test;

class StringUtilsTest {
    @Test
    fun can_split() {
        val result = StringUtils.split("my dog runs fast")
        println(result.size())
        assert(result.size() == 4)
    }
}
