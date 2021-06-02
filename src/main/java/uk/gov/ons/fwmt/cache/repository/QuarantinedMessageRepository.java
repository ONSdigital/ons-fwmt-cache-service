package uk.gov.ons.fwmt.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.gov.ons.fwmt.cache.data.QuarantinedMessage;

import java.util.UUID;

public interface QuarantinedMessageRepository extends JpaRepository<QuarantinedMessage, UUID> {

}
