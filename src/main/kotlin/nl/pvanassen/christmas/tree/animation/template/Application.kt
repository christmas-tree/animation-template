package nl.pvanassen.christmas.tree.animation.{{lname}}

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("nl.pvanassen.christmas.tree.animation.{{lname}}.animation")
                .mainClass(Application.javaClass)
                .start()
    }
}