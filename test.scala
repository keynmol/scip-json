//> using nativeVersion "0.4.12"
//> using scala "3.2.2"
//> using lib "com.thesamet.scalapb::scalapb-runtime::0.11.13"
//> using lib "io.github.scalapb-json::scalapb-circe::0.12.2"
import scalapb_circe.JsonFormat
import java.io.FileInputStream

@main def run(inp: String) =
  val scipIndex = JsonFormat.toJson(
    scip.scip.Index.parseFrom(
      new FileInputStream(new java.io.File(inp))
    )
  )

  print(scipIndex.noSpacesSortKeys)
