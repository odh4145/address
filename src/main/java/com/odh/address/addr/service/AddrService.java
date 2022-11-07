package com.odh.address.addr.service;

import com.odh.address.entity.TbAddr;
import com.odh.address.repository.TbAddrRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddrService {

    private final TbAddrRepository tbAddrRepository;

    public void insertAddr(TbAddr tbAddr) {
        tbAddrRepository.save(tbAddr);
    }
}
