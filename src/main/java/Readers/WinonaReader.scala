//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Readers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


class WinonaReader {
  List<String> cells = new ArrayList();

  WinonaReader.this(String var1) {
    try {
      BufferedReader var2 = new BufferedReader(new InputStreamReader(new FileInputStream(var1)));

      String var3;
      while((var3 = var2.readLine()) != null) {
        this.cells.add(var3);
      }

      var2.close();
    } catch (Exception var4) {
      ;
    }

  }
}
