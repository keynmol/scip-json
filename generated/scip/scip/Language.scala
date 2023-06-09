// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scip.scip

/** Language standardises names of common programming languages that can be used
  * for the `Document.language` field. The primary purpose of this enum is to
  * prevent a situation where we have a single programming language ends up with
  * multiple string representations. For example, the C++ language uses the name
  * "CPlusPlus" in this enum and other names such as "cpp" are incompatible.
  * Feel free to send a pull-request to add missing programming languages.
  */
sealed abstract class Language(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
  type EnumType = Language
  def isUnspecifiedLanguage: _root_.scala.Boolean = false
  def isAbap: _root_.scala.Boolean = false
  def isApl: _root_.scala.Boolean = false
  def isAda: _root_.scala.Boolean = false
  def isAgda: _root_.scala.Boolean = false
  def isAsciiDoc: _root_.scala.Boolean = false
  def isAssembly: _root_.scala.Boolean = false
  def isAwk: _root_.scala.Boolean = false
  def isBat: _root_.scala.Boolean = false
  def isBibTeX: _root_.scala.Boolean = false
  def isC: _root_.scala.Boolean = false
  def isCobol: _root_.scala.Boolean = false
  def isCpp: _root_.scala.Boolean = false
  def isCss: _root_.scala.Boolean = false
  def isCsharp: _root_.scala.Boolean = false
  def isClojure: _root_.scala.Boolean = false
  def isCoffeescript: _root_.scala.Boolean = false
  def isCommonLisp: _root_.scala.Boolean = false
  def isCoq: _root_.scala.Boolean = false
  def isDart: _root_.scala.Boolean = false
  def isDelphi: _root_.scala.Boolean = false
  def isDiff: _root_.scala.Boolean = false
  def isDockerfile: _root_.scala.Boolean = false
  def isDyalog: _root_.scala.Boolean = false
  def isElixir: _root_.scala.Boolean = false
  def isErlang: _root_.scala.Boolean = false
  def isFsharp: _root_.scala.Boolean = false
  def isFish: _root_.scala.Boolean = false
  def isFlow: _root_.scala.Boolean = false
  def isFortran: _root_.scala.Boolean = false
  def isGitCommit: _root_.scala.Boolean = false
  def isGitConfig: _root_.scala.Boolean = false
  def isGitRebase: _root_.scala.Boolean = false
  def isGo: _root_.scala.Boolean = false
  def isGroovy: _root_.scala.Boolean = false
  def isHtml: _root_.scala.Boolean = false
  def isHack: _root_.scala.Boolean = false
  def isHandlebars: _root_.scala.Boolean = false
  def isHaskell: _root_.scala.Boolean = false
  def isIdris: _root_.scala.Boolean = false
  def isIni: _root_.scala.Boolean = false
  def isJ: _root_.scala.Boolean = false
  def isJson: _root_.scala.Boolean = false
  def isJava: _root_.scala.Boolean = false
  def isJavaScript: _root_.scala.Boolean = false
  def isJavaScriptReact: _root_.scala.Boolean = false
  def isJsonnet: _root_.scala.Boolean = false
  def isJulia: _root_.scala.Boolean = false
  def isKotlin: _root_.scala.Boolean = false
  def isLaTeX: _root_.scala.Boolean = false
  def isLean: _root_.scala.Boolean = false
  def isLess: _root_.scala.Boolean = false
  def isLua: _root_.scala.Boolean = false
  def isMakefile: _root_.scala.Boolean = false
  def isMarkdown: _root_.scala.Boolean = false
  def isMatlab: _root_.scala.Boolean = false
  def isNix: _root_.scala.Boolean = false
  def isOcaml: _root_.scala.Boolean = false
  def isObjectiveC: _root_.scala.Boolean = false
  def isObjectiveCpp: _root_.scala.Boolean = false
  def isPhp: _root_.scala.Boolean = false
  def isPlsql: _root_.scala.Boolean = false
  def isPerl: _root_.scala.Boolean = false
  def isPowerShell: _root_.scala.Boolean = false
  def isProlog: _root_.scala.Boolean = false
  def isPython: _root_.scala.Boolean = false
  def isR: _root_.scala.Boolean = false
  def isRacket: _root_.scala.Boolean = false
  def isRaku: _root_.scala.Boolean = false
  def isRazor: _root_.scala.Boolean = false
  def isReSt: _root_.scala.Boolean = false
  def isRuby: _root_.scala.Boolean = false
  def isRust: _root_.scala.Boolean = false
  def isSas: _root_.scala.Boolean = false
  def isScss: _root_.scala.Boolean = false
  def isSml: _root_.scala.Boolean = false
  def isSql: _root_.scala.Boolean = false
  def isSass: _root_.scala.Boolean = false
  def isScala: _root_.scala.Boolean = false
  def isScheme: _root_.scala.Boolean = false
  def isShellScript: _root_.scala.Boolean = false
  def isSkylark: _root_.scala.Boolean = false
  def isSwift: _root_.scala.Boolean = false
  def isToml: _root_.scala.Boolean = false
  def isTeX: _root_.scala.Boolean = false
  def isTypeScript: _root_.scala.Boolean = false
  def isTypeScriptReact: _root_.scala.Boolean = false
  def isVisualBasic: _root_.scala.Boolean = false
  def isVue: _root_.scala.Boolean = false
  def isWolfram: _root_.scala.Boolean = false
  def isXml: _root_.scala.Boolean = false
  def isXsl: _root_.scala.Boolean = false
  def isYaml: _root_.scala.Boolean = false
  def isZig: _root_.scala.Boolean = false
  def companion: _root_.scalapb.GeneratedEnumCompanion[Language] = scip.scip.Language
  final def asRecognized: _root_.scala.Option[scip.scip.Language.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[scip.scip.Language.Recognized])
}

object Language extends _root_.scalapb.GeneratedEnumCompanion[Language] {
  sealed trait Recognized extends Language
  implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Language] = this
  
  @SerialVersionUID(0L)
  case object UnspecifiedLanguage extends Language(0) with Language.Recognized {
    val index = 0
    val name = "UnspecifiedLanguage"
    override def isUnspecifiedLanguage: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object ABAP extends Language(60) with Language.Recognized {
    val index = 1
    val name = "ABAP"
    override def isAbap: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object APL extends Language(49) with Language.Recognized {
    val index = 2
    val name = "APL"
    override def isApl: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Ada extends Language(39) with Language.Recognized {
    val index = 3
    val name = "Ada"
    override def isAda: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Agda extends Language(45) with Language.Recognized {
    val index = 4
    val name = "Agda"
    override def isAgda: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object AsciiDoc extends Language(86) with Language.Recognized {
    val index = 5
    val name = "AsciiDoc"
    override def isAsciiDoc: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Assembly extends Language(58) with Language.Recognized {
    val index = 6
    val name = "Assembly"
    override def isAssembly: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Awk extends Language(66) with Language.Recognized {
    val index = 7
    val name = "Awk"
    override def isAwk: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Bat extends Language(68) with Language.Recognized {
    val index = 8
    val name = "Bat"
    override def isBat: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object BibTeX extends Language(81) with Language.Recognized {
    val index = 9
    val name = "BibTeX"
    override def isBibTeX: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object C extends Language(34) with Language.Recognized {
    val index = 10
    val name = "C"
    override def isC: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object COBOL extends Language(59) with Language.Recognized {
    val index = 11
    val name = "COBOL"
    override def isCobol: _root_.scala.Boolean = true
  }
  
  /** C++ (the name "CPP" was chosen for consistency with LSP)
    */
  @SerialVersionUID(0L)
  case object CPP extends Language(35) with Language.Recognized {
    val index = 12
    val name = "CPP"
    override def isCpp: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CSS extends Language(26) with Language.Recognized {
    val index = 13
    val name = "CSS"
    override def isCss: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CSharp extends Language(1) with Language.Recognized {
    val index = 14
    val name = "CSharp"
    override def isCsharp: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Clojure extends Language(8) with Language.Recognized {
    val index = 15
    val name = "Clojure"
    override def isClojure: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Coffeescript extends Language(21) with Language.Recognized {
    val index = 16
    val name = "Coffeescript"
    override def isCoffeescript: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object CommonLisp extends Language(9) with Language.Recognized {
    val index = 17
    val name = "CommonLisp"
    override def isCommonLisp: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Coq extends Language(47) with Language.Recognized {
    val index = 18
    val name = "Coq"
    override def isCoq: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Dart extends Language(3) with Language.Recognized {
    val index = 19
    val name = "Dart"
    override def isDart: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Delphi extends Language(57) with Language.Recognized {
    val index = 20
    val name = "Delphi"
    override def isDelphi: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Diff extends Language(88) with Language.Recognized {
    val index = 21
    val name = "Diff"
    override def isDiff: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Dockerfile extends Language(80) with Language.Recognized {
    val index = 22
    val name = "Dockerfile"
    override def isDockerfile: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Dyalog extends Language(50) with Language.Recognized {
    val index = 23
    val name = "Dyalog"
    override def isDyalog: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Elixir extends Language(17) with Language.Recognized {
    val index = 24
    val name = "Elixir"
    override def isElixir: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Erlang extends Language(18) with Language.Recognized {
    val index = 25
    val name = "Erlang"
    override def isErlang: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object FSharp extends Language(42) with Language.Recognized {
    val index = 26
    val name = "FSharp"
    override def isFsharp: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Fish extends Language(65) with Language.Recognized {
    val index = 27
    val name = "Fish"
    override def isFish: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Flow extends Language(24) with Language.Recognized {
    val index = 28
    val name = "Flow"
    override def isFlow: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Fortran extends Language(56) with Language.Recognized {
    val index = 29
    val name = "Fortran"
    override def isFortran: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Git_Commit extends Language(91) with Language.Recognized {
    val index = 30
    val name = "Git_Commit"
    override def isGitCommit: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Git_Config extends Language(89) with Language.Recognized {
    val index = 31
    val name = "Git_Config"
    override def isGitConfig: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Git_Rebase extends Language(92) with Language.Recognized {
    val index = 32
    val name = "Git_Rebase"
    override def isGitRebase: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Go extends Language(33) with Language.Recognized {
    val index = 33
    val name = "Go"
    override def isGo: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Groovy extends Language(7) with Language.Recognized {
    val index = 34
    val name = "Groovy"
    override def isGroovy: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object HTML extends Language(30) with Language.Recognized {
    val index = 35
    val name = "HTML"
    override def isHtml: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Hack extends Language(20) with Language.Recognized {
    val index = 36
    val name = "Hack"
    override def isHack: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Handlebars extends Language(90) with Language.Recognized {
    val index = 37
    val name = "Handlebars"
    override def isHandlebars: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Haskell extends Language(44) with Language.Recognized {
    val index = 38
    val name = "Haskell"
    override def isHaskell: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Idris extends Language(46) with Language.Recognized {
    val index = 39
    val name = "Idris"
    override def isIdris: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Ini extends Language(72) with Language.Recognized {
    val index = 40
    val name = "Ini"
    override def isIni: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object J extends Language(51) with Language.Recognized {
    val index = 41
    val name = "J"
    override def isJ: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object JSON extends Language(75) with Language.Recognized {
    val index = 42
    val name = "JSON"
    override def isJson: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Java extends Language(6) with Language.Recognized {
    val index = 43
    val name = "Java"
    override def isJava: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object JavaScript extends Language(22) with Language.Recognized {
    val index = 44
    val name = "JavaScript"
    override def isJavaScript: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object JavaScriptReact extends Language(93) with Language.Recognized {
    val index = 45
    val name = "JavaScriptReact"
    override def isJavaScriptReact: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Jsonnet extends Language(76) with Language.Recognized {
    val index = 46
    val name = "Jsonnet"
    override def isJsonnet: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Julia extends Language(55) with Language.Recognized {
    val index = 47
    val name = "Julia"
    override def isJulia: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Kotlin extends Language(4) with Language.Recognized {
    val index = 48
    val name = "Kotlin"
    override def isKotlin: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object LaTeX extends Language(83) with Language.Recognized {
    val index = 49
    val name = "LaTeX"
    override def isLaTeX: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Lean extends Language(48) with Language.Recognized {
    val index = 50
    val name = "Lean"
    override def isLean: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Less extends Language(27) with Language.Recognized {
    val index = 51
    val name = "Less"
    override def isLess: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Lua extends Language(12) with Language.Recognized {
    val index = 52
    val name = "Lua"
    override def isLua: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Makefile extends Language(79) with Language.Recognized {
    val index = 53
    val name = "Makefile"
    override def isMakefile: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Markdown extends Language(84) with Language.Recognized {
    val index = 54
    val name = "Markdown"
    override def isMarkdown: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Matlab extends Language(52) with Language.Recognized {
    val index = 55
    val name = "Matlab"
    override def isMatlab: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Nix extends Language(77) with Language.Recognized {
    val index = 56
    val name = "Nix"
    override def isNix: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object OCaml extends Language(41) with Language.Recognized {
    val index = 57
    val name = "OCaml"
    override def isOcaml: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Objective_C extends Language(36) with Language.Recognized {
    val index = 58
    val name = "Objective_C"
    override def isObjectiveC: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Objective_CPP extends Language(37) with Language.Recognized {
    val index = 59
    val name = "Objective_CPP"
    override def isObjectiveCpp: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PHP extends Language(19) with Language.Recognized {
    val index = 60
    val name = "PHP"
    override def isPhp: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PLSQL extends Language(70) with Language.Recognized {
    val index = 61
    val name = "PLSQL"
    override def isPlsql: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Perl extends Language(13) with Language.Recognized {
    val index = 62
    val name = "Perl"
    override def isPerl: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object PowerShell extends Language(67) with Language.Recognized {
    val index = 63
    val name = "PowerShell"
    override def isPowerShell: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Prolog extends Language(71) with Language.Recognized {
    val index = 64
    val name = "Prolog"
    override def isProlog: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Python extends Language(15) with Language.Recognized {
    val index = 65
    val name = "Python"
    override def isPython: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object R extends Language(54) with Language.Recognized {
    val index = 66
    val name = "R"
    override def isR: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Racket extends Language(11) with Language.Recognized {
    val index = 67
    val name = "Racket"
    override def isRacket: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Raku extends Language(14) with Language.Recognized {
    val index = 68
    val name = "Raku"
    override def isRaku: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Razor extends Language(62) with Language.Recognized {
    val index = 69
    val name = "Razor"
    override def isRazor: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object ReST extends Language(85) with Language.Recognized {
    val index = 70
    val name = "ReST"
    override def isReSt: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Ruby extends Language(16) with Language.Recognized {
    val index = 71
    val name = "Ruby"
    override def isRuby: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Rust extends Language(40) with Language.Recognized {
    val index = 72
    val name = "Rust"
    override def isRust: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object SAS extends Language(61) with Language.Recognized {
    val index = 73
    val name = "SAS"
    override def isSas: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object SCSS extends Language(29) with Language.Recognized {
    val index = 74
    val name = "SCSS"
    override def isScss: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object SML extends Language(43) with Language.Recognized {
    val index = 75
    val name = "SML"
    override def isSml: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object SQL extends Language(69) with Language.Recognized {
    val index = 76
    val name = "SQL"
    override def isSql: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Sass extends Language(28) with Language.Recognized {
    val index = 77
    val name = "Sass"
    override def isSass: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Scala extends Language(5) with Language.Recognized {
    val index = 78
    val name = "Scala"
    override def isScala: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Scheme extends Language(10) with Language.Recognized {
    val index = 79
    val name = "Scheme"
    override def isScheme: _root_.scala.Boolean = true
  }
  
  /** Bash
    */
  @SerialVersionUID(0L)
  case object ShellScript extends Language(64) with Language.Recognized {
    val index = 80
    val name = "ShellScript"
    override def isShellScript: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Skylark extends Language(78) with Language.Recognized {
    val index = 81
    val name = "Skylark"
    override def isSkylark: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Swift extends Language(2) with Language.Recognized {
    val index = 82
    val name = "Swift"
    override def isSwift: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object TOML extends Language(73) with Language.Recognized {
    val index = 83
    val name = "TOML"
    override def isToml: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object TeX extends Language(82) with Language.Recognized {
    val index = 84
    val name = "TeX"
    override def isTeX: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object TypeScript extends Language(23) with Language.Recognized {
    val index = 85
    val name = "TypeScript"
    override def isTypeScript: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object TypeScriptReact extends Language(94) with Language.Recognized {
    val index = 86
    val name = "TypeScriptReact"
    override def isTypeScriptReact: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object VisualBasic extends Language(63) with Language.Recognized {
    val index = 87
    val name = "VisualBasic"
    override def isVisualBasic: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Vue extends Language(25) with Language.Recognized {
    val index = 88
    val name = "Vue"
    override def isVue: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Wolfram extends Language(53) with Language.Recognized {
    val index = 89
    val name = "Wolfram"
    override def isWolfram: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object XML extends Language(31) with Language.Recognized {
    val index = 90
    val name = "XML"
    override def isXml: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object XSL extends Language(32) with Language.Recognized {
    val index = 91
    val name = "XSL"
    override def isXsl: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object YAML extends Language(74) with Language.Recognized {
    val index = 92
    val name = "YAML"
    override def isYaml: _root_.scala.Boolean = true
  }
  
  /** NextLanguage = 95;
    * Steps add a new language:
    * 1. Copy-paste the "NextLanguage = N" line above
    * 2. Increment "NextLanguage = N" to "NextLanguage = N+1"
    * 3. Replace "NextLanguage = N" with the name of the new language.
    * 4. Move the new language to the correct line above using alphabetical order
    * 5. (optional) Add a brief comment behind the language if the name is not self-explanatory
    */
  @SerialVersionUID(0L)
  case object Zig extends Language(38) with Language.Recognized {
    val index = 93
    val name = "Zig"
    override def isZig: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  final case class Unrecognized(unrecognizedValue: _root_.scala.Int) extends Language(unrecognizedValue) with _root_.scalapb.UnrecognizedEnum
  lazy val values = scala.collection.immutable.Seq(UnspecifiedLanguage, ABAP, APL, Ada, Agda, AsciiDoc, Assembly, Awk, Bat, BibTeX, C, COBOL, CPP, CSS, CSharp, Clojure, Coffeescript, CommonLisp, Coq, Dart, Delphi, Diff, Dockerfile, Dyalog, Elixir, Erlang, FSharp, Fish, Flow, Fortran, Git_Commit, Git_Config, Git_Rebase, Go, Groovy, HTML, Hack, Handlebars, Haskell, Idris, Ini, J, JSON, Java, JavaScript, JavaScriptReact, Jsonnet, Julia, Kotlin, LaTeX, Lean, Less, Lua, Makefile, Markdown, Matlab, Nix, OCaml, Objective_C, Objective_CPP, PHP, PLSQL, Perl, PowerShell, Prolog, Python, R, Racket, Raku, Razor, ReST, Ruby, Rust, SAS, SCSS, SML, SQL, Sass, Scala, Scheme, ShellScript, Skylark, Swift, TOML, TeX, TypeScript, TypeScriptReact, VisualBasic, Vue, Wolfram, XML, XSL, YAML, Zig)
  def fromValue(__value: _root_.scala.Int): Language = __value match {
    case 0 => UnspecifiedLanguage
    case 1 => CSharp
    case 2 => Swift
    case 3 => Dart
    case 4 => Kotlin
    case 5 => Scala
    case 6 => Java
    case 7 => Groovy
    case 8 => Clojure
    case 9 => CommonLisp
    case 10 => Scheme
    case 11 => Racket
    case 12 => Lua
    case 13 => Perl
    case 14 => Raku
    case 15 => Python
    case 16 => Ruby
    case 17 => Elixir
    case 18 => Erlang
    case 19 => PHP
    case 20 => Hack
    case 21 => Coffeescript
    case 22 => JavaScript
    case 23 => TypeScript
    case 24 => Flow
    case 25 => Vue
    case 26 => CSS
    case 27 => Less
    case 28 => Sass
    case 29 => SCSS
    case 30 => HTML
    case 31 => XML
    case 32 => XSL
    case 33 => Go
    case 34 => C
    case 35 => CPP
    case 36 => Objective_C
    case 37 => Objective_CPP
    case 38 => Zig
    case 39 => Ada
    case 40 => Rust
    case 41 => OCaml
    case 42 => FSharp
    case 43 => SML
    case 44 => Haskell
    case 45 => Agda
    case 46 => Idris
    case 47 => Coq
    case 48 => Lean
    case 49 => APL
    case 50 => Dyalog
    case 51 => J
    case 52 => Matlab
    case 53 => Wolfram
    case 54 => R
    case 55 => Julia
    case 56 => Fortran
    case 57 => Delphi
    case 58 => Assembly
    case 59 => COBOL
    case 60 => ABAP
    case 61 => SAS
    case 62 => Razor
    case 63 => VisualBasic
    case 64 => ShellScript
    case 65 => Fish
    case 66 => Awk
    case 67 => PowerShell
    case 68 => Bat
    case 69 => SQL
    case 70 => PLSQL
    case 71 => Prolog
    case 72 => Ini
    case 73 => TOML
    case 74 => YAML
    case 75 => JSON
    case 76 => Jsonnet
    case 77 => Nix
    case 78 => Skylark
    case 79 => Makefile
    case 80 => Dockerfile
    case 81 => BibTeX
    case 82 => TeX
    case 83 => LaTeX
    case 84 => Markdown
    case 85 => ReST
    case 86 => AsciiDoc
    case 88 => Diff
    case 89 => Git_Config
    case 90 => Handlebars
    case 91 => Git_Commit
    case 92 => Git_Rebase
    case 93 => JavaScriptReact
    case 94 => TypeScriptReact
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = ScipProto.javaDescriptor.getEnumTypes().get(6)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = ScipProto.scalaDescriptor.enums(6)
}