package api.mail.tm.Entity;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HydraMapping {
    @SerializedName("@type")
    private String type;

    private String variable;
    private String property;
    private boolean required;
}
