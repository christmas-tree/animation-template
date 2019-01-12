package nl.pvanassen.christmas.tree.animation.{{name}}.animation

import nl.pvanassen.christmas.tree.animation.common.model.Animation
import nl.pvanassen.christmas.tree.animation.common.model.TreeModel
import nl.pvanassen.christmas.tree.canvas.Canvas
import javax.inject.Singleton

@Singleton
class {{name}}(private val canvas: Canvas, private val treeModel:TreeModel): Animation<{{name}}State> {


    override fun getFrame(seed:Long, frame:Int, nsPerFrame:Int, state:{{name}}State): ByteArray {
        return canvas.getValues()
    }

    override fun getStateObject(): {{name}}State {
        return {{name}}State()
    }
}