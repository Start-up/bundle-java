package com.akveo.bundlejava.authentication.resetpassword;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestorePasswordTokenRepository extends JpaRepository<RestorePasswordToken, Long> {

    RestorePasswordToken findByToken(String token);
}