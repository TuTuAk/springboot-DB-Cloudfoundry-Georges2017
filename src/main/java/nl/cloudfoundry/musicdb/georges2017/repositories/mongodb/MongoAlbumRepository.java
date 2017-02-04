package nl.cloudfoundry.musicdb.georges2017.repositories.mongodb;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import nl.cloudfoundry.musicdb.georges2017.domain.Album;

@Repository
@Profile("mongodb")
public interface MongoAlbumRepository extends MongoRepository<Album, String> {
}