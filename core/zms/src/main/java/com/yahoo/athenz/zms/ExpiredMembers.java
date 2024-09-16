//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import com.yahoo.rdl.*;

//
// ExpiredMembers -
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpiredMembers {
    public List<ExpiryMember> expiredRoleMembers;
    public List<ExpiryMember> expiredGroupMembers;

    public ExpiredMembers setExpiredRoleMembers(List<ExpiryMember> expiredRoleMembers) {
        this.expiredRoleMembers = expiredRoleMembers;
        return this;
    }
    public List<ExpiryMember> getExpiredRoleMembers() {
        return expiredRoleMembers;
    }
    public ExpiredMembers setExpiredGroupMembers(List<ExpiryMember> expiredGroupMembers) {
        this.expiredGroupMembers = expiredGroupMembers;
        return this;
    }
    public List<ExpiryMember> getExpiredGroupMembers() {
        return expiredGroupMembers;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != ExpiredMembers.class) {
                return false;
            }
            ExpiredMembers a = (ExpiredMembers) another;
            if (expiredRoleMembers == null ? a.expiredRoleMembers != null : !expiredRoleMembers.equals(a.expiredRoleMembers)) {
                return false;
            }
            if (expiredGroupMembers == null ? a.expiredGroupMembers != null : !expiredGroupMembers.equals(a.expiredGroupMembers)) {
                return false;
            }
        }
        return true;
    }
}
