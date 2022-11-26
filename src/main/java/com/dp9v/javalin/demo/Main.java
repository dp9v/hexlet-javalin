package com.dp9v.javalin.demo;

import io.javalin.Javalin;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        /*config*/
        try (var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("Hello World"))
                .start(7070)) {
        }
    }
}