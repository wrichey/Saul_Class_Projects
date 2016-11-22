package CellClassify

import java.util
import scala.collection.JavaConversions._
import edu.illinois.cs.cogcomp.saul.datamodel.DataModel

/**
  * Created by Winona on 10/5/16.
  */
object WinonaDataModel extends DataModel{

  val cell= node[String]

  val CellFeature1= property(cell){
    x: String => {
      val stripped = x.replace("\"", "")
      val tokens= stripped.split(",")
      val stokens = tokens.slice(2,tokens.size)
      val doubleArray = stokens.map(y => y.toDouble)
      val s3token= doubleArray.toList
      s3token
    }
  }


  val CellLabel =property(cell){
    x: String => {
      val tokens= x.split(",")
      print(tokens)
      if (tokens(1).equals("M"))
        "positive"
      else
        "negative"
    }
  }
}
