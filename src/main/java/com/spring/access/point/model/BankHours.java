package com.spring.access.point.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BankHours {

    @Getter
    @Setter
    @EqualsAndHashCode
    @Embeddable
    public class BankHoursId implements Serializable {
        private long bankHoursId;
        private long movementId;
        private long userId;
    }
    @EmbeddedId
    private BankHoursId id;
    private LocalDateTime workedDate;
    private BigDecimal workedHours;
    private BigDecimal hoursIncome;
}
