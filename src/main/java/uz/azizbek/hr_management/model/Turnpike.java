package uz.azizbek.hr_management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Turnpike {

    @Transient
    private static final String seqName = "turnpike_card_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = seqName)
    @SequenceGenerator(sequenceName = seqName, name = seqName, allocationSize = 1)
    private Long id;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private LocalDate day;

    @ManyToOne
    private User user;
}
