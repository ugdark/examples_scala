# 目的
- sbt-assemblyを使う
- multiプロジェクトの作り方

## 実行

```
$ cd example-multi-project
$ sbt assembly
$ java -jar target/scala-2.12/root-assembly-0.1-SNAPSHOT.jar
```

## 解説
依存関係
utils > app > root  

rootは何もないけどappのメインを参照して実行してる。


## 知見
- 

## 気になる事
- dependsOn / aggregate がまだしっくりこない

## 参考文献

- [Scala初心者の俺が「Hello World」する jar を作るまで。](https://qiita.com/suin/items/b8a7af13b00cfdecfd1e)
- [初めて触る人のためのsbtまとめ](https://qiita.com/prokosna/items/0728b73561955e631937)