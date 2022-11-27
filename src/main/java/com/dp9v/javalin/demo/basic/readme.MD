### ПРимеры вызовов


#### Пример 1: Подробный 
```shell
$ curl 127.0.0.1:7070 -v

* Connected to 127.0.0.1 (127.0.0.1) port 7070 (#0)
> GET / HTTP/1.1
> Host: 127.0.0.1:7070
> User-Agent: curl/7.78.0
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 OK
< Date: Sat, 26 Nov 2022 18:15:28 GMT
< Content-Type: text/plain
< Content-Length: 11
<
Hello World* Connection #0 to host 127.0.0.1 left intact

```

#### Пример 2 - POST
```shell
$ curl -X POST 127.0.0.1:7070/user -i
HTTP/1.1 200 OK
Date: Sat, 26 Nov 2022 18:16:52 GMT
Content-Type: text/plain
Content-Length: 26

Post method with /user URL
```

#### Пример 3 - DELETE user
```shell
$ curl -X DELETE 127.0.0.1:7070/user -i
HTTP/1.1 200 OK
Date: Sat, 26 Nov 2022 18:17:23 GMT
Content-Type: text/plain
Content-Length: 28

Delete method with /user URL
```

#### Пример 4 - POST group
```shell
$ curl -X POST 127.0.0.1:7070/group -i
HTTP/1.1 200 OK
Date: Sat, 26 Nov 2022 18:18:35 GMT
Content-Type: text/plain
Content-Length: 27

Post method with /group URL
```


#### Пример 5 - 404
```shell
$ curl -X DELETE 127.0.0.1:7070/group -i
HTTP/1.1 404 Not Found
Date: Sat, 26 Nov 2022 18:19:14 GMT
Content-Type: text/plain
Content-Length: 9

Not Found
```