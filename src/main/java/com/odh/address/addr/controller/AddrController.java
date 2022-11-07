package com.odh.address.addr.controller;

import com.odh.address.addr.service.AddrService;
import com.odh.address.entity.TbAddr;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/addr")
@RequiredArgsConstructor
public class AddrController {
    private final AddrService addrService;

    @PostMapping("/new")
    public void insertAddr(@RequestBody TbAddr tbAddr) {
        addrService.insertAddr(tbAddr);
    }
}
