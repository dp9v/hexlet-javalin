package com.dp9v.javalin.demo.full;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Header;

import java.util.Random;

public class WebApplication {
    public static void main(String[] args) {
        var app = Javalin.create()
                .get("/random", WebApplication::getRandomNumber)
                .start(80);
    }

    public static void getRandomNumber(Context context) {
        var limit = context.queryParamAsClass("limit", Integer.class).getOrDefault(1000);
        var randomValue = new Random().nextInt(limit);

        context.header("application-name", "WebApplication");
        context.header(Header.CONTENT_TYPE, "application/json");

        context.result("{\"value\": " + randomValue + "}");
    }
}
