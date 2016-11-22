/** This software is released under the University of Illinois/Research and Academic Use License. See
  * the LICENSE file in the root folder for details. Copyright (c) 2016
  *
  * Developed by: The Cognitive Computations Group, University of Illinois at Urbana-Champaign
  * http://cogcomp.cs.illinois.edu/
  */
package CellClassify

import Readers.WinonaReader
import edu.illinois.cs.cogcomp.saul.util.Logging
/*
import edu.illinois.cs.cogcomp.saulexamples.nlp.EmailSpam.SpamClassifiers._
*/
import scala.collection.JavaConversions._

object WinonaApp extends App {

  val allNamesTrain= new WinonaReader("./data/Winona/winona_train.csv").cells
  val allNamesTest= new WinonaReader("./data/Winona/winona_test.csv").cells

    WinonaDataModel.cell.populate(allNamesTrain)
    WinonaClassifiers.WinonaClassifier.learn(30)
    WinonaClassifiers.WinonaClassifier.test(allNamesTest)

  }