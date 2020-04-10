package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.musicStore.model.Popular;

@Repository
public interface PopularRepository extends JpaRepository<Popular, Integer> {

}

