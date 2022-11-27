package com.dp9v.javalin.demo.basic;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        /*config*/
        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("Hello World"))
                .post("/user", ctx -> ctx.result("Post method with /user URL"))
                .post("/group", ctx -> ctx.result("Post method with /group URL"))
                .delete("/user", ctx -> ctx.result("Delete method with /user URL"))
                .start(80);
    }
}
