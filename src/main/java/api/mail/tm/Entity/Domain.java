package api.mail.tm.Entity;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Domain {
    @SerializedName("@id")
    private String id;

    @SerializedName("@type")
    private String type;

    @SerializedName("id")
    private String domainId;

    @SerializedName("domain")
    private String domain;

    @SerializedName("isActive")
    private boolean isActive;

    @SerializedName("isPrivate")
    private boolean isPrivate;

    @SerializedName("createdAt")
    private String createdAt;

    @SerializedName("updatedAt")
    private String updatedAt;

}
