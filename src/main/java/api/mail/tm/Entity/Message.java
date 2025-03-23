package api.mail.tm.Entity;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Message {
    @SerializedName("@id")
    private String id;

    @SerializedName("@type")
    private String type;

    @SerializedName("@context")
    private String context;

    private String accountId;
    private String msgid;
    private EmailAddress from;
    private List<EmailAddress> to;
    private String subject;
    private String intro;
    private boolean seen;
    private boolean isDeleted;
    private boolean hasAttachments;
    private int size;
    private String downloadUrl;
    private Date createdAt;
    private Date updatedAt;
}