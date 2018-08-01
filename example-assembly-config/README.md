# 目的
- jarに内包したconfigファイルを引数で切り替えをする

## 実行

```bash
$ cd example-assembly-assembly-config
$ sbt run 
    ~~~
  environment:[development]
```

## jarにしてから実行

resources以下を読み込んでる事を確認する。

```bash
$ cd example-assembly-assembly-config
$ sbt assembly # jar作成
$ java -jar target/scala-2.12/hello.jar
    ~~~
  environment:[development]
```

## 本番用
configをパラメータで切り返す`-Dconfig.resource=application.prod.conf`を後ろに書くと認識しなかった。

```bash
$ sbt assembly # jar作成
$ java -jar -Dconfig.resource=application.prod.conf target/scala-2.12/hello.jar 
    ~~~
  environment:[production]
```

## コメント
これは簡単な方だと思われる。
自分が思う最大のセキュアではprodのconfigはプロダクト責任者のみアクセスできるS3のフォルダやgithub(別リポジトリ)に配置して  
読み込むなどをする必要があると思われる。  
デプロイは自動化して誰も本番のコンフィグを見れないようにするのはあり  

config.file  
config.url  

または本番用のdeployを作る時にconfigを内包するやり方等は思いつく。  


## 参考文献

- [github config](https://github.com/lightbend/config)
