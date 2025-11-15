package com.example.demo.repository;

import com.example.demo.db.model.KorektaDb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KorektaRepo extends JpaRepository<KorektaDb,Long> {
    List<KorektaDb> findByCyklIdAndPakietId(@Param("cyklId") String cyklId,
                                        @Param("pakietId") String pakietId);
}
