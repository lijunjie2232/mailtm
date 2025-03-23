package api.mail.tm.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.IOException;

@Data
@AllArgsConstructor
public class ErrorResponse extends Exception {
    private Integer code;
    private String message;

    public ErrorResponse() {
    }

    public ErrorResponse(String message) {
        super(message);
    }
}
