import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CustomArrayTest {

    @Test
    fun `test adicionar elemento em um array vazio`() {
        val customArray = CustomArray<Int>()
        customArray.add(10)

        assertEquals(1, customArray.size())
        assertTrue(customArray.contains(10))
    }

    @Test
    fun `test adicionar na próxima posição disponível de um array`() {
        val customArray = CustomArray<Int>()
        customArray.add(10)
        customArray.add(20)

        assertEquals(2, customArray.size())
        assertTrue(customArray.contains(10))
        assertTrue(customArray.contains(20))
    }

    @Test
    fun `test adicionar no início de um array com todas posições alocadas`() {
        val customArray = CustomArray<Int>()
        customArray.add(10)
        customArray.add(20)
        customArray.add(30, 0)

        assertEquals(3, customArray.size())
        assertTrue(customArray.contains(10))
        assertTrue(customArray.contains(20))
        assertTrue(customArray.contains(30))
    }

    @Test
    fun `test adicionar no final de um array com todas as posições alocadas`() {
        val customArray = CustomArray<Int>()
        for (i in 0 until 10) {
            customArray.add(i)
        }
        customArray.add(10)

        assertEquals(11, customArray.size())
        assertTrue(customArray.contains(10))
    }

    @Test
    fun `test adicionar no meio de um array com todas as posições alocadas`() {
        val customArray = CustomArray<Int>()
        for (i in 0 until 10) {
            customArray.add(i)
        }
        customArray.add(99, 5)

        assertEquals(11, customArray.size())
        assertTrue(customArray.contains(99))
    }

        @Test
    fun `test remover elemento de uma lista vazia`() {
        val customArray = CustomArray<Int>()

        assertThrows(NoSuchElementException::class.java) {
            customArray.removeElement(10)
        }
    }

    @Test
    fun `test remover elemento no começo da lista`() {
        val customArray = CustomArray<Int>()
        customArray.add(10)
        customArray.add(20)

        customArray.removeElement(10)

        assertEquals(1, customArray.size())
        assertFalse(customArray.contains(10))
        assertTrue(customArray.contains(20))
    }

    @Test
    fun `test remover elemento no final da lista`() {
        val customArray = CustomArray<Int>()
        customArray.add(10)
        customArray.add(20)

        customArray.removeElement(20)

        assertEquals(1, customArray.size())
        assertTrue(customArray.contains(10))
        assertFalse(customArray.contains(20))
    }

    @Test
    fun `test remover em uma posição não existente na lista`() {
        val customArray = CustomArray<Int>()
        customArray.add(10)
        customArray.add(20)

        assertThrows(IndexOutOfBoundsException::class.java) {
            customArray.removeAt(2)
        }
    }

    @Test
    fun `test remover elemento na primeira posição em uma lista cheia`() {
        val customArray = CustomArray<Int>()
        customArray.add(10)
        customArray.add(20)
        customArray.add(30)

        customArray.removeAt(0)

        assertEquals(2, customArray.size())
        assertFalse(customArray.contains(10))
        assertTrue(customArray.contains(20))
        assertTrue(customArray.contains(30))
    }

    @Test
    fun `test remover elemento na última posição em uma lista cheia`() {
        val customArray = CustomArray<Int>()
        customArray.add(10)
        customArray.add(20)
        customArray.add(30)

        customArray.removeAt(2)

        assertEquals(2, customArray.size())
        assertTrue(customArray.contains(10))
        assertTrue(customArray.contains(20))
        assertFalse(customArray.contains(30))
    }

    @Test
    fun `test remover elemento em uma posição intermediária em uma lista cheia`() {
        val customArray = CustomArray<Int>()
        customArray.add(10)
        customArray.add(20)
        customArray.add(30)
        customArray.add(40)

        customArray.removeAt(1)

        assertEquals(3, customArray.size())
        assertTrue(customArray.contains(10))
        assertFalse(customArray.contains(20))
        assertTrue(customArray.contains(30))
        assertTrue(customArray.contains(40))
    }

    @Test
    fun `test remover elemento na única posição de uma lista que não está cheia`() {
        val customArray = CustomArray<Int>()
        customArray.add(10)

        customArray.removeAt(0)

        assertEquals(0, customArray.size())
        assertFalse(customArray.contains(10))
    }

        @Test
    fun `testar se contém elemento em uma lista vazia`() {
        val customArray = CustomArray<Int>()

        assertFalse(customArray.contains(10))
    }

    @Test
    fun `testar se contém elemento em uma lista com elemento no começo`() {
        val customArray = CustomArray<Int>()
        customArray.add(10)
        customArray.add(20)

        assertTrue(customArray.contains(10))
    }

    @Test
    fun `testar se contém elemento em uma lista com elemento no final`() {
        val customArray = CustomArray<Int>()
        customArray.add(10)
        customArray.add(20)

        assertTrue(customArray.contains(20))
    }

    @Test
    fun `testar se contém elemento em uma posição específica em uma lista vazia`() {
        val customArray = CustomArray<Int>()

        assertFalse(customArray.containsAt(0))
    }

    @Test
    fun `testar se contém elemento em uma posição específica em uma lista com elemento na primeira posição`() {
        val customArray = CustomArray<Int>()
        customArray.add(10)
        customArray.add(20)

        assertTrue(customArray.containsAt(0))
    }

    @Test
    fun `testar se contém elemento em uma posição específica em uma lista com elemento na última posição`() {
        val customArray = CustomArray<Int>()
        customArray.add(10)
        customArray.add(20)

        assertTrue(customArray.containsAt(1))
    }
}
}
