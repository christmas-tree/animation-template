package nl.pvanassen.christmas.tree.animation.{{lname}}.animation

import nl.pvanassen.christmas.tree.animation.common.model.Animation
import nl.pvanassen.christmas.tree.animation.common.model.TreeModel
import nl.pvanassen.christmas.tree.canvas.Canvas
import javax.inject.Singleton

@Singleton
class {{uname}}(private val canvas: Canvas, private val treeModel:TreeModel): Animation<{{uname}}State> {


    override fun getFrame(seed:Long, frame:Int, nsPerFrame:Int, state:{{uname}}State): ByteArray {
        return canvas.getValues()
    }

    override fun getStateObject(): {{uname}}State {
        return {{uname}}State()
    }
}