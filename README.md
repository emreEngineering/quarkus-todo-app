# todo-app

Bu proje, Süpersonik Subatomik Java Framework'ü olan Quarkus'u kullanır.

Quarkus hakkında daha fazla bilgi edinmek için web sitesini ziyaret edebilirsiniz: <https://quarkus.io/>.

## Uygulamayı geliştirme modunda çalıştırma

Canlı kodlama (live coding) özelliğini etkinleştiren geliştirme modunda uygulamayı şu komutla çalıştırabilirsiniz:

```shell script
./mvnw quarkus:dev
```

> **_NOT:_** Quarkus artık bir Dev UI ile birlikte gelir. Bu arayüze yalnızca geliştirme modunda <http://localhost:8080/q/dev/> adresinden erişilebilir.

## Uygulamayı paketleme ve çalıştırma

Uygulama şu komutla paketlenebilir:

```shell script
./mvnw package
```

Bu işlem `target/quarkus-app/` dizininde `quarkus-run.jar` dosyasını üretir.
Bağımlılıklar `target/quarkus-app/lib/` dizinine kopyalandığı için bunun bir _uber-jar_ olmadığını unutmayın.

Uygulama artık `java -jar target/quarkus-app/quarkus-run.jar` komutuyla çalıştırılabilir.

Bir _uber-jar_ oluşturmak isterseniz aşağıdaki komutu çalıştırın:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

Uygulama _uber-jar_ olarak paketlendiğinde `java -jar target/*-runner.jar` komutuyla çalıştırılabilir.

## Native çalıştırılabilir dosya oluşturma

Şu komutla native bir çalıştırılabilir dosya oluşturabilirsiniz:

```shell script
./mvnw package -Dnative
```

Ya da GraalVM kurulu değilse, native derlemeyi bir container içinde şu komutla çalıştırabilirsiniz:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

Daha sonra native çalıştırılabilir dosyayı şu komutla başlatabilirsiniz: `./target/todo-app-1.0.0-SNAPSHOT-runner`

Native çalıştırılabilir dosya oluşturma hakkında daha fazla bilgi için: <https://quarkus.io/guides/maven-tooling>.

## İlgili Kılavuzlar

- Panache ile Hibernate ORM ([kılavuz](https://quarkus.io/guides/hibernate-orm-panache)): Active Record veya Repository desenleriyle Hibernate ORM kalıcılık kodunu sadeleştirir
- RESTEasy Classic ([kılavuz](https://quarkus.io/guides/resteasy)): Jakarta REST ve daha fazlasını uygulayan REST uç noktası çatısı
- JDBC Driver - MySQL ([kılavuz](https://quarkus.io/guides/datasource)): JDBC üzerinden MySQL veritabanına bağlanmayı sağlar

## Sağlanan Kod

### Hibernate ORM

İlk JPA varlığınızı oluşturun

[İlgili kılavuz bölümü...](https://quarkus.io/guides/hibernate-orm)

[Panache ile Hibernate için ilgili bölüm...](https://quarkus.io/guides/hibernate-orm-panache)


### RESTEasy JAX-RS

RESTful web servislerinizi kolayca başlatın

[İlgili kılavuz bölümü...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
