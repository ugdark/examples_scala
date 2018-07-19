# 目的
- scaladocを使う
- multiプロジェクトの作り方

## 前準備
- グラフ描画ツール入れる（オプションだけど、あるといい

```bash
$ brew install graphviz
```

build.sbtに追加 (今回のは追記してる。)
```
scalacOptions in (Compile,doc) := Seq("-diagrams")
```


## 作成

```
$ sbt "project example-scaladoc" doc
```

`example-scaladoc/target/scala-2.12/api/index.html`  
に作成される


## 検証したい事
- multiプロジェクトで１つにまとめたい。＜たぶんscaladoc コマンド辺りを参考にすべてのsrc指定にすればいいかと思ってる。
- targetではなく/docとルート直下に置けないのか？

## 参考文献

- [scaladocとグラフ](https://qiita.com/4245Ryomt/items/71c0b674f56f5920f962)