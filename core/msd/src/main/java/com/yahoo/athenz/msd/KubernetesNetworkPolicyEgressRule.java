//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.msd;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import com.yahoo.rdl.*;

//
// KubernetesNetworkPolicyEgressRule - Kubernetes network policy egress rule
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class KubernetesNetworkPolicyEgressRule {
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<KubernetesNetworkPolicyPeer> to;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<KubernetesNetworkPolicyPort> ports;

    public KubernetesNetworkPolicyEgressRule setTo(List<KubernetesNetworkPolicyPeer> to) {
        this.to = to;
        return this;
    }
    public List<KubernetesNetworkPolicyPeer> getTo() {
        return to;
    }
    public KubernetesNetworkPolicyEgressRule setPorts(List<KubernetesNetworkPolicyPort> ports) {
        this.ports = ports;
        return this;
    }
    public List<KubernetesNetworkPolicyPort> getPorts() {
        return ports;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != KubernetesNetworkPolicyEgressRule.class) {
                return false;
            }
            KubernetesNetworkPolicyEgressRule a = (KubernetesNetworkPolicyEgressRule) another;
            if (to == null ? a.to != null : !to.equals(a.to)) {
                return false;
            }
            if (ports == null ? a.ports != null : !ports.equals(a.ports)) {
                return false;
            }
        }
        return true;
    }
}
