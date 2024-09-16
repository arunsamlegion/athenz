//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.msd;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yahoo.rdl.*;

//
// TransportPolicySubjectSelectorRequirement - A subject selector requirement
// is a selector that contains value, a key, and an operator that relates the
// key and value.
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransportPolicySubjectSelectorRequirement {
    public String key;
    public String operator;
    public String value;

    public TransportPolicySubjectSelectorRequirement setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return key;
    }
    public TransportPolicySubjectSelectorRequirement setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return operator;
    }
    public TransportPolicySubjectSelectorRequirement setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != TransportPolicySubjectSelectorRequirement.class) {
                return false;
            }
            TransportPolicySubjectSelectorRequirement a = (TransportPolicySubjectSelectorRequirement) another;
            if (key == null ? a.key != null : !key.equals(a.key)) {
                return false;
            }
            if (operator == null ? a.operator != null : !operator.equals(a.operator)) {
                return false;
            }
            if (value == null ? a.value != null : !value.equals(a.value)) {
                return false;
            }
        }
        return true;
    }
}
