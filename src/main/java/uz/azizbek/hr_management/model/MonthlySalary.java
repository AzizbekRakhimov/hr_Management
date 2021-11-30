package uz.azizbek.hr_management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Month;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MonthlySalary {

    @Transient
    private static final String seqName = "monthly_salary_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = seqName)
    @SequenceGenerator(sequenceName = seqName, name = seqName, allocationSize = 1)
    private Long id;

    private String amount;

    @ManyToOne
    private User user;

    private boolean status;

    @Enumerated(EnumType.STRING)
    private Month month;
}
