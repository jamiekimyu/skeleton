package api;

import com.fasterxml.jackson.annotation.JsonProperty;
import generated.tables.records.TagsRecord;

/**
 * This is an API Object.  Its purpose is to model the JSON API that we expose.
 * This class is NOT used for storing in the Database.
 *
 * This ReceiptResponse in particular is the model of a Receipt that we expose to users of our API
 *
 * Any properties that you want exposed when this class is translated to JSON must be
 * annotated with {@link JsonProperty}
 */
public class TagsResponse {
    @JsonProperty
    String tag;

    @JsonProperty
    Integer receipt_id;

    public TagsResponse(TagsRecord dbRecord) {
        this.tag = dbRecord.getTag();
        this.receipt_id = dbRecord.getReceiptId();
    }

}
