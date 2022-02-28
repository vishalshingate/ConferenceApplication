package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Registration;
import com.pluralsight.conference.model.RegistrationReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration,Long> {
    Registration save(Registration registration);

    List<RegistrationReport> registrationReport();

}
