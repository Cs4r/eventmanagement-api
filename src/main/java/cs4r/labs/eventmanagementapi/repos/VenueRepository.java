package cs4r.labs.eventmanagementapi.repos;

import cs4r.labs.eventmanagementapi.entities.Venue;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {
}
