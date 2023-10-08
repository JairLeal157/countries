package com.udea.countries.controllers;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.github.javafaker.Faker;
import com.github.javafaker.Nation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Locale;

@RestController()
public class DataController {

    @GetMapping(path = "/")
    public String getRoot() {
        return "AppCountries";
    }
    @GetMapping(path = "/version")
    public String getVersion() {
        return "0.0.1";
    }
    @GetMapping(path = "/RandomNations")
    public JsonNode getRandomNations() {
        ObjectMapper mapper = new ObjectMapper();
        Faker faker = new Faker(new Locale("es"));
        ArrayNode nations = mapper.createArrayNode();
        for (int i = 0; i < 10; i++) {
            Nation nation = faker.nation();
            nations.add(mapper.createObjectNode()
                    .put("Nacionalidad", nation.nationality())
                    .put("Capital", nation.capitalCity())
                    .put("lenguaje", nation.language())
                    .put("Bandera", nation.flag()));
        }
        return nations;
    }
    @GetMapping(path = "/RandomCurrencies")
    public JsonNode getRandomCurrencies() {
        ObjectMapper mapper = new ObjectMapper();
        Faker faker = new Faker(new Locale("es"));
        ArrayNode currencies = mapper.createArrayNode();
        for (int i = 0; i < 10; i++) {
            currencies.add(mapper.createObjectNode()
                    .put("Moneda", faker.currency().name())
                    .put("Código", faker.currency().code()));
        }
        return currencies;
    }

}
