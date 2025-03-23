package api.mail.tm.Entity;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DomainResponse {
    @SerializedName("@context")
    private String context;

    @SerializedName("@id")
    private String id;

    @SerializedName("@type")
    private String type;

    @SerializedName("hydra:totalItems")
    private int totalItems;

    @SerializedName("hydra:member")
    private List<Domain> member;

}

