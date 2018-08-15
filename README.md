# examples_scala
scala学習用

## はじめに 
build.sbtが肥大化して重くもなってきたので  
ある程度はbuild.sbtをコメントアウトして使います  

## お題

△ = 改善したい

### 環境(必須)

- △[scaladoc](./example-scaladoc/README.md)

### Test

- [unit testしたい](./example-scaladoc/README.md)

- [カバレッジ](example-test-coverage/README.md)
### 基本

- [JARの作成方法](./example-assembly/README.md)
- △[マルチプロジェクトの確認](./example-multi-project/README.md)
- △[Futureに慣れる](./example-basic-future/README.md)

### パスワード生成
- [パスワード生成確認](./example-password-bcrypt/README.md)

### Config
- [configの使い方](./example-config/README.md)
- [jarでのconfig切り替え](./example-assembly-config/README.md)

### JSON

- [scalaでのJSON考察](./example-json/README.md)

### マイグレーション

- △[flyway](./example-flyway/README.md)


### github 

- [mavenリポジトリとして利用](./example-github-publish/README.md)
- [mavenリポジトリとして登録したのを使う方](./example-github-pull/README.md)

- [githubをそのまま使う](http://yoshiori.hatenablog.com/entry/20120324/1332618170)


### build.sbt周り

- [scalac にもっと警告してもらう](https://qiita.com/kawachi/items/1c1d063de91c5445e8bc)

### アーキテクチャとかそういうのに
- [DwangoDIお試し](./example-assembly/README.md)

## 課題

- json変換 (scalaめんどい・・・) 
- ライセンス検証用 https://github.com/sbt/sbt-license-report

### 追加
- scaladoc multiプロジェクトで１つにまとめたい。＜たぶんscaladoc コマンド辺りを参考にすべてのsrc指定にすればいいかと思ってる。
- scaladoc targetではなく/docとルート直下に置けないのか？
- flyway sbtでjarの管理をしてからsbtパラメータ渡しにしたい。
- multi-puroject dependsOn / aggregate がまだしっくりこない

## idea関係

### プロジェクト内別build.sbtの読み込み方

一部別のbuild.sbtを用意してるのだがbuild.sbtをシンプルに保ちたいからです。     
IDEAから開く時に`File -> New -> Module from XXX` で  
example-assemblyとかを選択すれば1つのプロジェクトとして使えます。  


## 公式
- [sbt](https://www.scala-sbt.org/) 
- [Maven Repository](https://mvnrepository.com/)


## 参考文献

- [Scala入門時に役立つ情報まとめ](https://qiita.com/nesheep5/items/49019b9df4836d36ec1f)
- [Design Patterns in Scala](https://gist.github.com/gakuzzzz/6cbf407928fbc637c64a371bcc20f050)

### 初心者向け
- [ドワンゴScala研修テキスト](https://dwango.github.io/scala_text/)
- [やってみようScala! シリーズ1](https://qiita.com/f81@github/items/8d67fb3f211fb3e149db)





