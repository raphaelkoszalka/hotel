package com.raphael.hotel.core.bos;

import com.raphael.hotel.persistence.entities.CheckInEntity;
import com.raphael.hotel.persistence.repositories.CheckInRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckInBO {

    private final CheckInRepository checkInRepository;

    @Autowired
    public CheckInBO(final CheckInRepository checkInRepository) {
        this.checkInRepository = checkInRepository;
    }

    public List<CheckInEntity> findAll() {
        return checkInRepository.findAll();
    }

    public void save(CheckInEntity data) {
        checkInRepository.save(data);
    }

    public CheckInEntity getCheckInById(Long id) {
        return checkInRepository.getCheckInById(id);
    }

}
