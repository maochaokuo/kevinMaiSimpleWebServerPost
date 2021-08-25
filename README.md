# kevinMaiSimpleWebServerPost
kevin Mai Simple Web Server Post example

## run it
but does not work
```shell
clj -A:run
```

## start and stop server

## not found

## localhost:4000/json

## http://localhost:4000/json/id
http://localhost:4000/json/anything

## http://localhost:4000/json/
POST:
```json
{
    "request": "hello"
}
```
response:
```json
{
    "json": true,
    "response": "hello"
}
```

## post request to string
```clojure
(POST "/agents" request
  (let [body (json/read-str (slurp (:body request)))]
    (println body)))
```