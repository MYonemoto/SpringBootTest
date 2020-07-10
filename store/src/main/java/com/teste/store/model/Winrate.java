package com.teste.store.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "WINRATE")
public class Winrate implements Serializable {

    @Id
    @SequenceGenerator(name = "winrate_seq", sequenceName = "winrate_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "winrate_seq")
    @EqualsAndHashCode.Include
    @Column(name = "ID")
    Long id;

    @NotBlank(message = "msg-1")
    @Column(name = "HERO")
    String hero;

    @NotNull(message = "msg-2")
    @DecimalMin(value = "0", message = "msg-3")
    @Column(name = "TOTAL")
    BigDecimal total;

    @NotNull(message = "msg-4")
    @DecimalMin(value = "0", message = "msg-5")
    @Column(name = "WIN")
    BigDecimal win;

    @NotNull(message = "msg-6")
    @DecimalMin(value = "0", message = "msg-7")
    @Column(name = "LOSE")
    BigDecimal lose;
}
