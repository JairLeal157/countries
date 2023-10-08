package com.udea.countries.controllers;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.github.javafaker.Faker;
import com.github.javafaker.Nation;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(path = "/RandomNations/{size}")
    public JsonNode getRandomNations(@PathVariable int size) {
        ObjectMapper mapper = new ObjectMapper();
        Faker faker = new Faker(new Locale("es"));
        ArrayNode nations = mapper.createArrayNode();
        for (int i = 0; i < size; i++) {
            Nation nation = faker.nation();
            nations.add(mapper.createObjectNode()
                    .put("Nacionalidad", nation.nationality())
                    .put("Capital", nation.capitalCity())
                    .put("lenguaje", nation.language())
                    .put("Bandera", nation.flag()));
        }
        return nations;
    }
    @GetMapping(path = "/RandomCurrencies/{size}")
    public JsonNode getRandomCurrencies(@PathVariable int size) {
        ObjectMapper mapper = new ObjectMapper();
        Faker faker = new Faker(new Locale("es"));
        ArrayNode currencies = mapper.createArrayNode();
        for (int i = 0; i < size; i++) {
            currencies.add(mapper.createObjectNode()
                    .put("Moneda", faker.currency().name())
                    .put("Código", faker.currency().code()));
        }
        return currencies;
    }

}
