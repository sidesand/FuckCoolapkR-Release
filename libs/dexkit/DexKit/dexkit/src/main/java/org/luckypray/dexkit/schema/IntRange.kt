// automatically generated by the FlatBuffers compiler, do not modify

package org.luckypray.dexkit.schema

import com.google.flatbuffers.BaseVector
import com.google.flatbuffers.BooleanVector
import com.google.flatbuffers.ByteVector
import com.google.flatbuffers.Constants
import com.google.flatbuffers.DoubleVector
import com.google.flatbuffers.FlatBufferBuilder
import com.google.flatbuffers.FloatVector
import com.google.flatbuffers.LongVector
import com.google.flatbuffers.StringVector
import com.google.flatbuffers.Struct
import com.google.flatbuffers.Table
import com.google.flatbuffers.UnionVector
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.math.sign

@Suppress("unused")
internal class `-IntRange` : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : `-IntRange` {
        __init(_i, _bb)
        return this
    }
    val min : Int
        get() {
            val o = __offset(4)
            return if(o != 0) bb.getInt(o + bb_pos) else 0
        }
    fun mutateMin(min: Int) : Boolean {
        val o = __offset(4)
        return if (o != 0) {
            bb.putInt(o + bb_pos, min)
            true
        } else {
            false
        }
    }
    val max : Int
        get() {
            val o = __offset(6)
            return if(o != 0) bb.getInt(o + bb_pos) else 0
        }
    fun mutateMax(max: Int) : Boolean {
        val o = __offset(6)
        return if (o != 0) {
            bb.putInt(o + bb_pos, max)
            true
        } else {
            false
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_23_5_26()
        fun getRootAsIntRange(_bb: ByteBuffer): `-IntRange` = getRootAsIntRange(_bb, `-IntRange`())
        fun getRootAsIntRange(_bb: ByteBuffer, obj: `-IntRange`): `-IntRange` {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createIntRange(builder: FlatBufferBuilder, min: Int, max: Int) : Int {
            builder.startTable(2)
            addMax(builder, max)
            addMin(builder, min)
            return endIntRange(builder)
        }
        fun startIntRange(builder: FlatBufferBuilder) = builder.startTable(2)
        fun addMin(builder: FlatBufferBuilder, min: Int) = builder.addInt(0, min, 0)
        fun addMax(builder: FlatBufferBuilder, max: Int) = builder.addInt(1, max, 0)
        fun endIntRange(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}