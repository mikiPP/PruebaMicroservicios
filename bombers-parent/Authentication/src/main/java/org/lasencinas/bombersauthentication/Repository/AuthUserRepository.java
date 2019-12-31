package org.lasencinas.bombersauthentication.Repository;

import org.lasencinas.bombersauthentication.Model.Domain.AuthUser.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {

    Optional<AuthUser> findByEmail(String email);


}