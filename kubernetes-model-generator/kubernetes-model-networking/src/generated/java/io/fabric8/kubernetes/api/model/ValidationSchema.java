
package io.fabric8.kubernetes.api.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicy;
import io.fabric8.kubernetes.api.model.networking.v1.NetworkPolicyList;
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ClusterCIDR;
import io.fabric8.kubernetes.api.model.networking.v1alpha1.ClusterCIDRList;
import io.fabric8.kubernetes.api.model.version.Info;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "APIGroup",
    "APIGroupList",
    "BaseKubernetesList",
    "CreateOptions",
    "DeleteOptions",
    "GetOptions",
    "Info",
    "Ingress",
    "IngressClass",
    "IngressClassList",
    "IngressList",
    "ListOptions",
    "NetworkPolicy",
    "NetworkPolicyList",
    "ObjectMeta",
    "ObjectReference",
    "Patch",
    "PatchOptions",
    "Quantity",
    "RootPaths",
    "Status",
    "Time",
    "TypeMeta",
    "UpdateOptions",
    "V1Alpha1ClusterCIDR",
    "V1Alpha1ClusterCIDRList",
    "V1Ingress",
    "V1IngressClass",
    "V1IngressClassList",
    "V1IngressList"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
public class ValidationSchema {

    @JsonProperty("APIGroup")
    private APIGroup aPIGroup;
    @JsonProperty("APIGroupList")
    private APIGroupList aPIGroupList;
    @JsonProperty("BaseKubernetesList")
    private BaseKubernetesList baseKubernetesList;
    @JsonProperty("CreateOptions")
    private CreateOptions createOptions;
    @JsonProperty("DeleteOptions")
    private DeleteOptions deleteOptions;
    @JsonProperty("GetOptions")
    private GetOptions getOptions;
    @JsonProperty("Info")
    private Info info;
    @JsonProperty("Ingress")
    private io.fabric8.kubernetes.api.model.networking.v1beta1.Ingress ingress;
    @JsonProperty("IngressClass")
    private io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClass ingressClass;
    @JsonProperty("IngressClassList")
    private io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClassList ingressClassList;
    @JsonProperty("IngressList")
    private io.fabric8.kubernetes.api.model.networking.v1beta1.IngressList ingressList;
    @JsonProperty("ListOptions")
    private ListOptions listOptions;
    @JsonProperty("NetworkPolicy")
    private NetworkPolicy networkPolicy;
    @JsonProperty("NetworkPolicyList")
    private NetworkPolicyList networkPolicyList;
    @JsonProperty("ObjectMeta")
    private io.fabric8.kubernetes.api.model.ObjectMeta objectMeta;
    @JsonProperty("ObjectReference")
    private io.fabric8.kubernetes.api.model.ObjectReference objectReference;
    @JsonProperty("Patch")
    private Patch patch;
    @JsonProperty("PatchOptions")
    private PatchOptions patchOptions;
    @JsonProperty("Quantity")
    private Quantity quantity;
    @JsonProperty("RootPaths")
    private RootPaths rootPaths;
    @JsonProperty("Status")
    private Status status;
    @JsonProperty("Time")
    private String time;
    @JsonProperty("TypeMeta")
    private TypeMeta typeMeta;
    @JsonProperty("UpdateOptions")
    private UpdateOptions updateOptions;
    @JsonProperty("V1Alpha1ClusterCIDR")
    private ClusterCIDR v1Alpha1ClusterCIDR;
    @JsonProperty("V1Alpha1ClusterCIDRList")
    private ClusterCIDRList v1Alpha1ClusterCIDRList;
    @JsonProperty("V1Ingress")
    private io.fabric8.kubernetes.api.model.networking.v1.Ingress v1Ingress;
    @JsonProperty("V1IngressClass")
    private io.fabric8.kubernetes.api.model.networking.v1.IngressClass v1IngressClass;
    @JsonProperty("V1IngressClassList")
    private io.fabric8.kubernetes.api.model.networking.v1.IngressClassList v1IngressClassList;
    @JsonProperty("V1IngressList")
    private io.fabric8.kubernetes.api.model.networking.v1.IngressList v1IngressList;
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ValidationSchema() {
    }

    /**
     * 
     * @param listOptions
     * @param aPIGroupList
     * @param ingressList
     * @param baseKubernetesList
     * @param ingressClass
     * @param updateOptions
     * @param patch
     * @param v1Alpha1ClusterCIDR
     * @param ingressClassList
     * @param rootPaths
     * @param v1Ingress
     * @param info
     * @param patchOptions
     * @param deleteOptions
     * @param quantity
     * @param networkPolicyList
     * @param networkPolicy
     * @param objectReference
     * @param createOptions
     * @param v1Alpha1ClusterCIDRList
     * @param aPIGroup
     * @param ingress
     * @param typeMeta
     * @param objectMeta
     * @param getOptions
     * @param time
     * @param v1IngressClass
     * @param v1IngressClassList
     * @param v1IngressList
     * @param status
     */
    public ValidationSchema(APIGroup aPIGroup, APIGroupList aPIGroupList, BaseKubernetesList baseKubernetesList, CreateOptions createOptions, DeleteOptions deleteOptions, GetOptions getOptions, Info info, io.fabric8.kubernetes.api.model.networking.v1beta1.Ingress ingress, io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClass ingressClass, io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClassList ingressClassList, io.fabric8.kubernetes.api.model.networking.v1beta1.IngressList ingressList, ListOptions listOptions, NetworkPolicy networkPolicy, NetworkPolicyList networkPolicyList, io.fabric8.kubernetes.api.model.ObjectMeta objectMeta, io.fabric8.kubernetes.api.model.ObjectReference objectReference, Patch patch, PatchOptions patchOptions, Quantity quantity, RootPaths rootPaths, Status status, String time, TypeMeta typeMeta, UpdateOptions updateOptions, ClusterCIDR v1Alpha1ClusterCIDR, ClusterCIDRList v1Alpha1ClusterCIDRList, io.fabric8.kubernetes.api.model.networking.v1.Ingress v1Ingress, io.fabric8.kubernetes.api.model.networking.v1.IngressClass v1IngressClass, io.fabric8.kubernetes.api.model.networking.v1.IngressClassList v1IngressClassList, io.fabric8.kubernetes.api.model.networking.v1.IngressList v1IngressList) {
        super();
        this.aPIGroup = aPIGroup;
        this.aPIGroupList = aPIGroupList;
        this.baseKubernetesList = baseKubernetesList;
        this.createOptions = createOptions;
        this.deleteOptions = deleteOptions;
        this.getOptions = getOptions;
        this.info = info;
        this.ingress = ingress;
        this.ingressClass = ingressClass;
        this.ingressClassList = ingressClassList;
        this.ingressList = ingressList;
        this.listOptions = listOptions;
        this.networkPolicy = networkPolicy;
        this.networkPolicyList = networkPolicyList;
        this.objectMeta = objectMeta;
        this.objectReference = objectReference;
        this.patch = patch;
        this.patchOptions = patchOptions;
        this.quantity = quantity;
        this.rootPaths = rootPaths;
        this.status = status;
        this.time = time;
        this.typeMeta = typeMeta;
        this.updateOptions = updateOptions;
        this.v1Alpha1ClusterCIDR = v1Alpha1ClusterCIDR;
        this.v1Alpha1ClusterCIDRList = v1Alpha1ClusterCIDRList;
        this.v1Ingress = v1Ingress;
        this.v1IngressClass = v1IngressClass;
        this.v1IngressClassList = v1IngressClassList;
        this.v1IngressList = v1IngressList;
    }

    @JsonProperty("APIGroup")
    public APIGroup getAPIGroup() {
        return aPIGroup;
    }

    @JsonProperty("APIGroup")
    public void setAPIGroup(APIGroup aPIGroup) {
        this.aPIGroup = aPIGroup;
    }

    @JsonProperty("APIGroupList")
    public APIGroupList getAPIGroupList() {
        return aPIGroupList;
    }

    @JsonProperty("APIGroupList")
    public void setAPIGroupList(APIGroupList aPIGroupList) {
        this.aPIGroupList = aPIGroupList;
    }

    @JsonProperty("BaseKubernetesList")
    public BaseKubernetesList getBaseKubernetesList() {
        return baseKubernetesList;
    }

    @JsonProperty("BaseKubernetesList")
    public void setBaseKubernetesList(BaseKubernetesList baseKubernetesList) {
        this.baseKubernetesList = baseKubernetesList;
    }

    @JsonProperty("CreateOptions")
    public CreateOptions getCreateOptions() {
        return createOptions;
    }

    @JsonProperty("CreateOptions")
    public void setCreateOptions(CreateOptions createOptions) {
        this.createOptions = createOptions;
    }

    @JsonProperty("DeleteOptions")
    public DeleteOptions getDeleteOptions() {
        return deleteOptions;
    }

    @JsonProperty("DeleteOptions")
    public void setDeleteOptions(DeleteOptions deleteOptions) {
        this.deleteOptions = deleteOptions;
    }

    @JsonProperty("GetOptions")
    public GetOptions getGetOptions() {
        return getOptions;
    }

    @JsonProperty("GetOptions")
    public void setGetOptions(GetOptions getOptions) {
        this.getOptions = getOptions;
    }

    @JsonProperty("Info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("Info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("Ingress")
    public io.fabric8.kubernetes.api.model.networking.v1beta1.Ingress getIngress() {
        return ingress;
    }

    @JsonProperty("Ingress")
    public void setIngress(io.fabric8.kubernetes.api.model.networking.v1beta1.Ingress ingress) {
        this.ingress = ingress;
    }

    @JsonProperty("IngressClass")
    public io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClass getIngressClass() {
        return ingressClass;
    }

    @JsonProperty("IngressClass")
    public void setIngressClass(io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClass ingressClass) {
        this.ingressClass = ingressClass;
    }

    @JsonProperty("IngressClassList")
    public io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClassList getIngressClassList() {
        return ingressClassList;
    }

    @JsonProperty("IngressClassList")
    public void setIngressClassList(io.fabric8.kubernetes.api.model.networking.v1beta1.IngressClassList ingressClassList) {
        this.ingressClassList = ingressClassList;
    }

    @JsonProperty("IngressList")
    public io.fabric8.kubernetes.api.model.networking.v1beta1.IngressList getIngressList() {
        return ingressList;
    }

    @JsonProperty("IngressList")
    public void setIngressList(io.fabric8.kubernetes.api.model.networking.v1beta1.IngressList ingressList) {
        this.ingressList = ingressList;
    }

    @JsonProperty("ListOptions")
    public ListOptions getListOptions() {
        return listOptions;
    }

    @JsonProperty("ListOptions")
    public void setListOptions(ListOptions listOptions) {
        this.listOptions = listOptions;
    }

    @JsonProperty("NetworkPolicy")
    public NetworkPolicy getNetworkPolicy() {
        return networkPolicy;
    }

    @JsonProperty("NetworkPolicy")
    public void setNetworkPolicy(NetworkPolicy networkPolicy) {
        this.networkPolicy = networkPolicy;
    }

    @JsonProperty("NetworkPolicyList")
    public NetworkPolicyList getNetworkPolicyList() {
        return networkPolicyList;
    }

    @JsonProperty("NetworkPolicyList")
    public void setNetworkPolicyList(NetworkPolicyList networkPolicyList) {
        this.networkPolicyList = networkPolicyList;
    }

    @JsonProperty("ObjectMeta")
    public io.fabric8.kubernetes.api.model.ObjectMeta getObjectMeta() {
        return objectMeta;
    }

    @JsonProperty("ObjectMeta")
    public void setObjectMeta(io.fabric8.kubernetes.api.model.ObjectMeta objectMeta) {
        this.objectMeta = objectMeta;
    }

    @JsonProperty("ObjectReference")
    public io.fabric8.kubernetes.api.model.ObjectReference getObjectReference() {
        return objectReference;
    }

    @JsonProperty("ObjectReference")
    public void setObjectReference(io.fabric8.kubernetes.api.model.ObjectReference objectReference) {
        this.objectReference = objectReference;
    }

    @JsonProperty("Patch")
    public Patch getPatch() {
        return patch;
    }

    @JsonProperty("Patch")
    public void setPatch(Patch patch) {
        this.patch = patch;
    }

    @JsonProperty("PatchOptions")
    public PatchOptions getPatchOptions() {
        return patchOptions;
    }

    @JsonProperty("PatchOptions")
    public void setPatchOptions(PatchOptions patchOptions) {
        this.patchOptions = patchOptions;
    }

    @JsonProperty("Quantity")
    public Quantity getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("RootPaths")
    public RootPaths getRootPaths() {
        return rootPaths;
    }

    @JsonProperty("RootPaths")
    public void setRootPaths(RootPaths rootPaths) {
        this.rootPaths = rootPaths;
    }

    @JsonProperty("Status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("Time")
    public String getTime() {
        return time;
    }

    @JsonProperty("Time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("TypeMeta")
    public TypeMeta getTypeMeta() {
        return typeMeta;
    }

    @JsonProperty("TypeMeta")
    public void setTypeMeta(TypeMeta typeMeta) {
        this.typeMeta = typeMeta;
    }

    @JsonProperty("UpdateOptions")
    public UpdateOptions getUpdateOptions() {
        return updateOptions;
    }

    @JsonProperty("UpdateOptions")
    public void setUpdateOptions(UpdateOptions updateOptions) {
        this.updateOptions = updateOptions;
    }

    @JsonProperty("V1Alpha1ClusterCIDR")
    public ClusterCIDR getV1Alpha1ClusterCIDR() {
        return v1Alpha1ClusterCIDR;
    }

    @JsonProperty("V1Alpha1ClusterCIDR")
    public void setV1Alpha1ClusterCIDR(ClusterCIDR v1Alpha1ClusterCIDR) {
        this.v1Alpha1ClusterCIDR = v1Alpha1ClusterCIDR;
    }

    @JsonProperty("V1Alpha1ClusterCIDRList")
    public ClusterCIDRList getV1Alpha1ClusterCIDRList() {
        return v1Alpha1ClusterCIDRList;
    }

    @JsonProperty("V1Alpha1ClusterCIDRList")
    public void setV1Alpha1ClusterCIDRList(ClusterCIDRList v1Alpha1ClusterCIDRList) {
        this.v1Alpha1ClusterCIDRList = v1Alpha1ClusterCIDRList;
    }

    @JsonProperty("V1Ingress")
    public io.fabric8.kubernetes.api.model.networking.v1.Ingress getV1Ingress() {
        return v1Ingress;
    }

    @JsonProperty("V1Ingress")
    public void setV1Ingress(io.fabric8.kubernetes.api.model.networking.v1.Ingress v1Ingress) {
        this.v1Ingress = v1Ingress;
    }

    @JsonProperty("V1IngressClass")
    public io.fabric8.kubernetes.api.model.networking.v1.IngressClass getV1IngressClass() {
        return v1IngressClass;
    }

    @JsonProperty("V1IngressClass")
    public void setV1IngressClass(io.fabric8.kubernetes.api.model.networking.v1.IngressClass v1IngressClass) {
        this.v1IngressClass = v1IngressClass;
    }

    @JsonProperty("V1IngressClassList")
    public io.fabric8.kubernetes.api.model.networking.v1.IngressClassList getV1IngressClassList() {
        return v1IngressClassList;
    }

    @JsonProperty("V1IngressClassList")
    public void setV1IngressClassList(io.fabric8.kubernetes.api.model.networking.v1.IngressClassList v1IngressClassList) {
        this.v1IngressClassList = v1IngressClassList;
    }

    @JsonProperty("V1IngressList")
    public io.fabric8.kubernetes.api.model.networking.v1.IngressList getV1IngressList() {
        return v1IngressList;
    }

    @JsonProperty("V1IngressList")
    public void setV1IngressList(io.fabric8.kubernetes.api.model.networking.v1.IngressList v1IngressList) {
        this.v1IngressList = v1IngressList;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
