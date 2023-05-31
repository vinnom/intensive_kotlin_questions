class CustomArray<T> {
    private var elements: Array<Any?> = arrayOfNulls(10)
    private var size: Int = 0

    fun add(element: T, index: Int = -1) {
        if (index < -1 || index > size) {
            throw IndexOutOfBoundsException("Invalid index")
        }

        if (index == -1 || index == size) {
            // Adiciona no final do array
            if (size == elements.size) {
                elements = elements.copyOf(size * 2)
            }

            elements[size] = element
        } else {
            // Adiciona em uma posição específica
            if (size == elements.size) {
                elements = elements.copyOf(size * 2)
            }

            for (i in size downTo index + 1) {
                elements[i] = elements[i - 1]
            }

            elements[index] = element
        }

        size++
    }


    fun removeAt(index: Int) {
        if (index < 0 || index >= size) {
            throw IndexOutOfBoundsException("Invalid index")
        }

        for (i in index until size - 1) {
            elements[i] = elements[i + 1]
        }

        elements[size - 1] = null
        size--
    }

    fun remove(element: T) {
        val index = elements.indexOf(element)
        if (index == -1) {
            throw NoSuchElementException("Element not found")
        }

        removeAt(index)
    }

    fun contains(element: T): Boolean {
        for (i in 0 until size) {
            if (elements[i] == element) {
                return true
            }
        }
        return false
    }

    fun containsAt(index: Int, element: T): Boolean {
        if (index < 0 || index >= size) {
            throw IndexOutOfBoundsException("Invalid index")
        }

        return elements[index] == element
    }

    fun size(): Int {
        return size
    }
}
