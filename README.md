# snowball-stemmer

Wrapper around the Snowball stemmer algorithm. See: http://snowball.tartarus.org

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

## Updates

- Updated to Clojure 1.3

## License

Copyright (C) 2011 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
