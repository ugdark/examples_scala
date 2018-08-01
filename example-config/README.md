# configの使い方

## 目的
- scalaでの標準的なconfigに触る
- 引数でresources配下のconfigを切り替える


### sbtでの実行
```bash
$ sbt
$ flywayMigrate
```

1.0以前ではパラメータ渡しができたが1.0わからず

### commandlineはsbtに依存しない方法で提供してる。
ただしjavaいるはず。

https://flywaydb.org/download/community から
flyway-commandline-5.1.4.zip (without JRE)をダウンロードしてる。


### 理想 は下記

1.0以前と同じで下記みたいな方法ができないのか。  
それから完全にscala風に書き換えたい。
実務ならとりあえずコマンドラインで非依存にする。
```bash
sbt flywayMigrate \
    -Dflyway.url=jdbc:mysql://locahost/bbs \
    -Dflyway.locations=filesystem:src/main/resources/db/migration/bbs \
    -Dflyway.user=root \
    -Dflyway.password=123456
```


## 参考URL
-[公式](https://flywaydb.org/)
-[flyway-sbt](https://github.com/flyway/flyway-sbt)