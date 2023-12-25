package org.example

data class ArchitectureContext(
    val layer: Layer,
    val feature: Feature,
) {
    interface Layer {
        val name: String
    }
    interface Feature {
        val name: String
    }
    fun getPath(
        separator: String = ""
    ): String = layer.name + separator + feature.name
}
