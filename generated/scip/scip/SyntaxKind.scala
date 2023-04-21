// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scip.scip

sealed abstract class SyntaxKind(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
  type EnumType = SyntaxKind
  def isUnspecifiedSyntaxKind: _root_.scala.Boolean = false
  def isComment: _root_.scala.Boolean = false
  def isPunctuationDelimiter: _root_.scala.Boolean = false
  def isPunctuationBracket: _root_.scala.Boolean = false
  def isKeyword: _root_.scala.Boolean = false
  def isIdentifierKeyword: _root_.scala.Boolean = false
  def isIdentifierOperator: _root_.scala.Boolean = false
  def isIdentifier: _root_.scala.Boolean = false
  def isIdentifierBuiltin: _root_.scala.Boolean = false
  def isIdentifierNull: _root_.scala.Boolean = false
  def isIdentifierConstant: _root_.scala.Boolean = false
  def isIdentifierMutableGlobal: _root_.scala.Boolean = false
  def isIdentifierParameter: _root_.scala.Boolean = false
  def isIdentifierLocal: _root_.scala.Boolean = false
  def isIdentifierShadowed: _root_.scala.Boolean = false
  def isIdentifierNamespace: _root_.scala.Boolean = false
  def isIdentifierModule: _root_.scala.Boolean = false
  def isIdentifierFunction: _root_.scala.Boolean = false
  def isIdentifierFunctionDefinition: _root_.scala.Boolean = false
  def isIdentifierMacro: _root_.scala.Boolean = false
  def isIdentifierMacroDefinition: _root_.scala.Boolean = false
  def isIdentifierType: _root_.scala.Boolean = false
  def isIdentifierBuiltinType: _root_.scala.Boolean = false
  def isIdentifierAttribute: _root_.scala.Boolean = false
  def isRegexEscape: _root_.scala.Boolean = false
  def isRegexRepeated: _root_.scala.Boolean = false
  def isRegexWildcard: _root_.scala.Boolean = false
  def isRegexDelimiter: _root_.scala.Boolean = false
  def isRegexJoin: _root_.scala.Boolean = false
  def isStringLiteral: _root_.scala.Boolean = false
  def isStringLiteralEscape: _root_.scala.Boolean = false
  def isStringLiteralSpecial: _root_.scala.Boolean = false
  def isStringLiteralKey: _root_.scala.Boolean = false
  def isCharacterLiteral: _root_.scala.Boolean = false
  def isNumericLiteral: _root_.scala.Boolean = false
  def isBooleanLiteral: _root_.scala.Boolean = false
  def isTag: _root_.scala.Boolean = false
  def isTagAttribute: _root_.scala.Boolean = false
  def isTagDelimiter: _root_.scala.Boolean = false
  def companion: _root_.scalapb.GeneratedEnumCompanion[SyntaxKind] = scip.scip.SyntaxKind
  final def asRecognized: _root_.scala.Option[scip.scip.SyntaxKind.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[scip.scip.SyntaxKind.Recognized])
}

object SyntaxKind extends _root_.scalapb.GeneratedEnumCompanion[SyntaxKind] {
  sealed trait Recognized extends SyntaxKind
  implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[SyntaxKind] = this
  
  @SerialVersionUID(0L)
  case object UnspecifiedSyntaxKind extends SyntaxKind(0) with SyntaxKind.Recognized {
    val index = 0
    val name = "UnspecifiedSyntaxKind"
    override def isUnspecifiedSyntaxKind: _root_.scala.Boolean = true
  }
  
  /** Comment, including comment markers and text
    */
  @SerialVersionUID(0L)
  case object Comment extends SyntaxKind(1) with SyntaxKind.Recognized {
    val index = 1
    val name = "Comment"
    override def isComment: _root_.scala.Boolean = true
  }
  
  /** `;` `.` `,`
    */
  @SerialVersionUID(0L)
  case object PunctuationDelimiter extends SyntaxKind(2) with SyntaxKind.Recognized {
    val index = 2
    val name = "PunctuationDelimiter"
    override def isPunctuationDelimiter: _root_.scala.Boolean = true
  }
  
  /** (), {}, [] when used syntactically
    */
  @SerialVersionUID(0L)
  case object PunctuationBracket extends SyntaxKind(3) with SyntaxKind.Recognized {
    val index = 3
    val name = "PunctuationBracket"
    override def isPunctuationBracket: _root_.scala.Boolean = true
  }
  
  /** `if`, `else`, `return`, `class`, etc.
    */
  @SerialVersionUID(0L)
  case object Keyword extends SyntaxKind(4) with SyntaxKind.Recognized {
    val index = 4
    val name = "Keyword"
    override def isKeyword: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  @scala.deprecated(message="Marked as deprecated in proto file", "")
  case object IdentifierKeyword extends SyntaxKind(4) with SyntaxKind.Recognized {
    val index = 5
    val name = "IdentifierKeyword"
    override def isIdentifierKeyword: _root_.scala.Boolean = true
  }
  
  /** `+`, `*`, etc.
    */
  @SerialVersionUID(0L)
  case object IdentifierOperator extends SyntaxKind(5) with SyntaxKind.Recognized {
    val index = 6
    val name = "IdentifierOperator"
    override def isIdentifierOperator: _root_.scala.Boolean = true
  }
  
  /** non-specific catch-all for any identifier not better described elsewhere
    */
  @SerialVersionUID(0L)
  case object Identifier extends SyntaxKind(6) with SyntaxKind.Recognized {
    val index = 7
    val name = "Identifier"
    override def isIdentifier: _root_.scala.Boolean = true
  }
  
  /** Identifiers builtin to the language: `min`, `print` in Python.
    */
  @SerialVersionUID(0L)
  case object IdentifierBuiltin extends SyntaxKind(7) with SyntaxKind.Recognized {
    val index = 8
    val name = "IdentifierBuiltin"
    override def isIdentifierBuiltin: _root_.scala.Boolean = true
  }
  
  /** Identifiers representing `null`-like values: `None` in Python, `nil` in Go.
    */
  @SerialVersionUID(0L)
  case object IdentifierNull extends SyntaxKind(8) with SyntaxKind.Recognized {
    val index = 9
    val name = "IdentifierNull"
    override def isIdentifierNull: _root_.scala.Boolean = true
  }
  
  /** `xyz` in `const xyz = "hello"`
    */
  @SerialVersionUID(0L)
  case object IdentifierConstant extends SyntaxKind(9) with SyntaxKind.Recognized {
    val index = 10
    val name = "IdentifierConstant"
    override def isIdentifierConstant: _root_.scala.Boolean = true
  }
  
  /** `var X = "hello"` in Go
    */
  @SerialVersionUID(0L)
  case object IdentifierMutableGlobal extends SyntaxKind(10) with SyntaxKind.Recognized {
    val index = 11
    val name = "IdentifierMutableGlobal"
    override def isIdentifierMutableGlobal: _root_.scala.Boolean = true
  }
  
  /** Parameter definition and references
    */
  @SerialVersionUID(0L)
  case object IdentifierParameter extends SyntaxKind(11) with SyntaxKind.Recognized {
    val index = 12
    val name = "IdentifierParameter"
    override def isIdentifierParameter: _root_.scala.Boolean = true
  }
  
  /** Identifiers for variable definitions and references within a local scope
    */
  @SerialVersionUID(0L)
  case object IdentifierLocal extends SyntaxKind(12) with SyntaxKind.Recognized {
    val index = 13
    val name = "IdentifierLocal"
    override def isIdentifierLocal: _root_.scala.Boolean = true
  }
  
  /** Identifiers that shadow other identifiers in an outer scope
    */
  @SerialVersionUID(0L)
  case object IdentifierShadowed extends SyntaxKind(13) with SyntaxKind.Recognized {
    val index = 14
    val name = "IdentifierShadowed"
    override def isIdentifierShadowed: _root_.scala.Boolean = true
  }
  
  /** Identifier representing a unit of code abstraction and/or namespacing.
    *
    * NOTE: This corresponds to a package in Go and JVM languages,
    * and a module in languages like Python and JavaScript.
    */
  @SerialVersionUID(0L)
  case object IdentifierNamespace extends SyntaxKind(14) with SyntaxKind.Recognized {
    val index = 15
    val name = "IdentifierNamespace"
    override def isIdentifierNamespace: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  @scala.deprecated(message="Marked as deprecated in proto file", "")
  case object IdentifierModule extends SyntaxKind(14) with SyntaxKind.Recognized {
    val index = 16
    val name = "IdentifierModule"
    override def isIdentifierModule: _root_.scala.Boolean = true
  }
  
  /** Function references, including calls
    */
  @SerialVersionUID(0L)
  case object IdentifierFunction extends SyntaxKind(15) with SyntaxKind.Recognized {
    val index = 17
    val name = "IdentifierFunction"
    override def isIdentifierFunction: _root_.scala.Boolean = true
  }
  
  /** Function definition only
    */
  @SerialVersionUID(0L)
  case object IdentifierFunctionDefinition extends SyntaxKind(16) with SyntaxKind.Recognized {
    val index = 18
    val name = "IdentifierFunctionDefinition"
    override def isIdentifierFunctionDefinition: _root_.scala.Boolean = true
  }
  
  /** Macro references, including invocations
    */
  @SerialVersionUID(0L)
  case object IdentifierMacro extends SyntaxKind(17) with SyntaxKind.Recognized {
    val index = 19
    val name = "IdentifierMacro"
    override def isIdentifierMacro: _root_.scala.Boolean = true
  }
  
  /** Macro definition only
    */
  @SerialVersionUID(0L)
  case object IdentifierMacroDefinition extends SyntaxKind(18) with SyntaxKind.Recognized {
    val index = 20
    val name = "IdentifierMacroDefinition"
    override def isIdentifierMacroDefinition: _root_.scala.Boolean = true
  }
  
  /** non-builtin types
    */
  @SerialVersionUID(0L)
  case object IdentifierType extends SyntaxKind(19) with SyntaxKind.Recognized {
    val index = 21
    val name = "IdentifierType"
    override def isIdentifierType: _root_.scala.Boolean = true
  }
  
  /** builtin types only, such as `str` for Python or `int` in Go
    */
  @SerialVersionUID(0L)
  case object IdentifierBuiltinType extends SyntaxKind(20) with SyntaxKind.Recognized {
    val index = 22
    val name = "IdentifierBuiltinType"
    override def isIdentifierBuiltinType: _root_.scala.Boolean = true
  }
  
  /** Python decorators, c-like __attribute__
    */
  @SerialVersionUID(0L)
  case object IdentifierAttribute extends SyntaxKind(21) with SyntaxKind.Recognized {
    val index = 23
    val name = "IdentifierAttribute"
    override def isIdentifierAttribute: _root_.scala.Boolean = true
  }
  
  /** `&92;b`
    */
  @SerialVersionUID(0L)
  case object RegexEscape extends SyntaxKind(22) with SyntaxKind.Recognized {
    val index = 24
    val name = "RegexEscape"
    override def isRegexEscape: _root_.scala.Boolean = true
  }
  
  /** `*`, `+`
    */
  @SerialVersionUID(0L)
  case object RegexRepeated extends SyntaxKind(23) with SyntaxKind.Recognized {
    val index = 25
    val name = "RegexRepeated"
    override def isRegexRepeated: _root_.scala.Boolean = true
  }
  
  /** `.`
    */
  @SerialVersionUID(0L)
  case object RegexWildcard extends SyntaxKind(24) with SyntaxKind.Recognized {
    val index = 26
    val name = "RegexWildcard"
    override def isRegexWildcard: _root_.scala.Boolean = true
  }
  
  /** `(`, `)`, `[`, `]`
    */
  @SerialVersionUID(0L)
  case object RegexDelimiter extends SyntaxKind(25) with SyntaxKind.Recognized {
    val index = 27
    val name = "RegexDelimiter"
    override def isRegexDelimiter: _root_.scala.Boolean = true
  }
  
  /** `|`, `-`
    */
  @SerialVersionUID(0L)
  case object RegexJoin extends SyntaxKind(26) with SyntaxKind.Recognized {
    val index = 28
    val name = "RegexJoin"
    override def isRegexJoin: _root_.scala.Boolean = true
  }
  
  /** Literal strings: "Hello, world!"
    */
  @SerialVersionUID(0L)
  case object StringLiteral extends SyntaxKind(27) with SyntaxKind.Recognized {
    val index = 29
    val name = "StringLiteral"
    override def isStringLiteral: _root_.scala.Boolean = true
  }
  
  /** non-regex escapes: "&92;t", "&92;n"
    */
  @SerialVersionUID(0L)
  case object StringLiteralEscape extends SyntaxKind(28) with SyntaxKind.Recognized {
    val index = 30
    val name = "StringLiteralEscape"
    override def isStringLiteralEscape: _root_.scala.Boolean = true
  }
  
  /** datetimes within strings, special words within a string, `{}` in format strings
    */
  @SerialVersionUID(0L)
  case object StringLiteralSpecial extends SyntaxKind(29) with SyntaxKind.Recognized {
    val index = 31
    val name = "StringLiteralSpecial"
    override def isStringLiteralSpecial: _root_.scala.Boolean = true
  }
  
  /** "key" in { "key": "value" }, useful for example in JSON
    */
  @SerialVersionUID(0L)
  case object StringLiteralKey extends SyntaxKind(30) with SyntaxKind.Recognized {
    val index = 32
    val name = "StringLiteralKey"
    override def isStringLiteralKey: _root_.scala.Boolean = true
  }
  
  /** 'c' or similar, in languages that differentiate strings and characters
    */
  @SerialVersionUID(0L)
  case object CharacterLiteral extends SyntaxKind(31) with SyntaxKind.Recognized {
    val index = 33
    val name = "CharacterLiteral"
    override def isCharacterLiteral: _root_.scala.Boolean = true
  }
  
  /** Literal numbers, both floats and integers
    */
  @SerialVersionUID(0L)
  case object NumericLiteral extends SyntaxKind(32) with SyntaxKind.Recognized {
    val index = 34
    val name = "NumericLiteral"
    override def isNumericLiteral: _root_.scala.Boolean = true
  }
  
  /** `true`, `false`
    */
  @SerialVersionUID(0L)
  case object BooleanLiteral extends SyntaxKind(33) with SyntaxKind.Recognized {
    val index = 35
    val name = "BooleanLiteral"
    override def isBooleanLiteral: _root_.scala.Boolean = true
  }
  
  /** Used for XML-like tags
    */
  @SerialVersionUID(0L)
  case object Tag extends SyntaxKind(34) with SyntaxKind.Recognized {
    val index = 36
    val name = "Tag"
    override def isTag: _root_.scala.Boolean = true
  }
  
  /** Attribute name in XML-like tags
    */
  @SerialVersionUID(0L)
  case object TagAttribute extends SyntaxKind(35) with SyntaxKind.Recognized {
    val index = 37
    val name = "TagAttribute"
    override def isTagAttribute: _root_.scala.Boolean = true
  }
  
  /** Delimiters for XML-like tags
    */
  @SerialVersionUID(0L)
  case object TagDelimiter extends SyntaxKind(36) with SyntaxKind.Recognized {
    val index = 38
    val name = "TagDelimiter"
    override def isTagDelimiter: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  final case class Unrecognized(unrecognizedValue: _root_.scala.Int) extends SyntaxKind(unrecognizedValue) with _root_.scalapb.UnrecognizedEnum
  lazy val values = scala.collection.immutable.Seq(UnspecifiedSyntaxKind, Comment, PunctuationDelimiter, PunctuationBracket, Keyword, IdentifierKeyword, IdentifierOperator, Identifier, IdentifierBuiltin, IdentifierNull, IdentifierConstant, IdentifierMutableGlobal, IdentifierParameter, IdentifierLocal, IdentifierShadowed, IdentifierNamespace, IdentifierModule, IdentifierFunction, IdentifierFunctionDefinition, IdentifierMacro, IdentifierMacroDefinition, IdentifierType, IdentifierBuiltinType, IdentifierAttribute, RegexEscape, RegexRepeated, RegexWildcard, RegexDelimiter, RegexJoin, StringLiteral, StringLiteralEscape, StringLiteralSpecial, StringLiteralKey, CharacterLiteral, NumericLiteral, BooleanLiteral, Tag, TagAttribute, TagDelimiter)
  def fromValue(__value: _root_.scala.Int): SyntaxKind = __value match {
    case 0 => UnspecifiedSyntaxKind
    case 1 => Comment
    case 2 => PunctuationDelimiter
    case 3 => PunctuationBracket
    case 4 => Keyword
    case 5 => IdentifierOperator
    case 6 => Identifier
    case 7 => IdentifierBuiltin
    case 8 => IdentifierNull
    case 9 => IdentifierConstant
    case 10 => IdentifierMutableGlobal
    case 11 => IdentifierParameter
    case 12 => IdentifierLocal
    case 13 => IdentifierShadowed
    case 14 => IdentifierNamespace
    case 15 => IdentifierFunction
    case 16 => IdentifierFunctionDefinition
    case 17 => IdentifierMacro
    case 18 => IdentifierMacroDefinition
    case 19 => IdentifierType
    case 20 => IdentifierBuiltinType
    case 21 => IdentifierAttribute
    case 22 => RegexEscape
    case 23 => RegexRepeated
    case 24 => RegexWildcard
    case 25 => RegexDelimiter
    case 26 => RegexJoin
    case 27 => StringLiteral
    case 28 => StringLiteralEscape
    case 29 => StringLiteralSpecial
    case 30 => StringLiteralKey
    case 31 => CharacterLiteral
    case 32 => NumericLiteral
    case 33 => BooleanLiteral
    case 34 => Tag
    case 35 => TagAttribute
    case 36 => TagDelimiter
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = ScipProto.javaDescriptor.getEnumTypes().get(3)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = ScipProto.scalaDescriptor.enums(3)
}