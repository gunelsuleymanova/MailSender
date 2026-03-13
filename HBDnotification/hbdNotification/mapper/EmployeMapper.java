package com.example.HBDnotification.hbdNotification.mapper;

import com.example.HBDnotification.hbdNotification.dao.entity.EmployeeEntity;
import com.example.HBDnotification.hbdNotification.dto.EmployeRequestDto;
import com.example.HBDnotification.hbdNotification.dto.EmployeResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeMapper {



    EmployeeEntity dtoToEntity(EmployeRequestDto e);
    EmployeResponseDto entityToDto(EmployeeEntity e);
}
