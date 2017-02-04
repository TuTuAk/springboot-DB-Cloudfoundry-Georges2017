package nl.cloudfoundry.musicdb.georges2017.repositories.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nl.cloudfoundry.musicdb.georges2017.domain.Album;

@Repository
@Profile({"in-memory", "mysql", "postgres", "oracle", "sqlserver"})
public interface JpaAlbumRepository extends JpaRepository<Album, String> {
}
