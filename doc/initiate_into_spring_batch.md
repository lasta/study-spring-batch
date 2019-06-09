# Spring Batch に入門してみた

## やりたいこと
* バッチ処理を新規作成
  * CSV データを加工して Apache Solr に投入する
<!--
* DB からデータを取得して Apache Solr に投入する
-->

[ソースコード][github-source]

## 筆者の技術背景
検索エンジンおよびサーバサイドエンジニアです。

* Java 4年, Kotlin 2年
* Spring Framework 1年
  * Spring Boot + Spring MVC を用いた REST API サーバ 1年
  * Spring Batch は未経験
* Apache Solr 3年
* IntelliJ IDEA 3年

## 環境
* IntelliJ IDEA 2019.1.2 (Ultimate Edition)
* Java 8 + Kotlin 1.3.31
* Spring
  * Spring Boot Starter Parent 2.1.5.RELEASE

## 参考文献
* [Spring Btach Introduction][spring batch introduction]
* [The Domain Language of Batch][spring batch domain language]
* [Indexing documents with Spring batch][solr-with-batch]

## memo
* Conversion Application
* Processing and Updating Application
* File-Driven
* normal and partitioning
  * Fixed and Even Break-Up of Record Set


### 設計
* Job
  * CSV データ1行の処理
  * Step を複数持つ
* Steps
  * Step 1 - preprocessing
  * Step 2 - converting
  * Step 3 - indexing

[github-source]: https://github.com/lasta/study-spring-batch
[spring batch introduction]: https://docs.spring.io/spring-batch/4.0.x/reference/html/spring-batch-intro.html
[spring batch domain Language]: https://docs.spring.io/spring-batch/4.0.x/reference/html/domain.html
[solr-with-batch]: https://g00glen00b.be/indexing-documents-spring-batch/
