package cs4r.labs.eventmanagementapi.repos;

import cs4r.labs.eventmanagementapi.entities.Organizer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {
}
