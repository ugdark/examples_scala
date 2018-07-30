# 目的
- scalaは標準のcodeチェック機構ないので探す

## チェックしたい事（多言語での基準）

- クラスは1000行まで(もっと減らしてもいいけど)
- メソッド10行 (ただしcontoroller部分などを除くlogを仕込んだりして制御と流れを大事にする部分なので)
- 行:80行
- publicメソッドは scaladocを必須にする
- インデントなどは自動整形できると嬉しい。


- ovverrideを明示化 


## コメント
rubocopと比べてやっぱり貧弱な感想  


## IntelliJでの使い方

## 参考文献
- [公式 scalafmt](https://scalameta.org/scalafmt/)
- [Scalafmt を使って Scala コードをフォーマット](https://qiita.com/tsuyoshizawa/items/03b5fb90ad2c491f851c)