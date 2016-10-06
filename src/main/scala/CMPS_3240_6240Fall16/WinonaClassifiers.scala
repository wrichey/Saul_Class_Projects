
package CMPS_3240_6240Fall16

import edu.illinois.cs.cogcomp.lbjava.learn.{SparseNetworkLearner, SupportVectorMachine}

/**
  * Modified by Winona on 9/13/16.
  */
object WinonaClassifiers {
  import BadgeDataModel._
  import edu.illinois.cs.cogcomp.saul.classifier.Learnable
  object BadgeClassifier extends Learnable[String](badge) {
    def label = BadgeLabel
    override lazy val classifier = new SupportVectorMachine()
    override def feature = using(BadgeFeature1)
  }
}