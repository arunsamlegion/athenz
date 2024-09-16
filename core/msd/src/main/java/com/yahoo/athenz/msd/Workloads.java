//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.msd;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import com.yahoo.rdl.*;

//
// Workloads - list of workloads
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class Workloads {
    public List<Workload> workloadList;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<DynamicWorkload> dynamicWorkloadList;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<StaticWorkload> staticWorkloadList;

    public Workloads setWorkloadList(List<Workload> workloadList) {
        this.workloadList = workloadList;
        return this;
    }
    public List<Workload> getWorkloadList() {
        return workloadList;
    }
    public Workloads setDynamicWorkloadList(List<DynamicWorkload> dynamicWorkloadList) {
        this.dynamicWorkloadList = dynamicWorkloadList;
        return this;
    }
    public List<DynamicWorkload> getDynamicWorkloadList() {
        return dynamicWorkloadList;
    }
    public Workloads setStaticWorkloadList(List<StaticWorkload> staticWorkloadList) {
        this.staticWorkloadList = staticWorkloadList;
        return this;
    }
    public List<StaticWorkload> getStaticWorkloadList() {
        return staticWorkloadList;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Workloads.class) {
                return false;
            }
            Workloads a = (Workloads) another;
            if (workloadList == null ? a.workloadList != null : !workloadList.equals(a.workloadList)) {
                return false;
            }
            if (dynamicWorkloadList == null ? a.dynamicWorkloadList != null : !dynamicWorkloadList.equals(a.dynamicWorkloadList)) {
                return false;
            }
            if (staticWorkloadList == null ? a.staticWorkloadList != null : !staticWorkloadList.equals(a.staticWorkloadList)) {
                return false;
            }
        }
        return true;
    }
}
