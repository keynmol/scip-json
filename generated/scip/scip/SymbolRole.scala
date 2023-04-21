// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scip.scip

/** SymbolRole declares what "role" a symbol has in an occurrence.  A role is
  * encoded as a bitset where each bit represents a different role. For example,
  * to determine if the `Import` role is set, test whether the second bit of the
  * enum value is defined. In pseudocode, this can be implemented with the
  * logic: `const isImportRole = (role.value &amp; SymbolRole.Import.value) &gt; 0`.
  */
sealed abstract class SymbolRole(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
  type EnumType = SymbolRole
  def isUnspecifiedSymbolRole: _root_.scala.Boolean = false
  def isDefinition: _root_.scala.Boolean = false
  def isImport: _root_.scala.Boolean = false
  def isWriteAccess: _root_.scala.Boolean = false
  def isReadAccess: _root_.scala.Boolean = false
  def isGenerated: _root_.scala.Boolean = false
  def isTest: _root_.scala.Boolean = false
  def companion: _root_.scalapb.GeneratedEnumCompanion[SymbolRole] = scip.scip.SymbolRole
  final def asRecognized: _root_.scala.Option[scip.scip.SymbolRole.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[scip.scip.SymbolRole.Recognized])
}

object SymbolRole extends _root_.scalapb.GeneratedEnumCompanion[SymbolRole] {
  sealed trait Recognized extends SymbolRole
  implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[SymbolRole] = this
  
  /** This case is not meant to be used; it only exists to avoid an error
    * from the Protobuf code generator.
    */
  @SerialVersionUID(0L)
  case object UnspecifiedSymbolRole extends SymbolRole(0) with SymbolRole.Recognized {
    val index = 0
    val name = "UnspecifiedSymbolRole"
    override def isUnspecifiedSymbolRole: _root_.scala.Boolean = true
  }
  
  /** Is the symbol defined here? If not, then this is a symbol reference.
    */
  @SerialVersionUID(0L)
  case object Definition extends SymbolRole(1) with SymbolRole.Recognized {
    val index = 1
    val name = "Definition"
    override def isDefinition: _root_.scala.Boolean = true
  }
  
  /** Is the symbol imported here?
    */
  @SerialVersionUID(0L)
  case object Import extends SymbolRole(2) with SymbolRole.Recognized {
    val index = 2
    val name = "Import"
    override def isImport: _root_.scala.Boolean = true
  }
  
  /** Is the symbol written here?
    */
  @SerialVersionUID(0L)
  case object WriteAccess extends SymbolRole(4) with SymbolRole.Recognized {
    val index = 3
    val name = "WriteAccess"
    override def isWriteAccess: _root_.scala.Boolean = true
  }
  
  /** Is the symbol read here?
    */
  @SerialVersionUID(0L)
  case object ReadAccess extends SymbolRole(8) with SymbolRole.Recognized {
    val index = 4
    val name = "ReadAccess"
    override def isReadAccess: _root_.scala.Boolean = true
  }
  
  /** Is the symbol in generated code?
    */
  @SerialVersionUID(0L)
  case object Generated extends SymbolRole(16) with SymbolRole.Recognized {
    val index = 5
    val name = "Generated"
    override def isGenerated: _root_.scala.Boolean = true
  }
  
  /** Is the symbol in test code?
    */
  @SerialVersionUID(0L)
  case object Test extends SymbolRole(32) with SymbolRole.Recognized {
    val index = 6
    val name = "Test"
    override def isTest: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  final case class Unrecognized(unrecognizedValue: _root_.scala.Int) extends SymbolRole(unrecognizedValue) with _root_.scalapb.UnrecognizedEnum
  lazy val values = scala.collection.immutable.Seq(UnspecifiedSymbolRole, Definition, Import, WriteAccess, ReadAccess, Generated, Test)
  def fromValue(__value: _root_.scala.Int): SymbolRole = __value match {
    case 0 => UnspecifiedSymbolRole
    case 1 => Definition
    case 2 => Import
    case 4 => WriteAccess
    case 8 => ReadAccess
    case 16 => Generated
    case 32 => Test
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = ScipProto.javaDescriptor.getEnumTypes().get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = ScipProto.scalaDescriptor.enums(2)
}