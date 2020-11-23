package com.itdfq.houtai.service;

import com.itdfq.houtai.dao.AuthorityMapper;
import com.itdfq.houtai.model.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityService {

    public void addAuthority(List<Authority> ls){
        this.authorityMapper.insert(ls);
    }

    public void removeAuthortiy(List<Authority> ls){
        this.authorityMapper.delete(ls);
     }

    @Autowired
    private AuthorityMapper authorityMapper;
}

