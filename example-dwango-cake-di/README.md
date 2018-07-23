# 目的
- dwango DIを試したかった

## 実行

```bash
$ sbt "project example-dwango-cake-di" run 
```

## コメント

RubyではMixinで本番用 Dummyでテスト用を作成して  
切り替えられる用にしたりした。  

## メリット

- 静的にエラーを発見できる。(guiceだとコンパイラ) 
- 個人的だけど、多言語でも応用できるので(Ruby等)



## 参考文献
- [Play2.4のDIについて動作確認（Guiceの使い方）](https://qiita.com/mtoyoshi/items/768a1a8ece5a9be7254e)
- [Scalaにおける最適なDependency Injectionの方法を考察する 〜なぜドワンゴアカウントシステムの生産性は高いのか〜](https://qiita.com/pab_tech/items/1c0bdbc8a61949891f1f)
