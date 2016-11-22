package CMPS_3240_6240Fall16

import edu.illinois.cs.cogcomp.lbjava.learn.{SparseNetworkLearner, SupportVectorMachine}

/**
  * Created by Parisa on 9/13/16.
  */

object BadgeClassifiers {
  import BadgeDataModel._
  import edu.illinois.cs.cogcomp.saul.classifier.Learnable
  object BadgeClassifier extends Learnable[String](cell) {
    def label = CellLabel
    override lazy val classifier = new SupportVectorMachine()
    override def feature = using(CellFeature1)
  }
}