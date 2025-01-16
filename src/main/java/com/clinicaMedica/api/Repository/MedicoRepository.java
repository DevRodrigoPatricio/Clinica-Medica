package com.clinicaMedica.api.Repository;

import com.clinicaMedica.api.Domain.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico,Long> {
}
