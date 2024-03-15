package tacos;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;

import lombok.Data;

import java.util.List;

@Data
public class Taco {

    @NotNull // 값이 null이 아니어야 한다.
    @Size(min=5, message = "Name mush be at least 5 characters long") // 최소한 5문자이어야 한다.
    private String name;

    @Size(min=1, message = "You must choose at least 1 ingredient")
    private List<String> ingredients;
}
