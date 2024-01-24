package com.jeunice.iWak.auth;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicationUserDAO {

    Optional<ApplicationUser> selectApplicationUserByUsernanme(String username);
}
