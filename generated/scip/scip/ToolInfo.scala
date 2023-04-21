// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scip.scip

/** @param name
  *   Name of the indexer that produced this index.
  * @param version
  *   Version of the indexer that produced this index.
  * @param arguments
  *   Command-line arguments that were used to invoke this indexer.
  */
@SerialVersionUID(0L)
final case class ToolInfo(
    name: _root_.scala.Predef.String = "",
    version: _root_.scala.Predef.String = "",
    arguments: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[ToolInfo] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = version
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      arguments.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
      }
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = name
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = version
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      arguments.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def withName(__v: _root_.scala.Predef.String): ToolInfo = copy(name = __v)
    def withVersion(__v: _root_.scala.Predef.String): ToolInfo = copy(version = __v)
    def clearArguments = copy(arguments = _root_.scala.Seq.empty)
    def addArguments(__vs: _root_.scala.Predef.String *): ToolInfo = addAllArguments(__vs)
    def addAllArguments(__vs: Iterable[_root_.scala.Predef.String]): ToolInfo = copy(arguments = arguments ++ __vs)
    def withArguments(__v: _root_.scala.Seq[_root_.scala.Predef.String]): ToolInfo = copy(arguments = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = version
          if (__t != "") __t else null
        }
        case 3 => arguments
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PString(version)
        case 3 => _root_.scalapb.descriptors.PRepeated(arguments.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: scip.scip.ToolInfo.type = scip.scip.ToolInfo
    // @@protoc_insertion_point(GeneratedMessage[scip.ToolInfo])
}

object ToolInfo extends scalapb.GeneratedMessageCompanion[scip.scip.ToolInfo] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scip.scip.ToolInfo] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): scip.scip.ToolInfo = {
    var __name: _root_.scala.Predef.String = ""
    var __version: _root_.scala.Predef.String = ""
    val __arguments: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __name = _input__.readStringRequireUtf8()
        case 18 =>
          __version = _input__.readStringRequireUtf8()
        case 26 =>
          __arguments += _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    scip.scip.ToolInfo(
        name = __name,
        version = __version,
        arguments = __arguments.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scip.scip.ToolInfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      scip.scip.ToolInfo(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        version = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        arguments = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ScipProto.javaDescriptor.getMessageTypes().get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ScipProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scip.scip.ToolInfo(
    name = "",
    version = "",
    arguments = _root_.scala.Seq.empty
  )
  implicit class ToolInfoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scip.scip.ToolInfo]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scip.scip.ToolInfo](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def version: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.version)((c_, f_) => c_.copy(version = f_))
    def arguments: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.arguments)((c_, f_) => c_.copy(arguments = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val VERSION_FIELD_NUMBER = 2
  final val ARGUMENTS_FIELD_NUMBER = 3
  def of(
    name: _root_.scala.Predef.String,
    version: _root_.scala.Predef.String,
    arguments: _root_.scala.Seq[_root_.scala.Predef.String]
  ): _root_.scip.scip.ToolInfo = _root_.scip.scip.ToolInfo(
    name,
    version,
    arguments
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[scip.ToolInfo])
}
