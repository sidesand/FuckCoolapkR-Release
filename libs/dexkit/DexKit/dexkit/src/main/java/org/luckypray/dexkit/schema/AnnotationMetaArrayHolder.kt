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
internal class `-AnnotationMetaArrayHolder` : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : `-AnnotationMetaArrayHolder` {
        __init(_i, _bb)
        return this
    }
    fun annotations(j: Int) : `-AnnotationMeta`? = annotations(`-AnnotationMeta`(), j)
    fun annotations(obj: `-AnnotationMeta`, j: Int) : `-AnnotationMeta`? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(__indirect(__vector(o) + j * 4), bb)
        } else {
            null
        }
    }
    val annotationsLength : Int
        get() {
            val o = __offset(4); return if (o != 0) __vector_len(o) else 0
        }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_23_5_26()
        fun getRootAsAnnotationMetaArrayHolder(_bb: ByteBuffer): `-AnnotationMetaArrayHolder` = getRootAsAnnotationMetaArrayHolder(_bb, `-AnnotationMetaArrayHolder`())
        fun getRootAsAnnotationMetaArrayHolder(_bb: ByteBuffer, obj: `-AnnotationMetaArrayHolder`): `-AnnotationMetaArrayHolder` {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createAnnotationMetaArrayHolder(builder: FlatBufferBuilder, annotationsOffset: Int) : Int {
            builder.startTable(1)
            addAnnotations(builder, annotationsOffset)
            return endAnnotationMetaArrayHolder(builder)
        }
        fun startAnnotationMetaArrayHolder(builder: FlatBufferBuilder) = builder.startTable(1)
        fun addAnnotations(builder: FlatBufferBuilder, annotations: Int) = builder.addOffset(0, annotations, 0)
        fun createAnnotationsVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        fun startAnnotationsVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun endAnnotationMetaArrayHolder(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}