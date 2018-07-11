# 目的
- sbt-assemblyの使い方確認

## 実行

```bash
$ sbt run # Hello World! 
```

## jarにしてから実行

```bash
$ sbt assembly # jar作成
$ java -jar target/scala-2.12/hello.jar
  Hello World!
```

## jarについて
拡張子をunzipでzip同様に確認できる。


## 参考文献

- [Scala初心者の俺が「Hello World」する jar を作るまで。](https://qiita.com/suin/items/b8a7af13b00cfdecfd1e)
