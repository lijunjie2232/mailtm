package api.mail.tm.Entity;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponse {
    @SerializedName("@context")
    private String context;

    @SerializedName("@id")
    private String id;

    @SerializedName("@type")
    private String type;

    private String address;
    private int quota;
    private int used;
    private boolean isDisabled;
    private boolean isDeleted;
    private Date createdAt;
    private Date updatedAt;

}
