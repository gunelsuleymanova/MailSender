package com.example.HBDnotification.hbdNotification.dao.repos;

import com.example.HBDnotification.hbdNotification.dao.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
    @Query("""
       SELECT u
       FROM EmployeeEntity u
       WHERE MONTH(u.dob) = :month
       AND DAY(u.dob) = :day
       """)
    List<EmployeeEntity> findUsersWithBirthday(@Param("month") int month,
                                     @Param("day") int day);
}
