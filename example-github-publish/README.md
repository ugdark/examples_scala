# 目的
- githubでライブラリの公開をしたい

## 用途
プロジェクトをサブモジュール化して横展開する時などに便利。  


## 公開用のファイル作成
これでbuild.sbtで指定したpathに出力されるのでそれをcommitして  
githubページでアクセスして使う

```bash
$ sbt "project example-github-publish" publish
```

## localでは
これでlocalの.ivyに登録される。
```bash
$ sbt "project example-github-publish" publishLocal
```


## ゲットする
```bash
wget https://ugdark.github.io/mavenrepo/com/example/example-github-publish_2.12/0.1-SNAPSHOT/example-github-publish_2.12-0.1-SNAPSHOT.jar
```

## 参考文献

- [Play2/Scala向けライブラリを公開する(SBTでGithub上のMavenに)](https://qiita.com/shouta-dev/items/44b1729db39edbb507fd)
- [Github 上のライブラリや sbt plugin を使う (sbt 0.13 以降用)](https://qiita.com/kawachi/items/71af20a102ecca41561d)