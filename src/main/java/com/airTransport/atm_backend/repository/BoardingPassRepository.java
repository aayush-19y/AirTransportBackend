package com.airTransport.atm_backend.repository;

import com.airTransport.atm_backend.model.BoardingPass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardingPassRepository extends JpaRepository<BoardingPass, Long> {
}
