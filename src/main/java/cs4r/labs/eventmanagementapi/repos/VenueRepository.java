package cs4r.labs.eventmanagementapi.repos;

import cs4r.labs.eventmanagementapi.entities.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<Venue, Long> {
}
