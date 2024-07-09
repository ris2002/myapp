package com.example.myapplication

package com.example.myapplication
object Singleton {
    private var instance: Singleton? = null
    @kotlin.jvm.Synchronized
    private fun createInstance() {
        if (instance == null) {
            instance = Singleton()
        }
    }

    fun getInstance(): Singleton? {
        if (instance == null) createInstance()
        return instance
    }
}