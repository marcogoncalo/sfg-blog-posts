package guru.springframework.feign;

import lombok.Value;

@Value
public class SimpleClientData {
    private int id;
    private String name;
    private int amount;
}
