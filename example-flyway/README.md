# flywayの使い方

## 目的
- sbtにてライブラリ管理をする
- ほぼシェルでパラメータを渡して実行したかった。


## create databases
ここは毎回手動実行

```bash
create databases bbs;
```


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