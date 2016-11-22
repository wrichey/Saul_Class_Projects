package CellClassify


import edu.illinois.cs.cogcomp.lbjava.learn.{SparseNetworkLearner, SparseAveragedPerceptron, SparseConfidenceWeighted, StochasticGradientDescent, SupportVectorMachine}
/**
  * Modified by Winona on 11/17/16.
  */

object WinonaClassifiers {
  import WinonaDataModel._
  import edu.illinois.cs.cogcomp.saul.classifier.Learnable
  object WinonaClassifier extends Learnable[String](cell) {
    def label = CellLabel
    override lazy val classifier = new SupportVectorMachine()
    override def feature = using(CellFeature1)
  }
}
