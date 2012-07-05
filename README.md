# snowball-stemmer

Wrapper around the Snowball stemmer algorithm. See: http://snowball.tartarus.org.

## Installation

Leiningen

```clojure
[org.clojars.gnarmis/snowball-stemmer "0.1.0-SNAPSHOT"]
```

Maven

```xml
<dependency>
  <groupId>org.clojars.gnarmis</groupId>
  <artifactId>snowball-stemmer</artifactId>
  <version>0.1.0-SNAPSHOT</version>
</dependency>
```

## Usage

Once running `lein compile`, enter `lein repl` and try out the following:

```clojure
(use 'stemmer.snowball)
; nil
(def eng (stemmer "english"))
; #'user/eng
(eng "going")
; "go"
```

## Updates After Forking

- Updated to Clojure 1.3

## License

Distributed under the Eclipse Public License, the same as Clojure.
