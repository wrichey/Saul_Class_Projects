package CMPS_3240_6240Fall16

import edu.illinois.cs.cogcomp.saul.datamodel.DataModel

/**
  * Created by Winona on 10/5/16.
  */
object BadgeDataModel extends DataModel{

  val cell= node[String]

  val CellFeature1= property(cell){
    x: String => {
      val tokens= x.split(",")
      tokens(2).toInt
    }
  }

  val CellLabel =property(cell){
    x: String => {
      val tokens= x.split(",")
      if (tokens(1).equals("M"))
        "positive"
      else
        "negative"
    }
  }
}
