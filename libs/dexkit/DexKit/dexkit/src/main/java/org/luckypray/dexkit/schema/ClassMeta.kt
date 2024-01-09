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
internal class `-ClassMeta` : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : `-ClassMeta` {
        __init(_i, _bb)
        return this
    }
    val id : UInt
        get() {
            val o = __offset(4)
            return if(o != 0) bb.getInt(o + bb_pos).toUInt() else 0u
        }
    fun mutateId(id: UInt) : Boolean {
        val o = __offset(4)
        return if (o != 0) {
            bb.putInt(o + bb_pos, id.toInt())
            true
        } else {
            false
        }
    }
    val dexId : UInt
        get() {
            val o = __offset(6)
            return if(o != 0) bb.getInt(o + bb_pos).toUInt() else 0u
        }
    fun mutateDexId(dexId: UInt) : Boolean {
        val o = __offset(6)
        return if (o != 0) {
            bb.putInt(o + bb_pos, dexId.toInt())
            true
        } else {
            false
        }
    }
    val sourceFile : String?
        get() {
            val o = __offset(8)
            return if (o != 0) {
                __string(o + bb_pos)
            } else {
                null
            }
        }
    val sourceFileAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(8, 1)
    fun sourceFileInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 8, 1)
    val accessFlags : UInt
        get() {
            val o = __offset(10)
            return if(o != 0) bb.getInt(o + bb_pos).toUInt() else 0u
        }
    fun mutateAccessFlags(accessFlags: UInt) : Boolean {
        val o = __offset(10)
        return if (o != 0) {
            bb.putInt(o + bb_pos, accessFlags.toInt())
            true
        } else {
            false
        }
    }
    val dexDescriptor : String?
        get() {
            val o = __offset(12)
            return if (o != 0) {
                __string(o + bb_pos)
            } else {
                null
            }
        }
    val dexDescriptorAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(12, 1)
    fun dexDescriptorInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 12, 1)
    val superClass : UInt
        get() {
            val o = __offset(14)
            return if(o != 0) bb.getInt(o + bb_pos).toUInt() else 0u
        }
    fun mutateSuperClass(superClass: UInt) : Boolean {
        val o = __offset(14)
        return if (o != 0) {
            bb.putInt(o + bb_pos, superClass.toInt())
            true
        } else {
            false
        }
    }
    fun interfaces(j: Int) : Int {
        val o = __offset(16)
        return if (o != 0) {
            bb.getInt(__vector(o) + j * 4)
        } else {
            0
        }
    }
    val interfacesLength : Int
        get() {
            val o = __offset(16); return if (o != 0) __vector_len(o) else 0
        }
    val interfacesAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(16, 4)
    fun interfacesInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 16, 4)
    fun mutateInterfaces(j: Int, interfaces: Int) : Boolean {
        val o = __offset(16)
        return if (o != 0) {
            bb.putInt(__vector(o) + j * 4, interfaces)
            true
        } else {
            false
        }
    }
    fun methods(j: Int) : Int {
        val o = __offset(18)
        return if (o != 0) {
            bb.getInt(__vector(o) + j * 4)
        } else {
            0
        }
    }
    val methodsLength : Int
        get() {
            val o = __offset(18); return if (o != 0) __vector_len(o) else 0
        }
    val methodsAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(18, 4)
    fun methodsInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 18, 4)
    fun mutateMethods(j: Int, methods: Int) : Boolean {
        val o = __offset(18)
        return if (o != 0) {
            bb.putInt(__vector(o) + j * 4, methods)
            true
        } else {
            false
        }
    }
    fun fields(j: Int) : Int {
        val o = __offset(20)
        return if (o != 0) {
            bb.getInt(__vector(o) + j * 4)
        } else {
            0
        }
    }
    val fieldsLength : Int
        get() {
            val o = __offset(20); return if (o != 0) __vector_len(o) else 0
        }
    val fieldsAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(20, 4)
    fun fieldsInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 20, 4)
    fun mutateFields(j: Int, fields: Int) : Boolean {
        val o = __offset(20)
        return if (o != 0) {
            bb.putInt(__vector(o) + j * 4, fields)
            true
        } else {
            false
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_23_5_26()
        fun getRootAsClassMeta(_bb: ByteBuffer): `-ClassMeta` = getRootAsClassMeta(_bb, `-ClassMeta`())
        fun getRootAsClassMeta(_bb: ByteBuffer, obj: `-ClassMeta`): `-ClassMeta` {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createClassMeta(builder: FlatBufferBuilder, id: UInt, dexId: UInt, sourceFileOffset: Int, accessFlags: UInt, dexDescriptorOffset: Int, superClass: UInt, interfacesOffset: Int, methodsOffset: Int, fieldsOffset: Int) : Int {
            builder.startTable(9)
            addFields(builder, fieldsOffset)
            addMethods(builder, methodsOffset)
            addInterfaces(builder, interfacesOffset)
            addSuperClass(builder, superClass)
            addDexDescriptor(builder, dexDescriptorOffset)
            addAccessFlags(builder, accessFlags)
            addSourceFile(builder, sourceFileOffset)
            addDexId(builder, dexId)
            addId(builder, id)
            return endClassMeta(builder)
        }
        fun startClassMeta(builder: FlatBufferBuilder) = builder.startTable(9)
        fun addId(builder: FlatBufferBuilder, id: UInt) = builder.addInt(0, id.toInt(), 0)
        fun addDexId(builder: FlatBufferBuilder, dexId: UInt) = builder.addInt(1, dexId.toInt(), 0)
        fun addSourceFile(builder: FlatBufferBuilder, sourceFile: Int) = builder.addOffset(2, sourceFile, 0)
        fun addAccessFlags(builder: FlatBufferBuilder, accessFlags: UInt) = builder.addInt(3, accessFlags.toInt(), 0)
        fun addDexDescriptor(builder: FlatBufferBuilder, dexDescriptor: Int) = builder.addOffset(4, dexDescriptor, 0)
        fun addSuperClass(builder: FlatBufferBuilder, superClass: UInt) = builder.addInt(5, superClass.toInt(), 0)
        fun addInterfaces(builder: FlatBufferBuilder, interfaces: Int) = builder.addOffset(6, interfaces, 0)
        fun createInterfacesVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addInt(data[i])
            }
            return builder.endVector()
        }
        fun startInterfacesVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun addMethods(builder: FlatBufferBuilder, methods: Int) = builder.addOffset(7, methods, 0)
        fun createMethodsVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addInt(data[i])
            }
            return builder.endVector()
        }
        fun startMethodsVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun addFields(builder: FlatBufferBuilder, fields: Int) = builder.addOffset(8, fields, 0)
        fun createFieldsVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addInt(data[i])
            }
            return builder.endVector()
        }
        fun startFieldsVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun endClassMeta(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}