package nl.pvanassen.christmas.tree.animation.{{name}}

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("nl.pvanassen.christmas.tree.animation.{{name}}.animation",
                        "nl.pvanassen.christmas.tree.animation.{{name}}.configuration",
                        "nl.pvanassen.christmas.tree.animation.{{name}}.model",
                        "nl.pvanassen.christmas.tree.animation.{{name}}.controller")
                .mainClass(Application.javaClass)
                .start()
    }
}