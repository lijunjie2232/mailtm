package api.mail.tm.Entity;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessagesResponse {
    @SerializedName("hydra:member")
    private List<Message> member;

    @SerializedName("hydra:totalItems")
    private int totalItems;

    @SerializedName("hydra:view")
    private HydraView view;

    @SerializedName("hydra:search")
    private HydraSearch search;
}

