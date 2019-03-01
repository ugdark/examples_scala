# Akka-httpの確認

## 目的
- Akka-httpを試したい
- rest-apiでのjson周りの確認



## 参考文献

- [Akkaの公式のサンプルから](https://doc.akka.io/docs/akka-http/current/introduction.html)


## 試し方

```bash
$  sbt "project example-akka-http" run
```

```bash
$ curl -H "Content-Type: application/json" -X POST -d '{"items":[{"name":"hhgtg","id":42}]}' http://localhost:8080/create-order
$ curl http://localhost:8080/item/42 
```