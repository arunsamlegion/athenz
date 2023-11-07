//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.msd;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.yahoo.rdl.*;

//
// KubernetesNetworkPolicyRequest - Request object containing Kubernetes
// network policy inputs
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class KubernetesNetworkPolicyRequest {
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String athenzDomainLabel;
    public String athenzServiceLabel;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String networkPolicyType;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String requestedApiVersion;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String networkPolicyNamespace;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean domainLabelAsNamespaceSelector;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean domainInServiceLabel;

    public KubernetesNetworkPolicyRequest setAthenzDomainLabel(String athenzDomainLabel) {
        this.athenzDomainLabel = athenzDomainLabel;
        return this;
    }
    public String getAthenzDomainLabel() {
        return athenzDomainLabel;
    }
    public KubernetesNetworkPolicyRequest setAthenzServiceLabel(String athenzServiceLabel) {
        this.athenzServiceLabel = athenzServiceLabel;
        return this;
    }
    public String getAthenzServiceLabel() {
        return athenzServiceLabel;
    }
    public KubernetesNetworkPolicyRequest setNetworkPolicyType(String networkPolicyType) {
        this.networkPolicyType = networkPolicyType;
        return this;
    }
    public String getNetworkPolicyType() {
        return networkPolicyType;
    }
    public KubernetesNetworkPolicyRequest setRequestedApiVersion(String requestedApiVersion) {
        this.requestedApiVersion = requestedApiVersion;
        return this;
    }
    public String getRequestedApiVersion() {
        return requestedApiVersion;
    }
    public KubernetesNetworkPolicyRequest setNetworkPolicyNamespace(String networkPolicyNamespace) {
        this.networkPolicyNamespace = networkPolicyNamespace;
        return this;
    }
    public String getNetworkPolicyNamespace() {
        return networkPolicyNamespace;
    }
    public KubernetesNetworkPolicyRequest setDomainLabelAsNamespaceSelector(Boolean domainLabelAsNamespaceSelector) {
        this.domainLabelAsNamespaceSelector = domainLabelAsNamespaceSelector;
        return this;
    }
    public Boolean getDomainLabelAsNamespaceSelector() {
        return domainLabelAsNamespaceSelector;
    }
    public KubernetesNetworkPolicyRequest setDomainInServiceLabel(Boolean domainInServiceLabel) {
        this.domainInServiceLabel = domainInServiceLabel;
        return this;
    }
    public Boolean getDomainInServiceLabel() {
        return domainInServiceLabel;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != KubernetesNetworkPolicyRequest.class) {
                return false;
            }
            KubernetesNetworkPolicyRequest a = (KubernetesNetworkPolicyRequest) another;
            if (athenzDomainLabel == null ? a.athenzDomainLabel != null : !athenzDomainLabel.equals(a.athenzDomainLabel)) {
                return false;
            }
            if (athenzServiceLabel == null ? a.athenzServiceLabel != null : !athenzServiceLabel.equals(a.athenzServiceLabel)) {
                return false;
            }
            if (networkPolicyType == null ? a.networkPolicyType != null : !networkPolicyType.equals(a.networkPolicyType)) {
                return false;
            }
            if (requestedApiVersion == null ? a.requestedApiVersion != null : !requestedApiVersion.equals(a.requestedApiVersion)) {
                return false;
            }
            if (networkPolicyNamespace == null ? a.networkPolicyNamespace != null : !networkPolicyNamespace.equals(a.networkPolicyNamespace)) {
                return false;
            }
            if (domainLabelAsNamespaceSelector == null ? a.domainLabelAsNamespaceSelector != null : !domainLabelAsNamespaceSelector.equals(a.domainLabelAsNamespaceSelector)) {
                return false;
            }
            if (domainInServiceLabel == null ? a.domainInServiceLabel != null : !domainInServiceLabel.equals(a.domainInServiceLabel)) {
                return false;
            }
        }
        return true;
    }
}
