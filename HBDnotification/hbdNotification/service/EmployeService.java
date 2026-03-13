package com.example.HBDnotification.hbdNotification.service;

import com.example.HBDnotification.hbdNotification.dao.entity.EmployeeEntity;
import com.example.HBDnotification.hbdNotification.dao.repos.EmployeeRepository;
import com.example.HBDnotification.hbdNotification.dto.EmployeRequestDto;
import com.example.HBDnotification.hbdNotification.dto.EmployeResponseDto;
import com.example.HBDnotification.hbdNotification.mapper.EmployeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeService {
    private final EmployeMapper employeMapper;
    private final EmployeeRepository employeeRepository;
    private final EmailService emailService;




    public void saveEmploye(EmployeRequestDto e){
        employeeRepository.save(employeMapper.dtoToEntity(e));
    }

    public EmployeResponseDto getemploye(Long id){
        return  null;
    }

    public void sendmail(){
        var doi = LocalDate.now();
        int dom= doi.getMonth().getValue();
        int dog= doi.getDayOfMonth();

        List<EmployeeEntity> user = employeeRepository.findUsersWithBirthday(dom,dog); // dogum gunu olanlar

        for(EmployeeEntity e:user){
            e.setAge(e.getAge() + 1);
            emailService.sendMailService(e.getEmail(),"DOGUM GUNU",String.format("salam hormetli %s emekdasimiz sizi dogum gunu munasibeti ile %s. ad gununuzu butun sirket adindan tebrik edirik size isinizde ugurlar arzu edirik.",e.getName(),e.getAge()));
        }

        employeeRepository.saveAll(user);


    }





}
