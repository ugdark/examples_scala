# 目的
- クリーンアーキテクチャ等のUseCase部分の実装がスッキリしないので解消したい
- エラーの制御などをuseCase部分でまとめたい
- serviceやらusecaseは個人的にはwebやcliなどの実装方式に捕らわれない方法を取りたい。  


## 考察

調べたりしてると継続モナドの適応事例が多い。んでscalazを使わない方向を考えたが  
scalazを使うのが今は最良にも思える。  

usecaseの実装だがoutputのパターンが２つのケースに分かれる事が多い？
- eitherなどの例外を返す記述方式
- Resultとして例外をcase内で処理する方式 例外はNotFoundErrorResultなどResultで判別



## 参考文献

- [ScalaでFutureとEitherを組み合わせたときに綺麗に書く方法](https://xuwei-k.hatenablog.com/entry/20140919/1411136788)
- [ScalaMatsuri 2016 ドワンゴアカウントシステムを支えるScala技術](https://niconare.nicovideo.jp/watch/kn1052)