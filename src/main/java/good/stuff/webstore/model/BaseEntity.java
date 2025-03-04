package good.stuff.webstore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@MappedSuperclass
@Data
public abstract class BaseEntity {
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedAt;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = new Date();
        modifiedAt = new Date();
    }
    @PreUpdate
    protected void onUpdate() {
        modifiedAt = new Date();
    }
}
