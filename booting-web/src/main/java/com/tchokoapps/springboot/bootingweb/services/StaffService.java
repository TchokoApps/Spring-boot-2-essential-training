package com.tchokoapps.springboot.bootingweb.services;

import com.tchokoapps.springboot.bootingweb.models.Position;
import com.tchokoapps.springboot.bootingweb.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {

    private static List<StaffMember> staffMembers = new ArrayList<>();

    static {
        staffMembers.add(new StaffMember(1L, UUID.randomUUID().toString(), "Jack", "Olivier", Position.CONCIERGE));
        staffMembers.add(new StaffMember(2L, UUID.randomUUID().toString(), "Bill", "Fos", Position.FRONT_DESK));
        staffMembers.add(new StaffMember(3L, UUID.randomUUID().toString(), "Yves", "Tsachoua", Position.HOUSEKEEPING));
        staffMembers.add(new StaffMember(4L, UUID.randomUUID().toString(), "Fabrice", "Ngam", Position.SECURITY));
        staffMembers.add(new StaffMember(5L, UUID.randomUUID().toString(), "Tientcheu", "Tchokouaha", Position.CONCIERGE));
    }

    public List<StaffMember> getStaffAllMembers() {
        return staffMembers;
    }
}
