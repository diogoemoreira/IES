package pt.ies.lab3_3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import pt.ies.lab3_3.entities.IssueReport;

import java.util.List;

public interface IssueRepository extends JpaRepository<IssueReport, Long>{
    /*
IssueRepository provides now already the functionality to

    fetch all the entries from the database

    add new entries

    do all basic CRUD operations.
*/

    //To fetch all entries which are not marked private can be done by adding a method using a custom query.
    @Query(value = "SELECT i FROM IssueReport i WHERE markedAsPrivate = false")
    List<IssueReport> findAllButPrivate();

    List<IssueReport> findAllByEmail(String email);
}
