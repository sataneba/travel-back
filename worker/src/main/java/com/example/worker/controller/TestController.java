package com.example.worker.controller;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private Random random = new Random();

  @GetMapping("/random")
  public List<Integer> someList() {

    return Stream.generate(() -> random.nextInt(10))
        .limit(10)
        .collect(Collectors.toList());
  }
}
