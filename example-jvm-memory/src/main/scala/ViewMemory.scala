object ViewMemory extends App {


  // 合計・・・Runtime.getRuntime().totalMemory()で、Java仮想マシンへのメモリ割り当て量になります。
  // 使用量・・・Runtime.getRuntime().totalMemory()　-　Runtime.getRuntime().freeMemory()になり、 現在メモリに割り当てられたオブジェクトのメモリ使用量です。
  // 使用可能最大・・・Runtime.getRuntime().maxMemory()で、Java仮想マシンが使用を試みる最大メモリ容量になります。
  // 使用量が合計に近づき、かつガベージコレクションでも空きメモリが確保できない場合、Java仮想マシンは「使用可能最大」まで拡張します。
  println("合計 :" + Runtime.getRuntime.totalMemory())
  println("使用量 :" + (Runtime.getRuntime.totalMemory() - Runtime.getRuntime.freeMemory()))
  println("使用可能最大 :" + Runtime.getRuntime.maxMemory())

}
