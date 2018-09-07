負荷試験ツール Gatling
-----------------------


# 目的
- サーバがどれくらいの負荷に耐えられるのかを知りたい場合を想定
- 負荷計測ツールの使い方と流れを把握したい
- GUIではなくscalaタスクとしての方法を把握したい

### sbtでの実行

```bash
$ sbt
> gatling:test // テストをすべて実行する
```
### テストレポート
`target/gatling`に出力される。


## 考察


## 参考文献

- [負荷試験ツールのGatlingをsbtのタスクから実行する](https://yoshinorin.net/2018/02/28/gatling-using-by-sbt/)
