//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yahoo.rdl.*;

//
// DomainOptions - A domain options for enforcing uniqueness checks
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class DomainOptions {
    public boolean enforceUniqueProductIds;
    public boolean enforceUniqueAWSAccounts;
    public boolean enforceUniqueAzureSubscriptions;
    public boolean enforceUniqueGCPProjects;

    public DomainOptions setEnforceUniqueProductIds(boolean enforceUniqueProductIds) {
        this.enforceUniqueProductIds = enforceUniqueProductIds;
        return this;
    }
    public boolean getEnforceUniqueProductIds() {
        return enforceUniqueProductIds;
    }
    public DomainOptions setEnforceUniqueAWSAccounts(boolean enforceUniqueAWSAccounts) {
        this.enforceUniqueAWSAccounts = enforceUniqueAWSAccounts;
        return this;
    }
    public boolean getEnforceUniqueAWSAccounts() {
        return enforceUniqueAWSAccounts;
    }
    public DomainOptions setEnforceUniqueAzureSubscriptions(boolean enforceUniqueAzureSubscriptions) {
        this.enforceUniqueAzureSubscriptions = enforceUniqueAzureSubscriptions;
        return this;
    }
    public boolean getEnforceUniqueAzureSubscriptions() {
        return enforceUniqueAzureSubscriptions;
    }
    public DomainOptions setEnforceUniqueGCPProjects(boolean enforceUniqueGCPProjects) {
        this.enforceUniqueGCPProjects = enforceUniqueGCPProjects;
        return this;
    }
    public boolean getEnforceUniqueGCPProjects() {
        return enforceUniqueGCPProjects;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != DomainOptions.class) {
                return false;
            }
            DomainOptions a = (DomainOptions) another;
            if (enforceUniqueProductIds != a.enforceUniqueProductIds) {
                return false;
            }
            if (enforceUniqueAWSAccounts != a.enforceUniqueAWSAccounts) {
                return false;
            }
            if (enforceUniqueAzureSubscriptions != a.enforceUniqueAzureSubscriptions) {
                return false;
            }
            if (enforceUniqueGCPProjects != a.enforceUniqueGCPProjects) {
                return false;
            }
        }
        return true;
    }
}
