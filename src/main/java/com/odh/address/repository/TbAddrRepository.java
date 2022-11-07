package com.odh.address.repository;

import com.odh.address.entity.TbAddr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbAddrRepository extends JpaRepository<TbAddr, Long> {
}
