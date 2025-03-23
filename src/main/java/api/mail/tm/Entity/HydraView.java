package api.mail.tm.Entity;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class HydraView {
    @SerializedName("@id")
    private String id;

    @SerializedName("@type")
    private String type;

    @SerializedName("hydra:first")
    private String first;

    @SerializedName("hydra:last")
    private String last;

    @SerializedName("hydra:previous")
    private String previous;

    @SerializedName("hydra:next")
    private String next;
}