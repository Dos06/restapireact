package com.restapi.restapireact.repositories;

import com.restapi.restapireact.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    RoleEntity findByRole(String name);
}
