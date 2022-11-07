package com.odh.address.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_addr")
@Getter
@Setter
@NoArgsConstructor
public class TbAddr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment 처리
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "addr", nullable = false, length = 100)
    private String addr;

}