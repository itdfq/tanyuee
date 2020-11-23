package com.itdfq.houtai.dao;

import com.itdfq.houtai.model.Authority;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorityMapper {

    void insert(List<Authority> ls);

    void delete(List<Authority> ls);

}
