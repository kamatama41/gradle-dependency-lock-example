package com.github.kamatama41.example;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        get("/hello", (req, res) -> new Hello().world());
    }
}
