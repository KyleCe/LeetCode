package algorithm.baseabstract class BaseTestImpl : BaseTest {    override fun less(a: Comparable<*>, b: Comparable<*>): Boolean {        return compareValues(a, b) <= 0    }    override fun exch(a: Array<Comparable<*>>, i: Int, j: Int) {        val tmp = a[i]        a[i] = a[j]        a[j] = tmp    }    override fun sorted(a: Array<Comparable<*>>): Boolean {        for (i in 0 until a.size - 1) {            if (!less(a[i], a[i + 1])) {                return false            }        }        return true    }    protected fun sop(vararg objects: Any) {        for (i in objects.indices) {            print(objects[i])        }        println()    }}