package CMPS_3240_6240Fall16

/**
  * Created by Parisa on 9/13/16.
  */
import CMPS_3240_6240Fall16.BadgeClassifiers._
import Readers.WinonaReader
import scala.collection.JavaConversions._
object BadgesApp extends App{

  val allNamesTrain= new WinonaReader("../../../../data/Winona/winona_train").cells
  val allNamesTest= new WinonaReader("../../../../data/Winona/winona_train").cells

  BadgeDataModel.cell.populate(allNamesTrain)
  BadgeDataModel.cell.populate(allNamesTest,false)

  BadgeClassifier.learn(5)
  BadgeClassifier.test()
}