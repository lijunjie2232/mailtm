package api.mail.tm.Entity;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class HydraSearch {
    @SerializedName("@type")
    private String type;

    @SerializedName("hydra:template")
    private String template;

    @SerializedName("hydra:variableRepresentation")
    private String variableRepresentation;

    @SerializedName("hydra:mapping")
    private List<HydraMapping> mapping;
}