package camt.se331.shoppingcart.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Bitee on 3/29/2016.
 */
@Entity
public class Image {
    @Id
    @GeneratedValue
    private Long id;

    String fileName;
    @Lob
    byte[] content;
    String contentType;
    @Temporal(TemporalType.TIME)
    Date created;

    public Image() {

    }

    public byte[] getContent() {
        return content;
    }

    public String getContentType() {
        return contentType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Image(String fileName) {
        this.fileName = fileName;
    }

    public Image(byte[] content) {
        this.content = content;
    }

    public Image(Date created) {
        this.created = created;
    }

}
